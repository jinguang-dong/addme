package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spf extends tph implements tqs {
    private static volatile tqy A;
    public static final spf a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public spc i;
    public spc j;
    public soy k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public soz u;
    public soz v;
    public long x;
    public long z;
    public String w = "";
    public tpw y = trb.a;

    static {
        spf spfVar = new spf();
        a = spfVar;
        tph.A(spf.class, spfVar);
    }

    private spf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n᠌\t\u000bဇ\n\fဇ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဈ\u0014\u0016ဂ\u0015\u0017\u001b\u0018ဂ\u0016", new Object[]{"b", "c", spd.c, "d", "e", "f", "g", "h", "i", "j", "k", "l", spd.a, "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", spa.class, "z"});
        }
        if (i2 == 3) {
            return new spf();
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
        tqy tqyVar = A;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (spf.class) {
            tpdVar = A;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                A = tpdVar;
            }
        }
        return tpdVar;
    }
}
