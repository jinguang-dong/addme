package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sta extends tph implements tqs {
    public static final sta a;
    private static volatile tqy j;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        sta staVar = new sta();
        a = staVar;
        tph.A(sta.class, staVar);
    }

    private sta() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", ssj.k, "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new sta();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sta.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
