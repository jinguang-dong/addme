package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgl extends tph implements tqs {
    public static final rgl a;
    private static volatile tqy e;
    public int b;
    public int c;
    public tpw d = trb.a;

    static {
        rgl rglVar = new rgl();
        a = rglVar;
        tph.A(rgl.class, rglVar);
    }

    private rgl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002င\u0000\u0003\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new rgl();
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
        synchronized (rgl.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
