package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class snz extends tph implements tqs {
    public static final snz a;
    private static volatile tqy f;
    public int b;
    public int c;
    public long d;
    public tpw e = trb.a;

    static {
        snz snzVar = new snz();
        a = snzVar;
        tph.A(snz.class, snzVar);
    }

    private snz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"b", "c", snl.d, "d", "e", ssa.class});
        }
        if (i2 == 3) {
            return new snz();
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
        synchronized (snz.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
