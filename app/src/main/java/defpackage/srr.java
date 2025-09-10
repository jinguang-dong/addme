package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class srr extends tph implements tqs {
    public static final srr a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public double e;

    static {
        srr srrVar = new srr();
        a = srrVar;
        tph.A(srr.class, srrVar);
    }

    private srr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003က\u0002", new Object[]{"b", "c", sri.i, "d", sri.h, "e"});
        }
        if (i2 == 3) {
            return new srr();
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
        synchronized (srr.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
