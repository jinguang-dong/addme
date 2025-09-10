package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class srb extends tph implements tqs {
    public static final srb a;
    private static volatile tqy j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public tpw g;
    public tpw h;
    public int i;

    static {
        srb srbVar = new srb();
        a = srbVar;
        tph.A(srb.class, srbVar);
    }

    private srb() {
        trb trbVar = trb.a;
        this.g = trbVar;
        this.h = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007င\u0004", new Object[]{"b", "c", "d", sqk.s, "e", sqk.r, "f", "g", sqz.class, "h", sra.class, "i"});
        }
        if (i2 == 3) {
            return new srb();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (srb.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
