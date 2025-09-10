package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsq extends tph implements tqs {
    public static final tsq a;
    private static volatile tqy d;
    public int b;
    public int c;

    static {
        tsq tsqVar = new tsq();
        a = tsqVar;
        tph.A(tsq.class, tsqVar);
    }

    private tsq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004᠌\u0003", new Object[]{"b", "c", svp.q});
        }
        if (i2 == 3) {
            return new tsq();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsq.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
