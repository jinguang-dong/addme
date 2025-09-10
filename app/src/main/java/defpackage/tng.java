package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tng extends tph implements tqs {
    public static final tng a;
    private static volatile tqy b;
    private int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private byte h = 2;

    static {
        tng tngVar = new tng();
        a = tngVar;
        tph.A(tng.class, tngVar);
    }

    private tng() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new tng();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tng.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
