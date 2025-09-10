package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class teq implements paq {
    public final float a;
    public final float b;
    public final foi c;

    public teq() {
        throw null;
    }

    public final fnp a() {
        fnp fnpVarDN = this.c.dN();
        txn txnVarD = txn.d(txn.d(rup.n(fnpVarDN), rup.o(fnpVarDN.k()).e().f(this.a / 2.0f)), rup.o(fnpVarDN.l()).e().f(this.b / 2.0f));
        return new fow(new float[]{txnVarD.a, txnVarD.b, txnVarD.c}, fnpVarDN.i());
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof teq) {
            teq teqVar = (teq) obj;
            if (this.c.equals(teqVar.c)) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(teqVar.a)) {
                    if (Float.floatToIntBits(this.b) == Float.floatToIntBits(teqVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.c.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        return Float.floatToIntBits(this.b) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.c.toString() + ", " + this.a + ", " + this.b + "}";
    }

    public teq(foi foiVar, float f, float f2) {
        foiVar.getClass();
        this.c = foiVar;
        this.a = f;
        this.b = f2;
    }
}
