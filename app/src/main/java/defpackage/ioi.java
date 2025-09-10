package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioi extends tph implements tqs {
    public static final ioi a;
    private static volatile tqy q;
    public int b;
    public int c;
    public boolean d;
    public int f;
    public int g;
    public iol h;
    public boolean i;
    public boolean j;
    public float k;
    public iog l;
    public boolean m;
    public float n;
    public float o;
    public String e = "";
    public tpn p = tpi.a;

    static {
        ioi ioiVar = new ioi();
        a = ioiVar;
        tph.A(ioi.class, ioiVar);
    }

    private ioi() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001\f\u0002\u0007\u0003Ȉ\u0004\u0004\u0005\u0004\u0006ဉ\u0000\u0007\u0007\b\u0007\t\u0001\nဉ\u0001\u000b\u0007\f\u0001\r\u0001\u000e'", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new ioi();
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
        synchronized (ioi.class) {
            tpdVar = q;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                q = tpdVar;
            }
        }
        return tpdVar;
    }
}
