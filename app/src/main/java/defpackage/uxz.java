package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxz extends tph implements tqs {
    public static final uxz a;
    public static final tql d;
    private static volatile tqy e;
    public tpq b;
    public tpq c;

    static {
        uxz uxzVar = new uxz();
        a = uxzVar;
        tph.A(uxz.class, uxzVar);
        d = tph.E(uzm.a, uxzVar, uxzVar, 100, Ctry.MESSAGE);
    }

    private uxz() {
        tqh tqhVar = tqh.a;
        this.b = tqhVar;
        this.c = tqhVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new uxz();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uxz.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void c() {
        tpq tpqVar = this.b;
        if (tpqVar.c()) {
            return;
        }
        this.b = tph.u(tpqVar);
    }

    public final void i() {
        tpq tpqVar = this.c;
        if (tpqVar.c()) {
            return;
        }
        this.c = tph.u(tpqVar);
    }
}
