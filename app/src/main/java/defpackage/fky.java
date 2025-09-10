package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fky implements paq {
    public final qko a;
    public final qkr b;

    public fky() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        qkt qktVar = fkz.a;
        this.a.close();
        this.b.close();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fky) {
            fky fkyVar = (fky) obj;
            if (this.a.equals(fkyVar.a) && this.b.equals(fkyVar.b)) {
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
        qkr qkrVar = this.b;
        return "{" + this.a.toString() + ", " + qkrVar.toString() + "}";
    }

    public fky(qko qkoVar, qkr qkrVar) {
        this.a = qkoVar;
        this.b = qkrVar;
    }
}
