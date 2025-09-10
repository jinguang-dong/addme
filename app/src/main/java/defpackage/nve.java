package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nve extends tpf implements tqs {
    public static final nve a;
    private static volatile tqy c;
    private int d;
    private byte e = 2;
    public int b = 1;

    static {
        nve nveVar = new nve();
        a = nveVar;
        tph.A(nve.class, nveVar);
    }

    private nve() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", nvd.a});
        }
        if (i2 == 3) {
            return new nve();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (nve.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
