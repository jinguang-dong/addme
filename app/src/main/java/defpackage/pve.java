package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pve extends tph implements tqs {
    public static final pve a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        pve pveVar = new pve();
        a = pveVar;
        tph.A(pve.class, pveVar);
    }

    private pve() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004ဂ\u0002", new Object[]{"b", "c", nvd.q, "d", nvd.p, "f", nvd.o, "e"});
        }
        if (i2 == 3) {
            return new pve();
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
        synchronized (pve.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
