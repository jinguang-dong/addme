package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snq extends tph implements tqs {
    public static final snq a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;

    static {
        snq snqVar = new snq();
        a = snqVar;
        tph.A(snq.class, snqVar);
    }

    private snq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = snl.c;
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ခ\u0002\u0005᠌\u0004", new Object[]{"b", "c", tplVar, "d", tplVar, "e", "f", snl.e});
        }
        if (i2 == 3) {
            return new snq();
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
        synchronized (snq.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
