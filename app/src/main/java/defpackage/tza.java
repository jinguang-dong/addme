package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tza extends tph implements tqs {
    public static final tza a;
    private static volatile tqy f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        tza tzaVar = new tza();
        a = tzaVar;
        tph.A(tza.class, tzaVar);
    }

    private tza() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0006\f\u0003\u0000\u0000\u0000\u0006ဇ\u0005\bဇ\u0007\fင\u000b", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tza();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tza.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
