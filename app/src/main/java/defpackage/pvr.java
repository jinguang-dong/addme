package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvr extends tph implements tqs {
    public static final pvr a;
    private static volatile tqy i;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public int h;
    public String c = "";
    public String g = "";

    static {
        pvr pvrVar = new pvr();
        a = pvrVar;
        tph.A(pvr.class, pvrVar);
    }

    private pvr() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"b", "c", "d", nvd.r, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new pvr();
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
        synchronized (pvr.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
