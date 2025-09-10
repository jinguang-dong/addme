package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttj extends tph implements tqs {
    public static final ttj a;
    private static volatile tqy f;
    public float b = -1.0f;
    public float c = -1.0f;
    public boolean d = true;
    public tti e;
    private int g;

    static {
        ttj ttjVar = new ttj();
        a = ttjVar;
        tph.A(ttj.class, ttjVar);
    }

    private ttj() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ttj();
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
        synchronized (ttj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
