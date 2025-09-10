package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyn extends tph implements tqs {
    public static final tpo a = new tzb(1);
    public static final qyn b;
    private static volatile tqy m;
    public int c;
    public boolean e;
    public tpw g;
    public tpw h;
    public tpn i;
    public qyo j;
    public boolean k;
    public boolean l;
    public toj d = toj.b;
    public String f = "";

    static {
        qyn qynVar = new qyn();
        b = qynVar;
        tph.A(qyn.class, qynVar);
    }

    private qyn() {
        trb trbVar = trb.a;
        this.g = trbVar;
        this.h = trbVar;
        this.i = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", rgk.p, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new qyn();
        }
        if (i2 == 4) {
            return new tpc(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qyn.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(b);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
