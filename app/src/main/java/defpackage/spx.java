package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spx extends tph implements tqs {
    public static final spx a;
    private static volatile tqy l;
    public int b;
    public int c;
    public tpm d;
    public tpm e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public tpn k;

    static {
        spx spxVar = new spx();
        a = spxVar;
        tph.A(spx.class, spxVar);
    }

    private spx() {
        tpa tpaVar = tpa.a;
        this.d = tpaVar;
        this.e = tpaVar;
        this.k = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001᠌\u0000\u0002\u0013\u0003\u0013\u0004င\u0001\u0006င\u0003\u0007င\u0004\tင\u0006\nဇ\u0007\u000bࠬ", new Object[]{"b", "c", spd.m, "d", "e", "f", "g", "h", "i", "j", "k", tyy.u});
        }
        if (i2 == 3) {
            return new spx();
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
        synchronized (spx.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
