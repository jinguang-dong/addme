package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vac extends tph implements tqs {
    public static final vac a;
    private static volatile tqy d;
    public tpw b = trb.a;
    public tpn c = tpi.a;

    static {
        vac vacVar = new vac();
        a = vacVar;
        tph.A(vac.class, vacVar);
    }

    private vac() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002'", new Object[]{"b", vab.class, "c"});
        }
        if (i2 == 3) {
            return new vac();
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
        synchronized (vac.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
