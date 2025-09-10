package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxl extends tph implements tqs {
    public static final uxl a;
    private static volatile tqy f;
    public int b;
    public uxm d;
    public int e;
    private byte g = 2;
    public tpw c = trb.a;

    static {
        uxl uxlVar = new uxl();
        a = uxlVar;
        tph.A(uxl.class, uxlVar);
    }

    private uxl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", uxk.class, "d", "e"});
        }
        if (i2 == 3) {
            return new uxl();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uxl.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
