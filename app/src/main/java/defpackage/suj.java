package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class suj extends tph implements tqs {
    public static final suj a;
    private static volatile tqy j;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    private byte k = 2;
    public String h = "";
    public String i = "";

    static {
        suj sujVar = new suj();
        a = sujVar;
        tph.A(suj.class, sujVar);
    }

    private suj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003င\u0002\u0007င\u0006\b᠌\u0007\tဈ\b\nဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", str.l, "h", "i"});
        }
        if (i2 == 3) {
            return new suj();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (suj.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
