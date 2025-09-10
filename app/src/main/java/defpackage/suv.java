package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suv extends tph implements tqs {
    public static final suv a;
    private static volatile tqy l;
    public int b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean k;
    public String c = "";
    public String e = "";
    public String j = "";

    static {
        suv suvVar = new suv();
        a = suvVar;
        tph.A(suv.class, suvVar);
    }

    private suv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", TOnSyMaYeslEl.vxjUZgxCOtCv, "h", "i", "j", "g", "k"});
        }
        if (i2 == 3) {
            return new suv();
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
        synchronized (suv.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
