package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uyc extends tph implements tqs {
    public static final uyc a;
    private static volatile tqy e;
    public int b;
    public int c;
    public tpw d = trb.a;

    static {
        uyc uycVar = new uyc();
        a = uycVar;
        tph.A(uyc.class, uycVar);
    }

    private uyc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"b", "c", "d", uyb.class});
        }
        if (i2 == 3) {
            return new uyc();
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
        synchronized (uyc.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
