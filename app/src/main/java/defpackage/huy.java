package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.googlex.gcam.InterleavedImageU16;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huy {
    public final hui a;
    public uiq d;
    public float[] b = null;
    public final pld[] c = null;
    public InterleavedImageU16 e = null;

    public huy(hui huiVar, uiq uiqVar) {
        this.a = huiVar;
        this.d = uiqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huy)) {
            return false;
        }
        huy huyVar = (huy) obj;
        if (!a.ao(this.a, huyVar.a) || !a.ao(this.b, huyVar.b)) {
            return false;
        }
        pld[] pldVarArr = huyVar.c;
        return a.ao(null, null) && a.ao(this.d, huyVar.d) && a.ao(this.e, huyVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        float[] fArr = this.b;
        int iHashCode2 = (((iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 961) + this.d.hashCode()) * 31;
        InterleavedImageU16 interleavedImageU16 = this.e;
        return iHashCode2 + (interleavedImageU16 != null ? interleavedImageU16.hashCode() : 0);
    }

    public final String toString() {
        return "SerengetiShot(session=" + this.a + ", pose=" + Arrays.toString(this.b) + CGlJpiVWrCQOq.vnuCfuQqY + Arrays.toString((Object[]) null) + ", shotCallback=" + this.d + ", mergedPd=" + this.e + ")";
    }
}
