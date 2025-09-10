package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spj extends tph implements tqs {
    public static final spj a;
    private static volatile tqy e;
    public int b;
    public sph c;
    public tpw d = trb.a;

    static {
        spj spjVar = new spj();
        a = spjVar;
        tph.A(spj.class, spjVar);
    }

    private spj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", spg.class});
        }
        if (i2 == 3) {
            return new spj();
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
        synchronized (spj.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
