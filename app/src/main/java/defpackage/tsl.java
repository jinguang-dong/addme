package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsl extends tph implements tqs {
    public static final tsl a;
    private static volatile tqy f;
    public int b;
    public tso c;
    public tpw d;
    public tpw e;

    static {
        tsl tslVar = new tsl();
        a = tslVar;
        tph.A(tsl.class, tslVar);
    }

    private tsl() {
        trb trbVar = trb.a;
        this.d = trbVar;
        this.e = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", tsr.class, "e", tsj.class});
        }
        if (i2 == 3) {
            return new tsl();
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
        synchronized (tsl.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
