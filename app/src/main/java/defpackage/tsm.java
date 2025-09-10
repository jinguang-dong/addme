package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsm extends tph implements tqs {
    public static final tsm a;
    private static volatile tqy i;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    public int g;
    public String h;

    static {
        tsm tsmVar = new tsm();
        a = tsmVar;
        tph.A(tsm.class, tsmVar);
    }

    private tsm() {
        trb trbVar = trb.a;
        this.d = -1;
        this.e = "";
        tpi tpiVar = tpi.a;
        this.h = "";
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0003င\u0001\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\tဈ\u0006", new Object[]{"b", "c", svp.l, "d", "e", "f", svp.m, "g", svp.n, "h"});
        }
        if (i3 == 3) {
            return new tsm();
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
        synchronized (tsm.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
