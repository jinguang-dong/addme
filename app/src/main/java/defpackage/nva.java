package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nva extends tph implements tqs {
    public static final nva a;
    private static volatile tqy f;
    public int b;
    public nuz c;
    public nuy d;
    public int e = -1;
    private int g;

    static {
        nva nvaVar = new nva();
        a = nvaVar;
        tph.A(nva.class, nvaVar);
    }

    private nva() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007᠌\u0005", new Object[]{"g", "b", "c", "d", "e", nvd.c});
        }
        if (i2 == 3) {
            return new nva();
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
        synchronized (nva.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
