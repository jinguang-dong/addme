package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvd extends tph implements tqs {
    public static final pvd a;
    private static volatile tqy h;
    public int b;
    public long d;
    public int f;
    public puz g;
    public String c = "";
    public String e = "";

    static {
        pvd pvdVar = new pvd();
        a = pvdVar;
        tph.A(pvd.class, pvdVar);
    }

    private pvd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", nvd.n, "g"});
        }
        if (i2 == 3) {
            return new pvd();
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
        synchronized (pvd.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
