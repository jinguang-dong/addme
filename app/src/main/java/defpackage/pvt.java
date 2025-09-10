package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvt extends tph implements tqs {
    public static final pvt a;
    private static volatile tqy c;
    public tqm b = tqm.a;

    static {
        pvt pvtVar = new pvt();
        a = pvtVar;
        tph.A(pvt.class, pvtVar);
    }

    private pvt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", pvs.a});
        }
        if (i2 == 3) {
            return new pvt();
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
        synchronized (pvt.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }

    public final tqm b() {
        tqm tqmVar = this.b;
        if (!tqmVar.b) {
            this.b = tqmVar.a();
        }
        return this.b;
    }
}
