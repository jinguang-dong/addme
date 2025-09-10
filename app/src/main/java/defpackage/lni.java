package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lni {
    private final jma a;
    private final int b;

    public lni(int i, jma jmaVar) {
        jmaVar.getClass();
        this.b = i;
        this.a = jmaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lni)) {
            return false;
        }
        lni lniVar = (lni) obj;
        return this.b == lniVar.b && this.a == lniVar.a;
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        return (i * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Assertion(action=");
        sb.append((Object) (this.b != 2 ? "EDITED" : "ENHANCED"));
        sb.append(", digitalSourceType=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
