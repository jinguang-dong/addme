package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sni extends tph implements tqs {
    public static final sni a;
    private static volatile tqy f;
    public int b;
    public String c = "";
    public tpw d = trb.a;
    public long e;

    static {
        sni sniVar = new sni();
        a = sniVar;
        tph.A(sni.class, sniVar);
    }

    private sni() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new sni();
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
        synchronized (sni.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
