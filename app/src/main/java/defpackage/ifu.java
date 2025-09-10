package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifu extends tph implements tqs {
    public static final ifu a;
    private static volatile tqy f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        ifu ifuVar = new ifu();
        a = ifuVar;
        tph.A(ifu.class, ifuVar);
    }

    private ifu() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ifu();
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
        synchronized (ifu.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
