package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class stw extends tph implements tqs {
    public static final stw a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        stw stwVar = new stw();
        a = stwVar;
        tph.A(stw.class, stwVar);
    }

    private stw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = rgk.n;
            return new trc(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", tplVar, "d", tplVar, "e", rgk.o});
        }
        if (i2 == 3) {
            return new stw();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (stw.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
