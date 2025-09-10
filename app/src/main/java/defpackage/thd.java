package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thd extends tph implements tqs {
    public static final thd a;
    private static volatile tqy d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        thd thdVar = new thd();
        a = thdVar;
        tph.A(thd.class, thdVar);
    }

    private thd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", uCzt.NTAg, "c"});
        }
        if (i2 == 3) {
            return new thd();
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
        synchronized (thd.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
