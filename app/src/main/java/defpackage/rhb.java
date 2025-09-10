package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhb extends tph implements tqs {
    public static final rhb a;
    private static volatile tqy f;
    public int b;
    public String c = "";
    public tpw d = trb.a;
    public boolean e;

    static {
        rhb rhbVar = new rhb();
        a = rhbVar;
        tph.A(rhb.class, rhbVar);
    }

    private rhb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new rhb();
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
        synchronized (rhb.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
