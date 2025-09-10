package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqi extends tph implements tqs {
    public static final sqi a;
    private static volatile tqy k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public tpw h = trb.a;
    public boolean i;
    public int j;

    static {
        sqi sqiVar = new sqi();
        a = sqiVar;
        tph.A(sqi.class, sqiVar);
    }

    private sqi() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006\u001b\u0007ဇ\u0005\b᠌\u0006", new Object[]{"b", "c", spd.u, "d", rgk.k, "e", rgk.h, "f", "g", spd.t, "h", sqh.class, "i", "j", sqk.b});
        }
        if (i2 == 3) {
            return new sqi();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sqi.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
