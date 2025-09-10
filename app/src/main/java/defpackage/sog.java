package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sog extends tph implements tqs {
    public static final sog a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        sog sogVar = new sog();
        a = sogVar;
        tph.A(sog.class, sogVar);
    }

    private sog() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", snl.j, "d", snl.i, "e", snl.k, "f", snl.e, "g", snl.l});
        }
        if (i2 == 3) {
            return new sog();
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
        synchronized (sog.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
