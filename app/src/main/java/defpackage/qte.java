package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qte extends tph implements tqs {
    public static final qte a;
    private static volatile tqy d;
    public int b;
    public String c = "";
    private int e;

    static {
        qte qteVar = new qte();
        a = qteVar;
        tph.A(qte.class, qteVar);
    }

    private qte() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", nvd.u, "c"});
        }
        if (i2 == 3) {
            return new qte();
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
        synchronized (qte.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
