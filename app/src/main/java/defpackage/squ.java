package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class squ extends tph implements tqs {
    public static final squ a;
    private static volatile tqy t;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public String r = "";
    public String s = "";

    static {
        squ squVar = new squ();
        a = squVar;
        tph.A(squ.class, squVar);
    }

    private squ() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007\tဇ\b\nင\t\u000bဇ\n\rဇ\f\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011ဈ\u0010\u0012ဈ\u0011", new Object[]{"b", "c", "d", "e", sqk.k, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
        }
        if (i2 == 3) {
            return new squ();
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
        tqy tqyVar = t;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (squ.class) {
            tpdVar = t;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                t = tpdVar;
            }
        }
        return tpdVar;
    }
}
