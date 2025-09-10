package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iom extends tph implements tqs {
    public static final iom a;
    private static volatile tqy g;
    public int b;
    public int c;
    public long d;
    public long e;
    public ioj f;
    private int h;

    static {
        iom iomVar = new iom();
        a = iomVar;
        tph.A(iom.class, iomVar);
    }

    private iom() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဂ\u0000\u0005ဂ\u0002\u0006ဉ\u0003", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new iom();
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
        synchronized (iom.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
