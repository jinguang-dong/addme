package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puj extends tph implements tqs {
    public static final puj a;
    public static final tql e;
    private static volatile tqy f;
    public int b;
    public long c;
    public long d;

    static {
        puj pujVar = new puj();
        a = pujVar;
        tph.A(puj.class, pujVar);
        e = tph.E(puc.a, pujVar, pujVar, 1000, Ctry.MESSAGE);
    }

    private puj() {
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
            return new puj();
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
        synchronized (puj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
