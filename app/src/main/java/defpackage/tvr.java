package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvr extends tph implements tqs {
    public static final tvr a;
    private static volatile tqy b;

    static {
        tvr tvrVar = new tvr();
        a = tvrVar;
        tph.A(tvr.class, tvrVar);
    }

    private tvr() {
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
            return new tvr();
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
        synchronized (tvr.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
