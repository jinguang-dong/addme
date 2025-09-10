package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkv {
    public final int a;
    public final int b;
    public final scn c;
    public final sbp d;

    public lkv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lkv) {
            lkv lkvVar = (lkv) obj;
            if (this.a == lkvVar.a && this.b == lkvVar.b && this.c.equals(lkvVar.c) && ujp.aH(this.d, lkvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        sbp sbpVar = this.d;
        return "{" + this.a + ", " + this.b + ", " + this.c.toString() + ", " + sbpVar.toString() + "}";
    }

    public lkv(int i, int i2, scn scnVar, sbp sbpVar) {
        this.a = i;
        this.b = i2;
        scnVar.getClass();
        this.c = scnVar;
        sbpVar.getClass();
        this.d = sbpVar;
    }
}
