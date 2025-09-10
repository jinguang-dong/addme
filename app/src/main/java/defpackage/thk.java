package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thk extends tph implements tqs {
    public static final thk a;
    private static volatile tqy d;
    public int b = -1;
    public int c = -1;
    private int e;

    static {
        thk thkVar = new thk();
        a = thkVar;
        tph.A(thk.class, thkVar);
    }

    private thk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new thk();
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
        synchronized (thk.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
