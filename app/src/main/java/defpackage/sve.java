package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sve extends tph implements tqs {
    public static final sve a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public tpw e = trb.a;
    public long f;

    static {
        sve sveVar = new sve();
        a = sveVar;
        tph.A(sve.class, sveVar);
    }

    private sve() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"b", "c", svp.b, "d", svp.a, "e", suv.class, "f"});
        }
        if (i2 == 3) {
            return new sve();
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
        synchronized (sve.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
