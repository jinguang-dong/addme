package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmc implements mmb {
    private final hwt a;
    private final hpa b;
    private final hpj c;

    public mmc(hwt hwtVar, hpj hpjVar, hpa hpaVar) {
        this.a = hwtVar;
        this.c = hpjVar;
        this.b = hpaVar;
        hpjVar.i("tracking-meta");
    }

    @Override // defpackage.mmb
    public final synchronized void a() {
        this.a.c();
    }

    @Override // defpackage.mmb
    public final boolean b() {
        lnl lnlVarB = this.b.b();
        return lnlVarB != null && lnlVarB.d > 50000000 && ((long) lnlVarB.f) > 350;
    }

    @Override // defpackage.mmb
    public final synchronized boolean c(pas pasVar, long j) {
        pas pasVar2 = new pas(pasVar.a, pasVar.b);
        hwt hwtVar = this.a;
        if (!hwtVar.e()) {
            hwtVar.f(pasVar2, "trk-gyro-session");
        }
        if (!hwtVar.e()) {
            return false;
        }
        hwtVar.b(j, this.b.a(j));
        return true;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.j("tracking-meta");
    }

    @Override // defpackage.mmb
    public final synchronized float[] d(long j) {
        hwt hwtVar = this.a;
        if (hwtVar.e()) {
            return ((qib) hwtVar.b(j, this.b.a(j)).get(0)).f();
        }
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
