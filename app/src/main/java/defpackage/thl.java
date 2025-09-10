package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thl extends tph implements tqs {
    public static final thl a;
    private static volatile tqy f;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        thl thlVar = new thl();
        a = thlVar;
        tph.A(thl.class, thlVar);
    }

    private thl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\tဇ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new thl();
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
        synchronized (thl.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
