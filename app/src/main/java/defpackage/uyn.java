package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uyn extends tph implements tqs {
    public static final uyn a;
    private static volatile tqy g;
    public int b;
    public long c;
    public int d;
    public uyr f;
    private byte h = 2;
    public tpw e = trb.a;

    static {
        uyn uynVar = new uyn();
        a = uynVar;
        tph.A(uyn.class, uynVar);
    }

    private uyn() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", uyo.class, "d", tyy.k, "f"});
        }
        if (i2 == 3) {
            return new uyn();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uyn.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
