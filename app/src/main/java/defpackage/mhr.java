package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mhr {
    public final mhp a;
    public final mhp b;

    public mhr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhr) {
            mhr mhrVar = (mhr) obj;
            if (this.a.equals(mhrVar.a) && this.b.equals(mhrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        mhp mhpVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(mhpVar) + "}";
    }

    public mhr(mhp mhpVar, mhp mhpVar2) {
        this.a = mhpVar;
        this.b = mhpVar2;
    }
}
