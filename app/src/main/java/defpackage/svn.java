package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svn extends tph implements tqs {
    public static final svn a;
    private static volatile tqy d;
    public int b;
    public int c;

    static {
        svn svnVar = new svn();
        a = svnVar;
        tph.A(svn.class, svnVar);
    }

    private svn() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", svp.d});
        }
        if (i2 == 3) {
            return new svn();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (svn.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
