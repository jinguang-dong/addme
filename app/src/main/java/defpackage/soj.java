package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soj extends tph implements tqs {
    public static final soj a;
    private static volatile tqy f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        soj sojVar = new soj();
        a = sojVar;
        tph.A(soj.class, sojVar);
    }

    private soj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new soj();
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
        synchronized (soj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
