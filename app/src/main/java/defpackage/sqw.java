package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqw extends tph implements tqs {
    public static final sqw a;
    private static volatile tqy h;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public int g;

    static {
        sqw sqwVar = new sqw();
        a = sqwVar;
        tph.A(sqw.class, sqwVar);
    }

    private sqw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", sqk.n, "d", "e", "f", sqk.o, "g"});
        }
        if (i2 == 3) {
            return new sqw();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sqw.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
