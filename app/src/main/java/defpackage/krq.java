package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krq {
    public final krs a;
    public final int b;
    public final int c;
    public final sbp d;

    public krq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krq) {
            krq krqVar = (krq) obj;
            if (this.a.equals(krqVar.a) && this.b == krqVar.b && this.c == krqVar.c && ujp.aH(this.d, krqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        sbp sbpVar = this.d;
        return ((this.c ^ (((iHashCode * 1000003) ^ this.b) * 1000003)) * 1000003) ^ sbpVar.hashCode();
    }

    public final String toString() {
        sbp sbpVar = this.d;
        return "{" + this.a.toString() + ", " + this.b + ", " + this.c + ", " + sbpVar.toString() + "}";
    }

    public krq(krs krsVar, int i, int i2, sbp sbpVar) {
        krsVar.getClass();
        this.a = krsVar;
        this.b = i;
        this.c = i2;
        sbpVar.getClass();
        this.d = sbpVar;
    }
}
