package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eid {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof cni)) {
            return false;
        }
        cni cniVar = (cni) obj;
        return a.K(cniVar.a, this.a) && a.K(cniVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
