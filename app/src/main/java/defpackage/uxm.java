package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxm extends tph implements tqs {
    public static final uxm a;
    private static volatile tqy c;
    public tpn b = tpi.a;

    static {
        uxm uxmVar = new uxm();
        a = uxmVar;
        tph.A(uxm.class, uxmVar);
    }

    private uxm() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", tyy.f});
        }
        if (i2 == 3) {
            return new uxm();
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
        synchronized (uxm.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
