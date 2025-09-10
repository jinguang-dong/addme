package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvu extends tph implements tqs {
    public static final tvu a;
    private static volatile tqy b;

    static {
        tvu tvuVar = new tvu();
        a = tvuVar;
        tph.A(tvu.class, tvuVar);
    }

    private tvu() {
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
            return new tvu();
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
        synchronized (tvu.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
