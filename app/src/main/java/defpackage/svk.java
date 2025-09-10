package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svk extends tph implements tqs {
    public static final svk a;
    private static volatile tqy k;
    public int b;
    public tpw c = trb.a;
    public tpq d;
    public tpq e;
    public tpq f;
    public tpq g;
    public long h;
    public long i;
    public int j;

    static {
        svk svkVar = new svk();
        a = svkVar;
        tph.A(svk.class, svkVar);
    }

    private svk() {
        tqh tqhVar = tqh.a;
        this.d = tqhVar;
        this.e = tqhVar;
        this.f = tqhVar;
        this.g = tqhVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002\u0007&\b&", new Object[]{"b", "c", suv.class, "d", "f", "h", "i", "j", "e", "g"});
        }
        if (i2 == 3) {
            return new svk();
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
        synchronized (svk.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }
}
