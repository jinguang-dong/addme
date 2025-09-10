package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nxi implements rww {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nxi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, puu] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, qin] */
    @Override // defpackage.rww
    public final Object fr() {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((nxj) this.a).c);
            case 1:
                return this.a;
            case 2:
                return new ole((Activity) this.a);
            case 3:
                return ((ows) this.a).a;
            case 4:
                qaq qaqVar = new qaq((short[]) null);
                for (Map.Entry entry : this.a.entrySet()) {
                    String str = (String) entry.getKey();
                    pxf pxfVar = (pxf) ((rww) entry.getValue()).fr();
                    ?? r3 = qaqVar.a;
                    str.getClass();
                    pxfVar.getClass();
                    r3.put(str, pxfVar);
                }
                return new pxh(qaqVar);
            case 5:
                pux puxVarY = this.a.y();
                return puxVarY == pux.UNDEFINED ? pux.SHARED_PREFERENCES_ONLY : puxVarY;
            case 6:
                return Boolean.valueOf(((qaq) this.a).a() != pux.PROTOSTORE_ONLY);
            case 7:
                ?? r4 = this.a;
                float[] fArr = qjw.a;
                return new qml(qkr.e(r4, qkt.b(qjw.a), qkt.b(qjw.b)));
            case 8:
                return Long.valueOf(Double.valueOf((String) ((qos) this.a).a.fr()).longValue());
            case 9:
                return this.a;
            case 10:
                Context context = (Context) this.a;
                try {
                    return rwc.i(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return rvk.a;
                }
            case 11:
                return Long.valueOf(((qqt) this.a).m.G().getTotalSpace() / 1024);
            case 12:
                return ((qrd) this.a).a();
            case 13:
                return qpm.a(((qtx) this.a).b, "getMemoryUsageMetric");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return (SharedPreferences) ((rwc) this.a).c();
            default:
                return Boolean.valueOf(udl.a.fr().b((Context) this.a));
        }
    }
}
