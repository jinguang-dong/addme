package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifp extends tph implements tqs {
    public static final ifp a;
    private static volatile tqy h;
    public int b;
    public ifr c;
    public ifr d;
    public int e;
    public int f;
    public String g = "";

    static {
        ifp ifpVar = new ifp();
        a = ifpVar;
        tph.A(ifp.class, ifpVar);
    }

    private ifp() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ifp();
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
        synchronized (ifp.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
