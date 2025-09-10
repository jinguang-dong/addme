package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ssg extends tph implements tqs {
    public static final ssg a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;

    static {
        ssg ssgVar = new ssg();
        a = ssgVar;
        tph.A(ssg.class, ssgVar);
    }

    private ssg() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", sri.t, "d", "e", "f", sri.u});
        }
        if (i2 == 3) {
            return new ssg();
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
        synchronized (ssg.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
