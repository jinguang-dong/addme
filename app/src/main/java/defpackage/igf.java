package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igf extends tph implements tqs {
    public static final igf a;
    public static final tpr e = new tpr(ths.DETECTION_SKIP_REASON_UNKNOWN);
    private static volatile tqy f;
    public int b;
    public tqm c = tqm.a;
    public long d;

    static {
        igf igfVar = new igf();
        a = igfVar;
        tph.A(igf.class, igfVar);
    }

    private igf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001࠲\u0002ဂ\u0000", new Object[]{"b", "c", ige.a, svp.k, "d"});
        }
        if (i2 == 3) {
            return new igf();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (igf.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
