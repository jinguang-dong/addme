package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxn extends tph implements tqs {
    public static final pxn a;
    private static volatile tqy c;
    public tqm b = tqm.a;

    static {
        pxn pxnVar = new pxn();
        a = pxnVar;
        tph.A(pxn.class, pxnVar);
    }

    private pxn() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", pxm.a});
        }
        if (i2 == 3) {
            return new pxn();
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
        synchronized (pxn.class) {
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
