package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtf extends tph implements tqs {
    public static final qtf a;
    private static volatile tqy e;
    public String b = "";
    public tpw c = trb.a;
    public boolean d;
    private int f;

    static {
        qtf qtfVar = new qtf();
        a = qtfVar;
        tph.A(qtf.class, qtfVar);
    }

    private qtf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", qte.class, "d"});
        }
        if (i2 == 3) {
            return new qtf();
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
        synchronized (qtf.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
