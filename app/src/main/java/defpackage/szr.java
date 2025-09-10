package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szr extends tph implements tqs {
    public static final szr a;
    private static volatile tqy h;
    public int b;
    public boolean c;
    public tpm d = tpa.a;
    public szu e;
    public szs f;
    public int g;

    static {
        szr szrVar = new szr();
        a = szrVar;
        tph.A(szr.class, szrVar);
    }

    private szr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001$\u0002ဉ\u0001\u0005ဉ\u0002\u0006ဇ\u0000\u0007င\u0003", new Object[]{"b", "d", "e", "f", "c", "g"});
        }
        if (i2 == 3) {
            return new szr();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (szr.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
