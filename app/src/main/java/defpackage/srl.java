package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class srl extends tph implements tqs {
    public static final srl a;
    private static volatile tqy e;
    public int b;
    public srm c;
    public int d;

    static {
        srl srlVar = new srl();
        a = srlVar;
        tph.A(srl.class, srlVar);
    }

    private srl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", sri.c});
        }
        if (i2 == 3) {
            return new srl();
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
        synchronized (srl.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
