package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svd extends tph implements tqs {
    public static final svd a;
    private static volatile tqy g;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        svd svdVar = new svd();
        a = svdVar;
        tph.A(svd.class, svdVar);
    }

    private svd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", GdpuLBytnYW.YQPwF, str.u, "d", "e", CGlJpiVWrCQOq.mLfc});
        }
        if (i2 == 3) {
            return new svd();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (svd.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
