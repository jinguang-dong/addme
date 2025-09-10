package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvt extends tph implements tqs {
    public static final tvt a;
    private static volatile tqy d;
    public String b = "";
    public tpw c = trb.a;
    private int e;

    static {
        tvt tvtVar = new tvt();
        a = tvtVar;
        tph.A(tvt.class, tvtVar);
    }

    private tvt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", yoGAhrpjU.cSmKWMIZAD, tvs.class});
        }
        if (i2 == 3) {
            return new tvt();
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
        synchronized (tvt.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
