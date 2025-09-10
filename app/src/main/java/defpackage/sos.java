package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sos extends tph implements tqs {
    public static final sos a;
    private static volatile tqy q;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public tpw j = trb.a;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;

    static {
        sos sosVar = new sos();
        a = sosVar;
        tph.A(sos.class, sosVar);
    }

    private sos() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\tဂ\u0005\nဂ\u0006\u000e\u001b\u000fဂ\r\u0010ဂ\u000e\u0011ဂ\u000f\u0012ဂ\u0010\u0013ဂ\u0011\u0014ဂ\u0012", new Object[]{"b", "c", "d", "g", "h", "i", "e", "f", "j", srq.class, "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new sos();
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
        tqy tqyVar = q;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sos.class) {
            tpdVar = q;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                q = tpdVar;
            }
        }
        return tpdVar;
    }
}
