package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sst extends tph implements tqs {
    public static final sst a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;

    static {
        sst sstVar = new sst();
        a = sstVar;
        tph.A(sst.class, sstVar);
    }

    private sst() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", ssj.h});
        }
        if (i2 == 3) {
            return new sst();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sst.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
