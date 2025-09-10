package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qns extends tph implements tqs {
    public static final qns a;
    private static volatile tqy f;
    public int b;
    public trn d;
    public int e;
    private byte g = 2;
    public tpw c = trb.a;

    static {
        qns qnsVar = new qns();
        a = qnsVar;
        tph.A(qns.class, qnsVar);
    }

    private qns() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", uzx.class, "d", "e", nvd.t});
        }
        if (i2 == 3) {
            return new qns();
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
        synchronized (qns.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
