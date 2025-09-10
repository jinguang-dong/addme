package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttr extends tph implements tqs {
    public static final ttr a;
    private static volatile tqy g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;

    static {
        ttr ttrVar = new ttr();
        a = ttrVar;
        tph.A(ttr.class, ttrVar);
    }

    private ttr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ttr();
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
        synchronized (ttr.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
