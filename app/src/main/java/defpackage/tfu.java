package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfu extends tph implements tqs {
    public static final tfu a;
    private static volatile tqy e;
    public long b;
    public tth c;
    public float d;
    private int f;

    static {
        tfu tfuVar = new tfu();
        a = tfuVar;
        tph.A(tfu.class, tfuVar);
    }

    private tfu() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဃ\u0002\u0006ဉ\u0003\u0007ခ\u0004", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new tfu();
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
        synchronized (tfu.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
