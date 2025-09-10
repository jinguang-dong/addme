package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ssk extends tph implements tqs {
    public static final ssk a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ssk sskVar = new ssk();
        a = sskVar;
        tph.A(ssk.class, sskVar);
    }

    private ssk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"b", "c", ssh.a, "d", ssj.a, "e", ssj.b});
        }
        if (i2 == 3) {
            return new ssk();
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
        synchronized (ssk.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
