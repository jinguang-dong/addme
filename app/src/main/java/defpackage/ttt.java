package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttt extends tph implements tqs {
    public static final ttt a;
    private static volatile tqy f;
    public tpm b;
    public tpm c;
    public tpm d;
    public tpm e;

    static {
        ttt tttVar = new ttt();
        a = tttVar;
        tph.A(ttt.class, tttVar);
    }

    private ttt() {
        tpa tpaVar = tpa.a;
        this.b = tpaVar;
        this.c = tpaVar;
        this.d = tpaVar;
        this.e = tpaVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ttt();
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
        synchronized (ttt.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
