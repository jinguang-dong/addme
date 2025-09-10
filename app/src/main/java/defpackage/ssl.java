package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssl extends tph implements tqs {
    public static final ssl a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public int e = -1;

    static {
        ssl sslVar = new ssl();
        a = sslVar;
        tph.A(ssl.class, sslVar);
    }

    private ssl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", ssj.e, "d", ssj.c, "e"});
        }
        if (i2 == 3) {
            return new ssl();
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
        synchronized (ssl.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
