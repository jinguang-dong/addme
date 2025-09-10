package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igc extends tph implements tqs {
    public static final igc a;
    private static volatile tqy m;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public float l;

    static {
        igc igcVar = new igc();
        a = igcVar;
        tph.A(igc.class, igcVar);
    }

    private igc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0001\b\u0001\t\u0001\n\u0007\u000b\u0007", new Object[]{"b", "c", "d", "e", "f", "h", "j", "k", "l", "g", "i"});
        }
        if (i2 == 3) {
            return new igc();
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
        synchronized (igc.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
