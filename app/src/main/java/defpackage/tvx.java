package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvx extends tph implements tqs {
    public static final tvx a;
    private static volatile tqy d;
    public int b = 0;
    public Object c;

    static {
        tvx tvxVar = new tvx();
        a = tvxVar;
        tph.A(tvx.class, tvxVar);
    }

    private tvx() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", tvr.class, tvv.class, tvw.class, tvz.class, tvt.class, tvu.class});
        }
        if (i2 == 3) {
            return new tvx();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tvx.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
