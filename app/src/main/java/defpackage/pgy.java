package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgy implements pdk {
    private final pgf a;
    private final paq b;
    private boolean c = false;
    private final ojl d;

    private pgy(pgf pgfVar, paq paqVar, ojl ojlVar) {
        this.a = pgfVar;
        this.b = paqVar;
        this.d = ojlVar;
    }

    public static pdk k(pgf pgfVar, ojl ojlVar) {
        paq paqVarB = pgfVar.b();
        if (paqVarB == null) {
            return null;
        }
        return new pgy(pgfVar, paqVarB, ojlVar);
    }

    @Override // defpackage.pdk
    public final synchronized pdk a() {
        if (this.c) {
            return null;
        }
        return k(this.a, this.d);
    }

    @Override // defpackage.pdk
    public final synchronized pdo b() {
        return this.a.c;
    }

    @Override // defpackage.pdk
    public final synchronized pdv c() {
        return this.a.a;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
    }

    @Override // defpackage.pdk
    public final synchronized poe d() {
        return this.a.d();
    }

    @Override // defpackage.pdk
    public final synchronized poj e(peo peoVar) {
        if (this.c) {
            return null;
        }
        return this.a.e(peoVar);
    }

    @Override // defpackage.pdk
    public final synchronized boolean f() {
        return this.c;
    }

    @Override // defpackage.pdk
    public final synchronized boolean g() {
        return this.a.l();
    }

    @Override // defpackage.pdk
    public final synchronized boolean h() {
        return this.a.m();
    }

    @Override // defpackage.pdk
    public final synchronized boolean i() {
        return this.a.n();
    }

    @Override // defpackage.pdk
    public final synchronized void j(ojl ojlVar) {
        this.a.p(ojlVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}
