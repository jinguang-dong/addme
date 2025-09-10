package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhe extends tph implements tqs {
    public static final rhe a;
    private static volatile tqy f;
    public int b;
    public int c;
    public String d = "";
    public tpw e = trb.a;

    static {
        rhe rheVar = new rhe();
        a = rheVar;
        tph.A(rhe.class, rheVar);
    }

    private rhe() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"b", "c", rgk.c, "d", "e", rhd.class});
        }
        if (i2 == 3) {
            return new rhe();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rhe.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
