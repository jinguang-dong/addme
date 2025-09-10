package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nra extends tph implements tqs {
    public static final nra a;
    private static volatile tqy e;
    public float b;
    public float c;
    public float d;

    static {
        nra nraVar = new nra();
        a = nraVar;
        tph.A(nra.class, nraVar);
    }

    private nra() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new nra();
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
        synchronized (nra.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
