package defpackage;

import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfz {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfz)) {
            return false;
        }
        cfz cfzVar = (cfz) obj;
        if (!a.ao(this.a, cfzVar.a) || !a.ao(this.b, cfzVar.b)) {
            return false;
        }
        List list = cfzVar.c;
        if (!a.ao(null, null)) {
            return false;
        }
        int i = cfzVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
