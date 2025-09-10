package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqx extends tph implements tqs {
    public static final sqx a;
    private static volatile tqy e;
    public int b;
    public long c;
    public int d;

    static {
        sqx sqxVar = new sqx();
        a = sqxVar;
        tph.A(sqx.class, sqxVar);
    }

    private sqx() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", sqk.p});
        }
        if (i2 == 3) {
            return new sqx();
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
        synchronized (sqx.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
