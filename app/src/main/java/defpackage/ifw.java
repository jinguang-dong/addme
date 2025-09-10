package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifw extends tph implements tqs {
    public static final ifw a;
    private static volatile tqy k;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private boolean l;

    static {
        ifw ifwVar = new ifw();
        a = ifwVar;
        tph.A(ifw.class, ifwVar);
    }

    private ifw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0001\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007", new Object[]{"b", "c", "d", "e", "l", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new ifw();
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
        synchronized (ifw.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
