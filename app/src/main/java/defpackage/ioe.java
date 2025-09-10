package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioe extends tph implements tqs {
    public static final ioe a;
    private static volatile tqy d;
    public tpw b;
    public tpw c;

    static {
        ioe ioeVar = new ioe();
        a = ioeVar;
        tph.A(ioe.class, ioeVar);
    }

    private ioe() {
        trb trbVar = trb.a;
        this.b = trbVar;
        this.c = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", iod.class, "c", ioc.class});
        }
        if (i2 == 3) {
            return new ioe();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ioe.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
