package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyo extends tph implements tqs {
    public static final qyo a;
    private static volatile tqy d;
    public String b = "";
    public long c;
    private int e;

    static {
        qyo qyoVar = new qyo();
        a = qyoVar;
        tph.A(qyo.class, qyoVar);
    }

    private qyo() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new qyo();
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
        synchronized (qyo.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
