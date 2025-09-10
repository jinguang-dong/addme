package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thf extends tph implements tqs {
    public static final thf a;
    private static volatile tqy e;
    public int b = -1;
    public float c = -1.0f;
    public float d = -1.0f;
    private int f;

    static {
        thf thfVar = new thf();
        a = thfVar;
        tph.A(thf.class, thfVar);
    }

    private thf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new thf();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (thf.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
