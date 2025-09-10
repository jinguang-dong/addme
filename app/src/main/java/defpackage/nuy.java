package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nuy extends tph implements tqs {
    public static final nuy a;
    private static volatile tqy c;
    public int b;
    private nux d;

    static {
        nuy nuyVar = new nuy();
        a = nuyVar;
        tph.A(nuy.class, nuyVar);
    }

    private nuy() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{pAAtrB.lbsGDvIt, "d"});
        }
        if (i2 == 3) {
            return new nuy();
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
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (nuy.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
