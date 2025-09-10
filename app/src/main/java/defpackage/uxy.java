package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxy extends tph implements tqs {
    public static final uxy a;
    private static volatile tqy g;
    public int b;
    public int c;
    public tou d;
    public long e;
    public int f;

    static {
        uxy uxyVar = new uxy();
        a = uxyVar;
        tph.A(uxy.class, uxyVar);
    }

    private uxy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", tyy.h});
        }
        if (i2 == 3) {
            return new uxy();
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
        synchronized (uxy.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
