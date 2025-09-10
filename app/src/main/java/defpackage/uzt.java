package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzt extends tph implements tqs {
    public static final uzt a;
    private static volatile tqy e;
    public int b;
    public int c;
    private uzs f;
    private byte g = 2;
    public int d = 1;

    static {
        uzt uztVar = new uzt();
        a = uztVar;
        tph.A(uzt.class, uztVar);
    }

    private uzt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", tyy.r, "d", "f"});
        }
        if (i2 == 3) {
            return new uzt();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzt.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
