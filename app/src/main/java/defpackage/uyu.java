package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyu extends tph implements tqs {
    public static final uyu a;
    private static volatile tqy b;

    static {
        uyu uyuVar = new uyu();
        a = uyuVar;
        tph.A(uyu.class, uyuVar);
    }

    private uyu() {
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
            return new uyu();
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
        synchronized (uyu.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
