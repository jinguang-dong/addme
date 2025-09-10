package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tvm extends tph implements tqs {
    public static final tvm a;
    private static volatile tqy j;
    public int b;
    public boolean c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public ttq h;
    public long i;

    static {
        tvm tvmVar = new tvm();
        a = tvmVar;
        tph.A(tvm.class, tvmVar);
    }

    private tvm() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0002\u0016\u0007\u0000\u0000\u0000\u0002ဈ\u0006\u0003ဈ\b\u0004ဈ\t\u0005ဉ\n\u0006ဇ\u0000\u000fဂ\u0012\u0016ဈ\u0002", new Object[]{"b", "e", "f", "g", "h", "c", "i", "d"});
        }
        if (i2 == 3) {
            return new tvm();
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
        synchronized (tvm.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
