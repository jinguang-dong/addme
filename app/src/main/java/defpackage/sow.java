package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sow extends tph implements tqs {
    public static final sow a;
    private static volatile tqy i;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;

    static {
        sow sowVar = new sow();
        a = sowVar;
        tph.A(sow.class, sowVar);
    }

    private sow() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            tpl tplVar = snl.t;
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005᠌\u0004\u0006ဇ\u0005", new Object[]{"b", "c", tplVar, "d", tplVar, "e", "f", "g", snl.u, "h"});
        }
        if (i3 == 3) {
            return new sow();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sow.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
