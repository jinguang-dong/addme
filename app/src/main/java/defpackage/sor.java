package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sor extends tph implements tqs {
    public static final sor a;
    private static volatile tqy m;
    public int b;
    public sob c;
    public long d;
    public int e;
    public int f;
    public int g;
    public float h;
    public srn i;
    public boolean j;
    public srt k;
    public boolean l;

    static {
        sor sorVar = new sor();
        a = sorVar;
        tph.A(sor.class, sorVar);
    }

    private sor() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005\u0007ဉ\u0006\bဇ\u0007\tဉ\b\nဇ\t", new Object[]{"b", "c", "d", "e", rgk.k, "f", sri.n, "g", sri.m, "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new sor();
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
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sor.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
