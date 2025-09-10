package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class snk extends tph implements tqs {
    public static final snk a;
    private static volatile tqy d;
    public int b;
    public int c;

    static {
        snk snkVar = new snk();
        a = snkVar;
        tph.A(snk.class, snkVar);
    }

    private snk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", snl.a});
        }
        if (i2 == 3) {
            return new snk();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (snk.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
