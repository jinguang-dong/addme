package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhm extends tph implements tqs {
    public static final rhm a;
    private static volatile tqy g;
    public int b;
    public rhi d;
    public float e;
    public String c = "";
    public tpw f = trb.a;

    static {
        rhm rhmVar = new rhm();
        a = rhmVar;
        tph.A(rhm.class, rhmVar);
    }

    private rhm() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0003\u000f\u0004\u0000\u0001\u0000\u0003ခ\b\u0004\u001a\nဉ\u0003\u000fဈ\u0001", new Object[]{"b", "e", "f", "d", "c"});
        }
        if (i2 == 3) {
            return new rhm();
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
        synchronized (rhm.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
