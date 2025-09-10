package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vaa extends tph implements tqs {
    public static final vaa a;
    private static volatile tqy d;
    public trn c;
    private int e;
    private byte f = 2;
    public tpw b = trb.a;

    static {
        vaa vaaVar = new vaa();
        a = vaaVar;
        tph.A(vaa.class, vaaVar);
    }

    private vaa() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဉ\u0001", new Object[]{"e", "b", uzz.class, "c"});
        }
        if (i2 == 3) {
            return new vaa();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (vaa.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
