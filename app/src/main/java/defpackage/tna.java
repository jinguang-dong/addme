package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tna extends tph implements tqs {
    public static final tna a;
    private static volatile tqy c;
    public tpw b = trb.a;

    static {
        tna tnaVar = new tna();
        a = tnaVar;
        tph.A(tna.class, tnaVar);
    }

    private tna() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tmz.class});
        }
        if (i2 == 3) {
            return new tna();
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
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tna.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
