package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzu extends tph implements tqs {
    public static final uzu a;
    private static volatile tqy y;
    public int b;
    public long c;
    public uyi f;
    public uyk g;
    public uzf h;
    public uzq i;
    public uxp j;
    public uzm k;
    public uyn l;
    public uxl m;
    public uxy n;
    public uyz o;
    public tpw p;
    public uzi q;
    public tpw r;
    public tpw s;
    public uzc t;
    public uzt u;
    public uzj v;
    public uyd w;
    public uzb x;
    private uzd z;
    private byte A = 2;
    public String d = "";
    public String e = "";

    static {
        uzu uzuVar = new uzu();
        a = uzuVar;
        tph.A(uzu.class, uzuVar);
    }

    private uzu() {
        tpi tpiVar = tpi.a;
        trb trbVar = trb.a;
        this.p = trbVar;
        this.r = trbVar;
        this.s = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.A);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0017\u0000\u0001\u0001'\u0017\u0000\u0003\n\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011\"\u001b%Л&\u001b'ဉ\u0014", new Object[]{"b", "f", "c", "d", "t", "g", "h", "u", "i", "j", "k", "w", "l", "e", "x", "v", "z", "o", "q", "m", "s", uye.class, "p", uzx.class, "r", uzn.class, "n"});
        }
        if (i2 == 3) {
            return new uzu();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.A = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = y;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzu.class) {
            tpdVar = y;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                y = tpdVar;
            }
        }
        return tpdVar;
    }
}
