package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uys extends tph implements tqs {
    public static final uys a;
    private static volatile tqy d;
    public trn b;
    public tpw c = trb.a;
    private int e;

    static {
        uys uysVar = new uys();
        a = uysVar;
        tph.A(uys.class, uysVar);
    }

    private uys() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0001\u0000\u0004ဉ\u0004\u0007\u001b", new Object[]{"e", "b", "c", uyw.class});
        }
        if (i2 == 3) {
            return new uys();
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
        synchronized (uys.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
