package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvy extends tph implements tqs {
    public static final tvy a;
    private static volatile tqy c;
    public tpw b = trb.a;

    static {
        tvy tvyVar = new tvy();
        a = tvyVar;
        tph.A(tvy.class, tvyVar);
    }

    private tvy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tvx.class});
        }
        if (i2 == 3) {
            return new tvy();
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
        synchronized (tvy.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
