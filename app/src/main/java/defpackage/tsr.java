package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsr extends tph implements tqs {
    public static final tsr a;
    private static volatile tqy e;
    public int b;
    public tpw c = trb.a;
    public int d;

    static {
        tsr tsrVar = new tsr();
        a = tsrVar;
        tph.A(tsr.class, tsrVar);
    }

    private tsr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0003\n\u0002\u0000\u0001\u0000\u0003\u001a\nင\u0005", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tsr();
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
        synchronized (tsr.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
