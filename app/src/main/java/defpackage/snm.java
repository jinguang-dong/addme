package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class snm extends tph implements tqs {
    public static final snm a;
    private static volatile tqy i;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    static {
        snm snmVar = new snm();
        a = snmVar;
        tph.A(snm.class, snmVar);
    }

    private snm() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", rgk.e, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new snm();
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
        synchronized (snm.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
