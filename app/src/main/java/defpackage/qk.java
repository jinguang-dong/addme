package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qk {
    public final xo a;
    public final qb b;

    public qk(xo xoVar, qb qbVar) {
        this.a = xoVar;
        this.b = qbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk)) {
            return false;
        }
        qk qkVar = (qk) obj;
        return a.ao(this.a, qkVar.a) && a.ao(this.b, qkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InputRequest(image=" + this.a + ", frameInfo=" + this.b + ')';
    }
}
