package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptt extends tph implements tqs {
    public static final ptt a;
    public static final tql e;
    private static volatile tqy f;
    public int b;
    public long c;
    public long d;

    static {
        ptt pttVar = new ptt();
        a = pttVar;
        tph.A(ptt.class, pttVar);
        e = tph.E(ptr.a, pttVar, pttVar, 1000, Ctry.MESSAGE);
    }

    private ptt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ptt();
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
        synchronized (ptt.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
