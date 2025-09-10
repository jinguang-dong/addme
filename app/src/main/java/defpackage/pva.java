package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pva extends tph implements tqs {
    public static final pva a;
    private static volatile tqy r;
    public int b;
    public long e;
    public int f;
    public tvy h;
    public long j;
    public tvy k;
    public int m;
    public int n;
    public tnw q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public tpw l = trb.a;
    public String o = "";
    public String p = "";

    static {
        pva pvaVar = new pva();
        a = pvaVar;
        tph.A(pva.class, pvaVar);
    }

    private pva() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", pvd.class, "i", "f", nvd.l, "j", "m", nvd.k, "n", nvd.j, "o", "p", "q"});
        }
        if (i2 == 3) {
            return new pva();
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
        tqy tqyVar = r;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pva.class) {
            tpdVar = r;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                r = tpdVar;
            }
        }
        return tpdVar;
    }
}
