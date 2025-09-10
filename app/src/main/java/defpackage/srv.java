package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class srv extends tph implements tqs {
    public static final srv a;
    private static volatile tqy g;
    public int b;
    public int c;
    public String d = "";
    public float e;
    public float f;

    static {
        srv srvVar = new srv();
        a = srvVar;
        tph.A(srv.class, srvVar);
    }

    private srv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0004ဈ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"b", "c", sri.k, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new srv();
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
        synchronized (srv.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
