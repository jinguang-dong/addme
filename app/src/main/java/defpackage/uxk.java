package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxk extends tph implements tqs {
    public static final uxk a;
    private static volatile tqy p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public uxj l;
    public uyd m;
    public uzv n;
    public uzy o;
    private byte q = 2;
    public String c = "";

    static {
        uxk uxkVar = new uxk();
        a = uxkVar;
        tph.A(uxk.class, uxkVar);
    }

    private uxk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", tyy.f, "e", "f", tyy.e, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new uxk();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = p;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uxk.class) {
            tpdVar = p;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                p = tpdVar;
            }
        }
        return tpdVar;
    }
}
