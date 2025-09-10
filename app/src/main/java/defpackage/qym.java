package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qym extends tph implements tqs {
    public static final tpo a = new qyl();
    public static final qym b;
    private static volatile tqy n;
    public int c;
    public boolean e;
    public long g;
    public tpw h;
    public tpw i;
    public tpn j;
    public qyo k;
    public boolean l;
    public boolean m;
    public toj d = toj.b;
    public String f = "";

    static {
        qym qymVar = new qym();
        b = qymVar;
        tph.A(qym.class, qymVar);
    }

    private qym() {
        trb trbVar = trb.a;
        this.h = trbVar;
        this.i = trbVar;
        this.j = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", rgk.p, "k", "l", "m"});
        }
        if (i2 == 3) {
            return new qym();
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
        tqy tqyVar = n;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qym.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(b);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
