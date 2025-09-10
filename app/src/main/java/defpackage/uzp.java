package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzp extends tph implements tqs {
    public static final uzp a;
    private static volatile tqy g;
    public int b;
    public String c = "";
    public tpq d = tqh.a;
    public long e;
    public int f;

    static {
        uzp uzpVar = new uzp();
        a = uzpVar;
        tph.A(uzp.class, uzpVar);
    }

    private uzp() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(\u0004᠌\u0002", new Object[]{"b", "c", "e", "d", "f", tyy.q});
        }
        if (i2 == 3) {
            return new uzp();
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
        synchronized (uzp.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
