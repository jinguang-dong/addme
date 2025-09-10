package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uej extends tph implements tqs {
    public static final uej a;
    private static volatile tqy b;

    static {
        uej uejVar = new uej();
        a = uejVar;
        tph.A(uej.class, uejVar);
    }

    private uej() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new uej();
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
        synchronized (uej.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
