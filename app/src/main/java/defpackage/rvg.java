package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvg extends tph implements tqs {
    public static final rvg a;
    private static volatile tqy c;
    public int b;

    static {
        rvg rvgVar = new rvg();
        a = rvgVar;
        tph.A(rvg.class, rvgVar);
    }

    private rvg() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u000f", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new rvg();
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
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rvg.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
