package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmy extends byi {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final bli e;

    public /* synthetic */ bmy(float f, float f2, int i, int i2, int i3) {
        super((char[]) null);
        this.a = 1 == (i3 & 1) ? 0.0f : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmy)) {
            return false;
        }
        bmy bmyVar = (bmy) obj;
        if (this.a != bmyVar.a || this.b != bmyVar.b || !a.p(this.c, bmyVar.c) || !a.p(this.d, bmyVar.d)) {
            return false;
        }
        bli bliVar = bmyVar.e;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        int i = this.c;
        boolean zP = a.p(i, 0);
        String str = oUZhwRhE.nrQ;
        sb.append((Object) (zP ? "Butt" : a.p(i, 1) ? "Round" : a.p(i, 2) ? "Square" : str));
        sb.append(", join=");
        int i2 = this.d;
        if (a.p(i2, 0)) {
            str = "Miter";
        } else if (a.p(i2, 1)) {
            str = "Round";
        } else if (a.p(i2, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
