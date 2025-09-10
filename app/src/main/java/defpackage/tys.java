package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tys extends tph implements tqs {
    public static final tys a;
    private static volatile tqy e;
    public int b;
    public int c;
    public int d;

    static {
        tys tysVar = new tys();
        a = tysVar;
        tph.A(tys.class, tysVar);
    }

    private tys() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", KsvNaXS.FrObFcu, "d"});
        }
        if (i2 == 3) {
            return new tys();
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
        synchronized (tys.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
