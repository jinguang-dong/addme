package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyr extends tph implements tqs {
    public static final uyr a;
    private static volatile tqy x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public uyp u;
    public uyp v;
    public tqm w = tqm.a;

    static {
        uyr uyrVar = new uyr();
        a = uyrVar;
        tph.A(uyr.class, uyrVar);
    }

    private uyr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", uyq.a, "g", "j", "h", "m", "n", "s", tyy.l, "o", "p", "t"});
        }
        if (i2 == 3) {
            return new uyr();
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
        tqy tqyVar = x;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uyr.class) {
            tpdVar = x;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                x = tpdVar;
            }
        }
        return tpdVar;
    }
}
