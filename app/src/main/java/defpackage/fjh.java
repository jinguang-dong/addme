package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjh implements paq {
    public final poj a;
    public final tcd b;

    public fjh() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fjh) {
            fjh fjhVar = (fjh) obj;
            if (this.a.equals(fjhVar.a) && this.b.equals(fjhVar.b)) {
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
        tcd tcdVar = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(tcdVar) + "}";
    }

    public fjh(poj pojVar, tcd tcdVar) {
        this.a = pojVar;
        tcdVar.getClass();
        this.b = tcdVar;
    }
}
