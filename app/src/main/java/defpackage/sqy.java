package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqy extends tph implements tqs {
    public static final sqy a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        sqy sqyVar = new sqy();
        a = sqyVar;
        tph.A(sqy.class, sqyVar);
    }

    private sqy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"b", "c", rgk.k, "d", sri.a, "e", sqk.q, "f"});
        }
        if (i2 == 3) {
            return new sqy();
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
        synchronized (sqy.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
