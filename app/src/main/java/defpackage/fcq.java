package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcq {
    public final sbp a;
    public final sbp b;
    private final int c;
    private final int d;

    public fcq() {
        throw null;
    }

    public final sbp a() {
        return this.a;
    }

    public final sbp b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fcq) {
            fcq fcqVar = (fcq) obj;
            if (ujp.aH(this.a, fcqVar.a) && ujp.aH(this.b, fcqVar.b)) {
                int i = this.c;
                int i2 = fcqVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.d;
                    int i4 = fcqVar.d;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.aQ(i);
        int i2 = this.d;
        a.aQ(i2);
        return i2 ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final String toString() {
        int i = this.c;
        sbp sbpVar = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(sbpVar);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.d;
        return "{" + strValueOf + ", " + strValueOf2 + ", " + string + ", " + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + "}";
    }

    public fcq(sbp sbpVar, sbp sbpVar2, int i, int i2) {
        this.a = sbpVar;
        this.b = sbpVar2;
        this.c = i;
        this.d = i2;
    }
}
