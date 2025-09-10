package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpy {
    public final int a;
    public final sbp b;
    public final float c;

    public hpy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpy) {
            hpy hpyVar = (hpy) obj;
            if (this.a == hpyVar.a && ujp.aH(this.b, hpyVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(hpyVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        return Float.floatToIntBits(this.c) ^ (iHashCode * 1000003);
    }

    public hpy(int i, sbp sbpVar, float f) {
        this.a = i;
        this.b = sbpVar;
        this.c = f;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.a);
        String str = OPuAVreQM.WiyHtqUxCbhXoD;
        sb.append(str);
        sb.append(strValueOf);
        sb.append(str);
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
