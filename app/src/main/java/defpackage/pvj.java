package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvj extends tph implements tqs {
    public static final pvj a;
    private static volatile tqy e;
    public tqm b;
    public tqm c;
    public tpw d;

    static {
        pvj pvjVar = new pvj();
        a = pvjVar;
        tph.A(pvj.class, pvjVar);
    }

    private pvj() {
        tqm tqmVar = tqm.a;
        this.b = tqmVar;
        this.c = tqmVar;
        this.d = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", pvh.a, "c", pvi.a, "d", pvc.class});
        }
        if (i2 == 3) {
            return new pvj();
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
        synchronized (pvj.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
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
