package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ere implements eqv {
    private final eux a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public ere(eux euxVar, int i) {
        this.a = euxVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new eqb("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new eqb("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iB = b(this.c);
                int i3 = iB / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new fam(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new eqb("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new eqb("Http request failed", -1);
                    }
                    try {
                        throw new eqb(this.c.getResponseMessage(), iB);
                    } catch (IOException e2) {
                        throw new eqb("Failed to get a response message", iB, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new eqb("Received empty or null redirect url", iB);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    d();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new eqb("Bad redirect url: ".concat(String.valueOf(headerField)), iB, e3);
                }
            } catch (IOException e4) {
                throw new eqb("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new eqb("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.eqv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.eqv
    public final void d() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.eqv
    public final void dE() {
        this.e = true;
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        double d = fas.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            eux euxVar = this.a;
            if (euxVar.f == null) {
                if (TextUtils.isEmpty(euxVar.e)) {
                    String string = euxVar.d;
                    if (TextUtils.isEmpty(string)) {
                        URL url = euxVar.c;
                        eoz.k(url);
                        string = url.toString();
                    }
                    euxVar.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                }
                euxVar.f = new URL(euxVar.e);
            }
            URL url2 = euxVar.f;
            euy euyVar = euxVar.b;
            if (((evb) euyVar).c == null) {
                synchronized (euyVar) {
                    if (((evb) euyVar).c == null) {
                        HashMap map = new HashMap();
                        for (Map.Entry entry : ((evb) euyVar).b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str = ((eva) list.get(i)).a;
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append(str);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            if (!TextUtils.isEmpty(string2)) {
                                map.put((String) entry.getKey(), string2);
                            }
                        }
                        ((evb) euyVar).c = DesugarCollections.unmodifiableMap(map);
                    }
                }
            }
            equVar.b(e(url2, 0, null, ((evb) euyVar).c));
        } catch (IOException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 2;
    }
}
