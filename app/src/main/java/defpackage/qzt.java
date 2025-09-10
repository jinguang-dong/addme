package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzt extends tph implements tqs {
    public static final qzt a;
    private static volatile tqy h;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        qzt qztVar = new qzt();
        a = qztVar;
        tph.A(qzt.class, qztVar);
    }

    private qzt() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"i", "b", "c", "d", rgk.p, "e", "g", "f"});
        }
        if (i2 == 3) {
            return new qzt();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qzt.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
