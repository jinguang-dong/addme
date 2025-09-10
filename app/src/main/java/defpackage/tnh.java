package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnh extends tph implements tqs {
    public static final tnh a;
    private static volatile tqy b;
    private int c;
    private tnj d;

    static {
        tnh tnhVar = new tnh();
        a = tnhVar;
        tph.A(tnh.class, tnhVar);
    }

    private tnh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new tnh();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tnh.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
