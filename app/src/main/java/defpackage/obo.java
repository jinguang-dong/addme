package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class obo extends oao {
    public static final byte[] a = "\n".getBytes();
    public final obv c;
    private final String d;

    public obo(oar oarVar) {
        super(oarVar);
        String str = oap.a;
        String str2 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String string = null;
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                string = sb.toString();
            }
        }
        this.d = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str, str2, string, Build.MODEL, Build.ID);
        this.c = new obv();
    }

    private static final void I(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final URL C() {
        try {
            return new URL(obc.f().concat((String) obh.l.f()));
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL D(obj objVar) {
        try {
            return new URL(objVar.e ? obc.f().concat(obc.g()) : obc.h().concat(obc.g()));
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL E(obj objVar, String str) {
        String str2;
        if (objVar.e) {
            str2 = obc.f() + obc.g() + "?" + str;
        } else {
            str2 = obc.h() + obc.g() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final void F(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    o("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    o("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    public final boolean G() {
        NetworkInfo activeNetworkInfo;
        oak.a();
        z();
        try {
            activeNetworkInfo = ((ConnectivityManager) d().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        q("No network connectivity");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(java.net.URL r10, byte[] r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r1 = "Error closing http post connection output stream"
            defpackage.ojl.ay(r11)
            int r0 = r11.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "POST bytes, url"
            r7 = 0
            r3 = 3
            r2 = r9
            r6 = r10
            super.w(r3, r4, r5, r6, r7)
            x()
            r9 = 0
            java.net.HttpURLConnection r10 = r2.c(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L56
            r3 = 1
            r10.setDoOutput(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r10.setFixedLengthStreamingMode(r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r10.connect()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.io.OutputStream r9 = r10.getOutputStream()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r9.write(r11)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r2.F(r10)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            int r11 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 != r0) goto L3f
            oam r11 = r2.f()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r11.c()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r11 = r0
        L3f:
            java.lang.String r0 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r2.m(r0, r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            goto L62
        L49:
            r0 = move-exception
            r11 = r0
            goto L78
        L4c:
            r0 = move-exception
            r11 = r0
            r8 = r10
            r10 = r9
            r9 = r8
            goto L59
        L52:
            r0 = move-exception
            r11 = r0
            r10 = r9
            goto L78
        L56:
            r0 = move-exception
            r11 = r0
            r10 = r9
        L59:
            java.lang.String r0 = "Network POST connection error"
            r2.u(r0, r11)     // Catch: java.lang.Throwable -> L73
            r11 = 0
            r8 = r10
            r10 = r9
            r9 = r8
        L62:
            if (r9 == 0) goto L6d
            r9.close()     // Catch: java.io.IOException -> L68
            goto L6d
        L68:
            r0 = move-exception
            r9 = r0
            r2.o(r1, r9)
        L6d:
            if (r10 == 0) goto L72
            r10.disconnect()
        L72:
            return r11
        L73:
            r0 = move-exception
            r11 = r0
            r8 = r10
            r10 = r9
            r9 = r8
        L78:
            if (r9 == 0) goto L83
            r9.close()     // Catch: java.io.IOException -> L7e
            goto L83
        L7e:
            r0 = move-exception
            r9 = r0
            r2.o(r1, r9)
        L83:
            if (r10 == 0) goto L88
            r10.disconnect()
        L88:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obo.H(java.net.URL, byte[]):int");
    }

    @Override // defpackage.oao
    protected final void a() {
        r("Network initialized. User agent", this.d);
    }

    final String b(obj objVar, boolean z) throws NumberFormatException {
        long j;
        ojl.ay(objVar);
        StringBuilder sb = new StringBuilder();
        try {
            Map map = objVar.a;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    I(sb, str, (String) entry.getValue());
                }
            }
            long j2 = objVar.c;
            I(sb, "ht", String.valueOf(j2));
            I(sb, "qt", String.valueOf(System.currentTimeMillis() - j2));
            if (z) {
                ojl.aw("_s");
                ojl.aq(true, "Short param name required");
                String str2 = (String) map.get("_s");
                try {
                    j = Long.parseLong(str2 != null ? str2 : "0");
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                I(sb, "z", j != 0 ? String.valueOf(j) : String.valueOf(objVar.b));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            this.o("Failed to encode name or value", e);
            return null;
        }
    }

    final HttpURLConnection c(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(((Integer) obh.u.f()).intValue());
        httpURLConnection.setReadTimeout(((Integer) obh.v.f()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }
}
