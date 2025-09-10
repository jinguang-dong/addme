package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdr extends tph implements tqs {
    public static final qdr a;
    private static volatile tqy b;
    private tqm c = tqm.a;

    static {
        qdr qdrVar = new qdr();
        a = qdrVar;
        tph.A(qdr.class, qdrVar);
    }

    private qdr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", qdq.a});
        }
        if (i2 == 3) {
            return new qdr();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qdr.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
