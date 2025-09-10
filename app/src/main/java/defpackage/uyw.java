package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyw extends tph implements tqs {
    public static final uyw a;
    private static volatile tqy e;
    public int b = 0;
    public long c;
    public tou d;
    private int f;
    private Object g;

    static {
        uyw uywVar = new uyw();
        a = uywVar;
        tph.A(uyw.class, uywVar);
    }

    private uyw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"g", "b", "f", "c", "d", uyu.class, uyv.class, uyt.class});
        }
        if (i2 == 3) {
            return new uyw();
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
        synchronized (uyw.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
