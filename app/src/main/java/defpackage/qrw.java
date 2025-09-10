package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrw extends tph implements tqs {
    public static final qrw a;
    private static volatile tqy f;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        qrw qrwVar = new qrw();
        a = qrwVar;
        tph.A(qrw.class, qrwVar);
    }

    private qrw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"g", "b", "c", "d", HHdu.FyBGgMTqQ});
        }
        if (i2 == 3) {
            return new qrw();
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
        synchronized (qrw.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
