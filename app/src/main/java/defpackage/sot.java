package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sot extends tph implements tqs {
    public static final sot a;
    private static volatile tqy e;
    public int b;
    public int c;
    public int d;

    static {
        sot sotVar = new sot();
        a = sotVar;
        tph.A(sot.class, sotVar);
    }

    private sot() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = snl.r;
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", tplVar, "d", tplVar});
        }
        if (i2 == 3) {
            return new sot();
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
        synchronized (sot.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
