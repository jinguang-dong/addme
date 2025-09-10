package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmg implements paq {
    public final long a;
    public final foi b;

    public fmg() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fmg) {
            fmg fmgVar = (fmg) obj;
            if (this.a == fmgVar.a && this.b.equals(fmgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public fmg(long j, foi foiVar) {
        this.a = j;
        foiVar.getClass();
        this.b = foiVar;
    }
}
