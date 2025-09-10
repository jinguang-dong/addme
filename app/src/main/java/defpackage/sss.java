package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sss extends tph implements tqs {
    public static final sss a;
    private static volatile tqy e;
    public int b;
    public boolean c;
    public long d;

    static {
        sss sssVar = new sss();
        a = sssVar;
        tph.A(sss.class, sssVar);
    }

    private sss() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\tဇ\u0001\nဂ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new sss();
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
        synchronized (sss.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
