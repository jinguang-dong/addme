package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sud extends tph implements tqs {
    public static final sud a;
    private static volatile tqy k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    static {
        sud sudVar = new sud();
        a = sudVar;
        tph.A(sud.class, sudVar);
    }

    private sud() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006᠌\u0004\u0007᠌\u0005\b᠌\u0006\tဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", str.h, "h", str.g, "i", rgk.k, "j"});
        }
        if (i2 == 3) {
            return new sud();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sud.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
