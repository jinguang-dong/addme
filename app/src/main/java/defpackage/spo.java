package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class spo extends tph implements tqs {
    public static final spo a;
    private static volatile tqy f;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        spo spoVar = new spo();
        a = spoVar;
        tph.A(spo.class, spoVar);
    }

    private spo() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"b", "c", rgk.h, "d", "e"});
        }
        if (i2 == 3) {
            return new spo();
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
        synchronized (spo.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
