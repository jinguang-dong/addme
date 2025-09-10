package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tss extends tph implements tqs {
    public static final tss a;
    private static volatile tqy h;
    public int b;
    public int c;
    public tsq d;
    public tsm e;
    public tsn f;
    public tsn g;

    static {
        tss tssVar = new tss();
        a = tssVar;
        tph.A(tss.class, tssVar);
    }

    private tss() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0007ဉ\u000b\bဉ\f\nဉ\u0005", new Object[]{"b", "c", rgk.q, "d", "f", "g", "e"});
        }
        if (i2 == 3) {
            return new tss();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tss.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
