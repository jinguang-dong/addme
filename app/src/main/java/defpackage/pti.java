package defpackage;

import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pti {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pti)) {
            return false;
        }
        pti ptiVar = (pti) obj;
        if (!a.ao(this.a, ptiVar.a) || !a.ao(this.b, ptiVar.b)) {
            return false;
        }
        List list = ptiVar.c;
        if (!a.ao(null, null)) {
            return false;
        }
        int i = ptiVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
