package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqt extends tph implements tqs {
    public static final nqt a;
    private static volatile tqy g;
    public int e;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        nqt nqtVar = new nqt();
        a = nqtVar;
        tph.A(nqt.class, nqtVar);
    }

    private nqt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new nqt();
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
        synchronized (nqt.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
