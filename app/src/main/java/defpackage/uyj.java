package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyj extends tph implements tqs {
    public static final uyj a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public String e;
    public tpq f;
    public uyl g;
    private byte i = 2;

    static {
        uyj uyjVar = new uyj();
        a = uyjVar;
        tph.A(uyj.class, uyjVar);
    }

    private uyj() {
        trb trbVar = trb.a;
        this.e = "";
        this.f = tqh.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005င\u0005\b᠌\b\u0011ဈ\u0013\u0015(\u0016ဉ\u0016", new Object[]{"b", "c", "d", tyy.j, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new uyj();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uyj.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
