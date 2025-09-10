package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stn extends tph implements tqs {
    public static final stn a;
    private static volatile tqy k;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h = "";
    public boolean i;
    public boolean j;

    static {
        stn stnVar = new stn();
        a = stnVar;
        tph.A(stn.class, stnVar);
    }

    private stn() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", ssj.s, "e", ssj.t, "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new stn();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (stn.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
