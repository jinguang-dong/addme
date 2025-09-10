package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lha extends tph implements tqs {
    public static final lha a;
    private static volatile tqy j;
    public int b;
    public lgz c;
    public boolean f;
    public boolean h;
    public lgz i;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        lha lhaVar = new lha();
        a = lhaVar;
        tph.A(lha.class, lhaVar);
    }

    private lha() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new lha();
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
        synchronized (lha.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
