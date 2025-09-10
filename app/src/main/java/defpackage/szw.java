package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szw extends tph implements tqs {
    public static final szw a;
    private static volatile tqy d;
    public int b;
    public boolean c;

    static {
        szw szwVar = new szw();
        a = szwVar;
        tph.A(szw.class, szwVar);
    }

    private szw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new szw();
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
        synchronized (szw.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
