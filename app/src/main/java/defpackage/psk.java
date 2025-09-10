package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psk extends tph implements tqs {
    public static final psk a;
    private static volatile tqy g;
    public int b;
    public String c = "";
    public String d = "";
    public int e = -1;
    public int f = -1;

    static {
        psk pskVar = new psk();
        a = pskVar;
        tph.A(psk.class, pskVar);
    }

    private psk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = nvd.c;
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", tplVar, "f", tplVar});
        }
        if (i2 == 3) {
            return new psk();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (psk.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
