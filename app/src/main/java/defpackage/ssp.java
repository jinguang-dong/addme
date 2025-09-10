package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssp extends tph implements tqs {
    public static final ssp a;
    private static volatile tqy k;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public long i;
    public int j;

    static {
        ssp sspVar = new ssp();
        a = sspVar;
        tph.A(ssp.class, sspVar);
    }

    private ssp() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဂ\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", rgk.n, "f", "g", "h", rgk.k, "i", "j"});
        }
        if (i2 == 3) {
            return new ssp();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ssp.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
