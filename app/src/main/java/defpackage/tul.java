package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tul extends tph implements tqs {
    public static final tul a;
    private static volatile tqy b;

    static {
        tul tulVar = new tul();
        a = tulVar;
        tph.A(tul.class, tulVar);
    }

    private tul() {
        tpa tpaVar = tpa.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new tul();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tul.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
