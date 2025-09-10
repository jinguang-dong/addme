package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thh extends tph implements tqs {
    public static final thh a;
    private static volatile tqy g;
    public boolean b;
    public int c = -1;
    public int d = -1;
    public float e = -1.0f;
    public float f = -1.0f;
    private int h;

    static {
        thh thhVar = new thh();
        a = thhVar;
        tph.A(thh.class, thhVar);
    }

    private thh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new thh();
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
        synchronized (thh.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
