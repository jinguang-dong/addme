package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szz extends tph implements tqs {
    public static final szz a;
    private static volatile tqy h;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public szw f;
    public int g;

    static {
        szz szzVar = new szz();
        a = szzVar;
        tph.A(szz.class, szzVar);
    }

    private szz() {
        trb trbVar = trb.a;
        toj tojVar = toj.b;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0005င\u0004\u0007ဇ\u0005\bဉ\u0006\tင\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new szz();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (szz.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
