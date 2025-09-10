package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tnl extends tph implements tqs {
    public static final tnl a;
    private static volatile tqy b;
    private int c;
    private byte e = 2;
    private toj d = toj.b;

    static {
        tnl tnlVar = new tnl();
        a = tnlVar;
        tph.A(tnl.class, tnlVar);
    }

    private tnl() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new tnl();
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
        synchronized (tnl.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
