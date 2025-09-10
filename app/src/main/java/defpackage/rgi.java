package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgi extends tph implements tqs {
    public static final rgi a;
    private static volatile tqy f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        rgi rgiVar = new rgi();
        a = rgiVar;
        tph.A(rgi.class, rgiVar);
    }

    private rgi() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0010\u0001\u0001\u0001\u001d\u0010\u0000\u0000\u0000\u0001ဂ\u0000\u00024\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n4\u0000\u000b4\u0000\f4\u0000\r4\u0000\u00124\u0000\u00134\u0000\u001d4\u0000", new Object[]{"d", "c", "b", "e", rgj.class, rgj.class, rgj.class, rgj.class, rgj.class, rgh.class, rgh.class});
        }
        if (i2 == 3) {
            return new rgi();
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
        synchronized (rgi.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
