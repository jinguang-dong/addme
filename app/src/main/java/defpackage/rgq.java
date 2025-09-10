package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgq extends tph implements tqs {
    public static final rgq a;
    private static volatile tqy b;
    private int c;
    private tng d;
    private byte e = 2;

    static {
        rgq rgqVar = new rgq();
        a = rgqVar;
        tph.A(rgq.class, rgqVar);
    }

    private rgq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new rgq();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgq.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
