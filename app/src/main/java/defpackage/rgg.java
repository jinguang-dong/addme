package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgg extends tph implements tqs {
    public static final rgg a;
    private static volatile tqy d;
    public int b;
    public tmq c;
    private byte e = 2;

    static {
        rgg rggVar = new rgg();
        a = rggVar;
        tph.A(rgg.class, rggVar);
    }

    private rgg() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new rgg();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgg.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
