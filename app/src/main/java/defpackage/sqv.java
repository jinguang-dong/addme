package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqv extends tph implements tqs {
    public static final sqv a;
    private static volatile tqy i;
    public int b;
    public int c;
    public float d;
    public boolean e;
    public int f;
    public long g;
    public long h;

    static {
        sqv sqvVar = new sqv();
        a = sqvVar;
        tph.A(sqv.class, sqvVar);
    }

    private sqv() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0006ခ\u0005\u0007ဇ\u0006\b᠌\u0007\tဂ\b\nဂ\t", new Object[]{"b", "c", sqk.l, "d", "e", "f", sqk.m, "g", "h"});
        }
        if (i3 == 3) {
            return new sqv();
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
        synchronized (sqv.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
