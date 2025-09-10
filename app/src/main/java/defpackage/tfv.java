package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfv extends tph implements tqs {
    public static final tfv a;
    private static volatile tqy d;
    public tpw b = trb.a;
    public int c;
    private int e;

    static {
        tfv tfvVar = new tfv();
        a = tfvVar;
        tph.A(tfv.class, tfvVar);
    }

    private tfv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"e", "b", tfu.class, "c"});
        }
        if (i2 == 3) {
            return new tfv();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tfv.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
