package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spn extends tph implements tqs {
    public static final spn a;
    private static volatile tqy i;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        spn spnVar = new spn();
        a = spnVar;
        tph.A(spn.class, spnVar);
    }

    private spn() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", spd.i, "d", "e", "f", spd.h, "g", spd.f, "h", spd.g});
        }
        if (i3 == 3) {
            return new spn();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (spn.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
