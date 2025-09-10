package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thj extends tph implements tqs {
    public static final thj a;
    private static volatile tqy k;
    public int b;
    public float c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        thj thjVar = new thj();
        a = thjVar;
        tph.A(thj.class, thjVar);
    }

    private thj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဇ\u0006\u0006ဇ\u0007\u0007ဇ\u0005\bဇ\u0001", new Object[]{"b", "c", "e", "f", "g", "i", "j", "h", "d"});
        }
        if (i2 == 3) {
            return new thj();
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
        synchronized (thj.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
