package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttb extends tph implements tqs {
    public static final ttb a;
    private static volatile tqy j;
    public int b;
    public int c;
    public int d;
    public int e;
    public toj f;
    public toj g;
    public String h;
    public tpn i;

    static {
        ttb ttbVar = new ttb();
        a = ttbVar;
        tph.A(ttb.class, ttbVar);
    }

    private ttb() {
        toj tojVar = toj.b;
        this.f = tojVar;
        this.g = tojVar;
        this.h = "";
        this.i = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007'", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ttb();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ttb.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
