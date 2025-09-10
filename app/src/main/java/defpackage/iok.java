package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iok extends tph implements tqs {
    public static final iok a;
    private static volatile tqy f;
    public int b;
    public long c;
    public tpm d;
    public tpm e;

    static {
        iok iokVar = new iok();
        a = iokVar;
        tph.A(iok.class, iokVar);
    }

    private iok() {
        tpa tpaVar = tpa.a;
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
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0002$\u0003$", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new iok();
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
        synchronized (iok.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
