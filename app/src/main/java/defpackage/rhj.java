package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhj extends tph implements tqs {
    public static final rhj a;
    private static volatile tqy f;
    public int b;
    public int c;
    public long d;
    public long e;

    static {
        rhj rhjVar = new rhj();
        a = rhjVar;
        tph.A(rhj.class, rhjVar);
    }

    private rhj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0002\u0003ဂ\u0003", new Object[]{PNlJufQ.vNVrC, "c", "d", "e"});
        }
        if (i2 == 3) {
            return new rhj();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rhj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
