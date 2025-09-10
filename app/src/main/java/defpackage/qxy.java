package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxy extends tph implements tqs {
    public static final qxy a;
    private static volatile tqy j;
    public int b;
    public String c = "";
    public toj d = toj.b;
    public String e = "";
    public tpw f;
    public tpw g;
    public boolean h;
    public long i;

    static {
        qxy qxyVar = new qxy();
        a = qxyVar;
        tph.A(qxy.class, qxyVar);
    }

    private qxy() {
        trb trbVar = trb.a;
        this.f = trbVar;
        this.g = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", qxz.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new qxy();
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
        synchronized (qxy.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
