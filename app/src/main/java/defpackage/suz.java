package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suz extends tph implements tqs {
    public static final suz a;
    private static volatile tqy i;
    public int b;
    public long d;
    public svm g;
    public int h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        suz suzVar = new suz();
        a = suzVar;
        tph.A(suz.class, suzVar);
    }

    private suz() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", str.r});
        }
        if (i3 == 3) {
            return new suz();
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
        synchronized (suz.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
