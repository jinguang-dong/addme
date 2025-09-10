package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tth extends tph implements tqs {
    public static final tth a;
    private static volatile tqy f;
    public float b;
    public float d;
    private int g;
    public float c = 1.0f;
    public float e = 1.0f;

    static {
        tth tthVar = new tth();
        a = tthVar;
        tph.A(tth.class, tthVar);
    }

    private tth() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tth();
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
        synchronized (tth.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
