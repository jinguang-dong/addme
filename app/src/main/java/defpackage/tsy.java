package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsy extends tph implements tqs {
    public static final tsy a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public toj e = toj.b;

    static {
        tsy tsyVar = new tsy();
        a = tsyVar;
        tph.A(tsy.class, tsyVar);
    }

    private tsy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tsy();
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
        synchronized (tsy.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
