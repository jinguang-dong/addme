package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxb extends tph implements tqs {
    public static final mxb a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public int e;
    public tpw f = trb.a;

    static {
        mxb mxbVar = new mxb();
        a = mxbVar;
        tph.A(mxb.class, mxbVar);
    }

    private mxb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", mwz.class});
        }
        if (i2 == 3) {
            return new mxb();
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
        synchronized (mxb.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
