package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfw extends tph implements tqs {
    public static final tfw a;
    private static volatile tqy d;
    public long b;
    public szx c;
    private int e;

    static {
        tfw tfwVar = new tfw();
        a = tfwVar;
        tph.A(tfw.class, tfwVar);
    }

    private tfw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000", new Object[]{"e", KsvNaXS.zuHnLFfxc, "c"});
        }
        if (i2 == 3) {
            return new tfw();
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
        synchronized (tfw.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
