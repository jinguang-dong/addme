package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sti extends tph implements tqs {
    public static final sti a;
    private static volatile tqy j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public long i;

    static {
        sti stiVar = new sti();
        a = stiVar;
        tph.A(sti.class, stiVar);
    }

    private sti() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", ssj.r, "d", "e", nvd.b, "f", ssj.q, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new sti();
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
        synchronized (sti.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
