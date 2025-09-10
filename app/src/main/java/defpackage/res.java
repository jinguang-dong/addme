package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class res {
    public final tqr a;
    public final tow b;

    public res() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof res) {
            res resVar = (res) obj;
            if (this.a.equals(resVar.a) && this.b.equals(resVar.b)) {
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
        tow towVar = this.b;
        return "{" + this.a.toString() + ", " + towVar.toString() + "}";
    }

    public res(tqr tqrVar, tow towVar) {
        tqrVar.getClass();
        this.a = tqrVar;
        towVar.getClass();
        this.b = towVar;
    }
}
