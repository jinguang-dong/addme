package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srd extends tph implements tqs {
    public static final srd a;
    private static volatile tqy e;
    public int b;
    public String c = "";
    public tpw d = trb.a;

    static {
        srd srdVar = new srd();
        a = srdVar;
        tph.A(srd.class, srdVar);
    }

    private srd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", sre.class});
        }
        if (i2 == 3) {
            return new srd();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (srd.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
