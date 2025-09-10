package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvq extends tph implements tqs {
    public static final tvq a;
    private static volatile tqy e;
    public int b;
    public float c;
    public boolean d;

    static {
        tvq tvqVar = new tvq();
        a = tvqVar;
        tph.A(tvq.class, tvqVar);
    }

    private tvq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tvq();
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
        synchronized (tvq.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
