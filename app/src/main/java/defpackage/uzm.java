package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uzm extends tpf implements tqs {
    public static final uzm a;
    private static volatile tqy o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public uzr j;
    public int l;
    public int m;
    public uzr n;
    private byte p = 2;
    public tpw k = trb.a;

    static {
        uzm uzmVar = new uzm();
        a = uzmVar;
        tph.A(uzm.class, uzmVar);
    }

    private uzm() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", uzk.class, "e", "g", "h", "j", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new uzm();
        }
        if (i2 == 4) {
            return new uzl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = o;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzm.class) {
            tpdVar = o;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                o = tpdVar;
            }
        }
        return tpdVar;
    }
}
