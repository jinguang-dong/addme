package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqt extends tph implements tqs {
    public static final sqt a;
    private static volatile tqy m;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    static {
        sqt sqtVar = new sqt();
        a = sqtVar;
        tph.A(sqt.class, sqtVar);
    }

    private sqt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\b᠌\u0007\tင\b\nဋ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", sqk.j, "k", "l"});
        }
        if (i2 == 3) {
            return new sqt();
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
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sqt.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
