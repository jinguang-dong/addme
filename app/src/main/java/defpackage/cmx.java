package defpackage;

import android.util.Base64;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmx {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;

    public cmx(String str) {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        this.c = str;
        this.d = null;
        a.I(true);
        this.e = R.array.com_google_android_gms_fonts_certs;
        this.f = a("com.google.android.gms.fonts", "com.google.android.gms", str);
    }

    private static final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append(GdpuLBytnYW.kpkYi);
                sb.append("mCertificatesArray: " + this.e);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public cmx(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        coe.d(list);
        this.d = list;
        this.e = 0;
        this.f = a(str, str2, str3);
    }
}
