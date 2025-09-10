package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snu extends tph implements tqs {
    public static final snu a;
    private static volatile tqy e;
    public int b;
    public double c;
    public int d;

    static {
        snu snuVar = new snu();
        a = snuVar;
        tph.A(snu.class, snuVar);
    }

    private snu() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"b", pAAtrB.xLBmHDrplm, "d"});
        }
        if (i2 == 3) {
            return new snu();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (snu.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
