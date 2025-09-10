package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzc extends tph implements tqs {
    public static final uzc a;
    private static volatile tqy j;
    public int b;
    public int e;
    public long f;
    public boolean h;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        uzc uzcVar = new uzc();
        a = uzcVar;
        tph.A(uzc.class, uzcVar);
    }

    private uzc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007ဈ\u0007\bဇ\u0006", new Object[]{"b", "c", "d", "e", tyy.n, "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new uzc();
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
        synchronized (uzc.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
