package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tuz extends tph implements tqs {
    public static final tuz a;
    private static volatile tqy t;
    public int b;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean p;
    public boolean q;
    public tvm r;
    public tuh s;
    private int u;
    private tvl v;
    private tvo w;
    private byte x = 2;
    public tpw c = trb.a;
    public String m = "";
    public String n = "";
    public String o = "";

    static {
        tuz tuzVar = new tuz();
        a = tuzVar;
        tph.A(tuz.class, tuzVar);
    }

    private tuz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.x);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0013\u0000\u0002\u00076\u0013\u0000\u0001\u0002\u0007ဉ\u0013\bင\u0006\u000e᠌\u0005\u0016ဉ\u001b\u0018Л\u001dᐉ\u001f\u001eဇ\u0019\u001fဇ\t ဇ\u0001%ဈ\u0016&ဈ\u0017'ဈ\u0018(ဇ\u001a)ဇ\r*ဉ\".ဇ\u00020ဇ\f5᠌\u00006᠌\u000e", new Object[]{"b", "u", "v", "h", "g", rgk.s, "r", "c", ttp.class, "s", "p", "i", "e", "m", "n", "o", "q", "k", "w", "f", "j", "d", rgk.q, "l", rgk.r});
        }
        if (i2 == 3) {
            return new tuz();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.x = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = t;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tuz.class) {
            tpdVar = t;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                t = tpdVar;
            }
        }
        return tpdVar;
    }
}
