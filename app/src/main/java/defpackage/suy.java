package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suy extends tph implements tqs {
    public static final suy a;
    private static volatile tqy k;
    public int b;
    public int c;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public String d = "";
    public String f = "";
    public String j = "";

    static {
        suy suyVar = new suy();
        a = suyVar;
        tph.A(suy.class, suyVar);
    }

    private suy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"b", "c", str.p, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new suy();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (suy.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
