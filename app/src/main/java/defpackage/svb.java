package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svb extends tph implements tqs {
    public static final svb a;
    private static volatile tqy g;
    public int b;
    public int c;
    public suv d;
    public int e;
    public int f;

    static {
        svb svbVar = new svb();
        a = svbVar;
        tph.A(svb.class, svbVar);
    }

    private svb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", str.r, "d", "e", str.q, "f"});
        }
        if (i2 == 3) {
            return new svb();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (svb.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
