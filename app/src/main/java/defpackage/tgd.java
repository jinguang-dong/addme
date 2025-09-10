package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgd extends tph implements tqs {
    public static final tgd a;
    private static volatile tqy f;
    public int b;
    public int c = -1;
    public long d;
    public long e;

    static {
        tgd tgdVar = new tgd();
        a = tgdVar;
        tph.A(tgd.class, tgdVar);
    }

    private tgd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tgd();
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
        synchronized (tgd.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
