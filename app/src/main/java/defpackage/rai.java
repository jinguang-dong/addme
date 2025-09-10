package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rai extends tph implements tqs {
    public static final rai a;
    private static volatile tqy h;
    public int b;
    public long f;
    public String c = "";
    public toj d = toj.b;
    public String e = "";
    public tpw g = trb.a;

    static {
        rai raiVar = new rai();
        a = raiVar;
        tph.A(rai.class, raiVar);
    }

    private rai() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", raj.class});
        }
        if (i2 == 3) {
            return new rai();
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
        synchronized (rai.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
