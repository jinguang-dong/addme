package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uya extends tph implements tqs {
    public static final uya a;
    public static final tql e;
    private static volatile tqy f;
    public int b;
    public uyc c;
    public uej d;

    static {
        uya uyaVar = new uya();
        a = uyaVar;
        tph.A(uya.class, uyaVar);
        e = tph.E(uyd.a, uyaVar, uyaVar, 516454629, Ctry.MESSAGE);
    }

    private uya() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new uya();
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
        synchronized (uya.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
