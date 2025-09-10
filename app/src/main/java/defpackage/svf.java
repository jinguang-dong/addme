package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svf extends tph implements tqs {
    public static final svf a;
    private static volatile tqy i;
    public int b;
    public suv c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        svf svfVar = new svf();
        a = svfVar;
        tph.A(svf.class, svfVar);
    }

    private svf() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", str.s, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new svf();
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
        synchronized (svf.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
