package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sox extends tph implements tqs {
    public static final sox a;
    private static volatile tqy l;
    public int b;
    public int c;
    public int d;
    public stu e;
    public stg f;
    public snq g;
    public suk h;
    public spq i;
    public ssn j;
    public ssl k;

    static {
        sox soxVar = new sox();
        a = soxVar;
        tph.A(sox.class, soxVar);
    }

    private sox() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\nဉ\u0003\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000eဉ\u0007\u000fဉ\b\u0010ဉ\t", new Object[]{"b", "c", spd.b, "d", rgk.k, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new sox();
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
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sox.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
