package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgy extends tph implements tqs {
    public static final rgy a;
    private static volatile tqy e;
    public int b;
    public rgp c;
    public rhc d;

    static {
        rgy rgyVar = new rgy();
        a = rgyVar;
        tph.A(rgy.class, rgyVar);
    }

    private rgy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0006ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new rgy();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgy.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
