package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suq extends tph implements tqs {
    public static final suq a;
    private static volatile tqy g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public tpw f = trb.a;

    static {
        suq suqVar = new suq();
        a = suqVar;
        tph.A(suq.class, suqVar);
    }

    private suq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", sup.class});
        }
        if (i2 == 3) {
            return new suq();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (suq.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
