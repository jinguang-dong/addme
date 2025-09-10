package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqo extends tph implements tqs {
    public static final sqo a;
    private static volatile tqy k;
    public int b;
    public int c;
    public long d;
    public long e;
    public soi g;
    public long h;
    public int i;
    public tpq f = tqh.a;
    public tpn j = tpi.a;

    static {
        sqo sqoVar = new sqo();
        a = sqoVar;
        tph.A(sqo.class, sqoVar);
    }

    private sqo() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u0014\u0005ဉ\u0003\u0006ဂ\u0004\u0007᠌\u0005\bࠞ", new Object[]{"b", "c", sqk.e, "d", "e", "f", "g", "h", "i", sqk.c, "j", sqk.d});
        }
        if (i2 == 3) {
            return new sqo();
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
        synchronized (sqo.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
