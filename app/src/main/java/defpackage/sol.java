package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sol extends tph implements tqs {
    public static final sol a;
    private static volatile tqy h;
    public int b;
    public int c;
    public sst d;
    public ssw e;
    public long f;
    public stn g;

    static {
        sol solVar = new sol();
        a = solVar;
        tph.A(sol.class, solVar);
    }

    private sol() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", rgk.k, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new sol();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sol.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
