package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttz extends tph implements tqs {
    public static final ttz a;
    private static volatile tqy b;
    private int c;
    private double d;
    private double e;
    private byte f = 2;

    static {
        ttz ttzVar = new ttz();
        a = ttzVar;
        tph.A(ttz.class, ttzVar);
    }

    private ttz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new ttz();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ttz.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
