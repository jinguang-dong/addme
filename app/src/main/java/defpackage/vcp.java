package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcp implements vdb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vcp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.vdb
    public final void a() throws IOException {
        List list;
        int i = this.b;
        if (i == 0) {
            vct vctVar = (vct) this.a;
            if (vctVar.i == null) {
                vda vdaVar = vctVar.k;
                vdaVar.l = 10;
                HttpURLConnection httpURLConnection = vctVar.h;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                vdaVar.l = 12;
                vctVar.j = httpURLConnection.getOutputStream();
                vctVar.i = Channels.newChannel(vctVar.j);
            }
            vctVar.a.set(0);
            vctVar.b();
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            vct vctVar2 = (vct) obj;
            vctVar2.c.read((UploadDataSink) obj, vctVar2.d);
            vctVar2.b.execute(new smv(obj, 9));
            return;
        }
        if (i == 2) {
            String str = vda.a;
            ((UploadDataProvider) this.a).close();
            return;
        }
        int i2 = 8;
        Network network = null;
        if (i != 3) {
            if (i != 4) {
                vcy vcyVar = (vcy) this.a;
                vda vdaVar2 = vcyVar.d;
                if (vdaVar2.g.compareAndSet(1, 4)) {
                    vcyVar.a.onResponseStarted(vdaVar2, vdaVar2.o);
                    return;
                }
                return;
            }
            vda vdaVar3 = (vda) this.a;
            if (vdaVar3.q == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String headerField = "http/1.1";
            int i3 = 0;
            while (true) {
                String headerFieldKey = vdaVar3.q.getHeaderFieldKey(i3);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    headerField = vdaVar3.q.getHeaderField(i3);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, vdaVar3.q.getHeaderField(i3)));
                }
                i3++;
            }
            int responseCode = vdaVar3.q.getResponseCode();
            vdi vdiVar = new vdi(new ArrayList(vdaVar3.f), responseCode, vdaVar3.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), headerField);
            if (responseCode >= 300 && responseCode < 400 && (list = (List) vdiVar.getAllHeaders().get("location")) != null) {
                vdaVar3.j(1, 2, new qej(vdaVar3, (String) list.get(0), (UrlResponseInfo) vdiVar, i2));
                return;
            }
            vdaVar3.o = vdiVar;
            vdaVar3.e();
            if (responseCode < 400) {
                vdaVar3.n = vck.a(vdaVar3.q.getInputStream());
                vdaVar3.b.d();
                return;
            } else {
                InputStream errorStream = vdaVar3.q.getErrorStream();
                vdaVar3.n = errorStream != null ? vck.a(errorStream) : null;
                vdaVar3.b.d();
                return;
            }
        }
        vda vdaVar4 = (vda) this.a;
        if (vdaVar4.g.get() == 8) {
            return;
        }
        URL url = new URL(vdaVar4.m);
        HttpURLConnection httpURLConnection2 = vdaVar4.q;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
            vdaVar4.q = null;
        }
        long j = vdaVar4.u;
        if (j == -1) {
            vdaVar4.q = (HttpURLConnection) url.openConnection();
        } else {
            Network[] allNetworks = ((ConnectivityManager) vdaVar4.r.d.getSystemService("connectivity")).getAllNetworks();
            int length = allNetworks.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                Network network2 = allNetworks[i4];
                if (network2.getNetworkHandle() == j) {
                    network = network2;
                    break;
                }
                i4++;
            }
            if (network == null) {
                throw new vdd();
            }
            vdaVar4.q = (HttpURLConnection) network.openConnection(url);
        }
        vdaVar4.q.setInstanceFollowRedirects(false);
        Map map = vdaVar4.e;
        if (!map.containsKey("User-Agent")) {
            map.put("User-Agent", vdaVar4.d);
        }
        for (Map.Entry entry : map.entrySet()) {
            vdaVar4.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        vdaVar4.q.setRequestMethod(vdaVar4.i);
        vdl vdlVar = vdaVar4.j;
        if (vdlVar != null) {
            vdaVar4.y = new vct(vdaVar4, vdaVar4.k, vdaVar4.c, vdaVar4.q, vdlVar);
            vct vctVar3 = vdaVar4.y;
            vctVar3.a(new vcr(vctVar3, vdaVar4.f.size() == 1, 1), "start");
        } else {
            vdaVar4.l = 10;
            vdaVar4.q.connect();
            vdaVar4.g();
        }
    }
}
