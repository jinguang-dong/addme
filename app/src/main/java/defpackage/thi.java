package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thi extends tph implements tqs {
    public static final thi a;
    private static volatile tqy d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        thi thiVar = new thi();
        a = thiVar;
        tph.A(thi.class, thiVar);
    }

    private thi() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new thi();
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
        synchronized (thi.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
