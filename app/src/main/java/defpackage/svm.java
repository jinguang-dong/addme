package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svm extends tph implements tqs {
    public static final svm a;
    private static volatile tqy i;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        svm svmVar = new svm();
        a = svmVar;
        tph.A(svm.class, svmVar);
    }

    private svm() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", str.n, "e", "f", "g", "h", str.o});
        }
        if (i3 == 3) {
            return new svm();
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
        synchronized (svm.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
