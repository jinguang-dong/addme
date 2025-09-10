package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgd extends tph implements tqs {
    public static final rgd a;
    private static volatile tqy b;
    private int c;
    private tnh d;

    static {
        rgd rgdVar = new rgd();
        a = rgdVar;
        tph.A(rgd.class, rgdVar);
    }

    private rgd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0000\u0017ဉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new rgd();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgd.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
