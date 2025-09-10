package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qye extends tph implements tqs {
    public static final qye a;
    private static volatile tqy g;
    public long e;
    private int h;
    public tqm f = tqm.a;
    public String b = "";
    public toj c = toj.b;
    public String d = "";

    static {
        qye qyeVar = new qye();
        a = qyeVar;
        tph.A(qye.class, qyeVar);
    }

    private qye() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", qyd.a});
        }
        if (i2 == 3) {
            return new qye();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qye.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
