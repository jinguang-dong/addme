package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class spp extends tph implements tqs {
    public static final spp a;
    private static volatile tqy j;
    public int b;
    public long c;
    public int d;
    public float e;
    public int f;
    public String g = "";
    public float h;
    public boolean i;

    static {
        spp sppVar = new spp();
        a = sppVar;
        tph.A(spp.class, sppVar);
    }

    private spp() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", spd.j, "e", "f", snl.e, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new spp();
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
        synchronized (spp.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
