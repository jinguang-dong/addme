package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uyb extends tph implements tqs {
    public static final uyb a;
    private static volatile tqy f;
    public int b;
    public int c;
    public boolean d;
    public long e;

    static {
        uyb uybVar = new uyb();
        a = uybVar;
        tph.A(uyb.class, uybVar);
    }

    private uyb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0005ဂ\u0004", new Object[]{"b", "c", rgk.k, "d", "e"});
        }
        if (i2 == 3) {
            return new uyb();
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
        synchronized (uyb.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
