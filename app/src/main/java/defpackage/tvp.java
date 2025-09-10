package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvp extends tph implements tqs {
    public static final tvp a;
    private static volatile tqy f;
    public tue b;
    public float c;
    public tvq d;
    public tup e;
    private int g;
    private tup h;
    private byte i = 2;

    static {
        tvp tvpVar = new tvp();
        a = tvpVar;
        tph.A(tvp.class, tvpVar);
    }

    private tvp() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ခ\u0001\u0004ဉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"g", "b", "c", "d", "e", "h"});
        }
        if (i2 == 3) {
            return new tvp();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tvp.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
