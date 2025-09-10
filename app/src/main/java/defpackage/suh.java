package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suh extends tph implements tqs {
    public static final suh a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        suh suhVar = new suh();
        a = suhVar;
        tph.A(suh.class, suhVar);
    }

    private suh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", CGlJpiVWrCQOq.KXmUCRbUNjsxYWt, str.j, mNLbzhCxd.QeedTrAE});
        }
        if (i2 == 3) {
            return new suh();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (suh.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
