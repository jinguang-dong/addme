package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sok extends tph implements tqs {
    public static final sok a;
    private static volatile tqy e;
    public int b;
    public int c;
    public String d = "";

    static {
        sok sokVar = new sok();
        a = sokVar;
        tph.A(sok.class, sokVar);
    }

    private sok() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", snl.n, "d"});
        }
        if (i2 == 3) {
            return new sok();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sok.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
