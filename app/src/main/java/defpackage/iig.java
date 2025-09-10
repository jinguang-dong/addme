package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iig extends tph implements tqs {
    public static final iig a;
    private static volatile tqy e;
    public int b;
    public tpw c = trb.a;
    public tyz d;

    static {
        iig iigVar = new iig();
        a = iigVar;
        tph.A(iig.class, iigVar);
    }

    private iig() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", iij.class, "d"});
        }
        if (i2 == 3) {
            return new iig();
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
        synchronized (iig.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
