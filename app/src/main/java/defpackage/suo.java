package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class suo extends tph implements tqs {
    public static final suo a;
    private static volatile tqy l;
    public int b;
    public sun c;
    public int e;
    public int h;
    public sut k;
    private byte m = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        suo suoVar = new suo();
        a = suoVar;
        tph.A(suo.class, suoVar);
    }

    private suo() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new suo();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (suo.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
