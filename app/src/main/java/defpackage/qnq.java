package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnq extends tph implements tqs {
    public static final qnq a;
    private static volatile tqy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        qnq qnqVar = new qnq();
        a = qnqVar;
        tph.A(qnq.class, qnqVar);
    }

    private qnq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", uyd.class, qnr.class, qns.class, qnt.class});
        }
        if (i2 == 3) {
            return new qnq();
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
        synchronized (qnq.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
