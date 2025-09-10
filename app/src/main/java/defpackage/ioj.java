package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioj extends tph implements tqs {
    public static final ioj a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ioj iojVar = new ioj();
        a = iojVar;
        tph.A(ioj.class, iojVar);
    }

    private ioj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ioj();
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
        synchronized (ioj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
