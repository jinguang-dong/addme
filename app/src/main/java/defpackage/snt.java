package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class snt extends tph implements tqs {
    public static final snt a;
    private static volatile tqy n;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public tpq k;
    public tpq l;
    public long m;

    static {
        snt sntVar = new snt();
        a = sntVar;
        tph.A(snt.class, sntVar);
    }

    private snt() {
        tqh tqhVar = tqh.a;
        this.k = tqhVar;
        this.l = tqhVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u0014\n\u0014\u000bဂ\b", new Object[]{"b", "c", "d", "e", rgk.k, "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new snt();
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
        tqy tqyVar = n;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (snt.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
