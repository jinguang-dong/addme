package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class srs extends tph implements tqs {
    public static final srs a;
    private static volatile tqy d;
    public int b;
    public int c;

    static {
        srs srsVar = new srs();
        a = srsVar;
        tph.A(srs.class, srsVar);
    }

    private srs() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", sri.i});
        }
        if (i2 == 3) {
            return new srs();
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
        synchronized (srs.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
