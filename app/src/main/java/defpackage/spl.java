package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class spl extends tph implements tqs {
    public static final spl a;
    private static volatile tqy f;
    public int b;
    public int c;
    public float d;
    public int e;

    static {
        spl splVar = new spl();
        a = splVar;
        tph.A(spl.class, splVar);
    }

    private spl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003᠌\u0002", new Object[]{"b", "c", sri.s, "d", "e", rgk.k});
        }
        if (i2 == 3) {
            return new spl();
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
        synchronized (spl.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
