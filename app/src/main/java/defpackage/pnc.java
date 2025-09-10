package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pnc implements pmw {
    public final Object a = new Object();
    public final sxy b = new sxy(null);
    private final pna c;

    public pnc(pna pnaVar) {
        this.c = pnaVar;
        pnaVar.b = this;
        a();
    }

    @Override // defpackage.pmw
    public final void a() {
        synchronized (this.a) {
            sxy sxyVar = this.b;
            System.nanoTime();
            for (pmv pmvVar : this.c.a.values()) {
                ((pmo) pmvVar.d).b(sxyVar, pmvVar);
            }
        }
    }
}
