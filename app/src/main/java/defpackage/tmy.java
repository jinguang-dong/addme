package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmy extends tph implements tqs {
    public static final tmy a;
    private static volatile tqy d;
    public int b = 0;
    public Object c;

    static {
        tmy tmyVar = new tmy();
        a = tmyVar;
        tph.A(tmy.class, tmyVar);
    }

    private tmy() {
        toj tojVar = toj.b;
        trb trbVar = trb.a;
        tpi tpiVar = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", tms.class, tmx.class, tmw.class, tmr.class, tmv.class, tmu.class, tmt.class});
        }
        if (i2 == 3) {
            return new tmy();
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
        synchronized (tmy.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
