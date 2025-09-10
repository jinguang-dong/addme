package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tuj extends tph implements tqs {
    public static final tuj a;
    private static volatile tqy l;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;

    static {
        tuj tujVar = new tuj();
        a = tujVar;
        tph.A(tuj.class, tujVar);
    }

    private tuj() {
        tpa tpaVar = tpa.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001᠌\u0000\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u0010င\u0002", new Object[]{"b", "c", tyy.b, "e", "f", "g", "h", "i", "j", "k", "d"});
        }
        if (i2 == 3) {
            return new tuj();
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
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tuj.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
