package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhf extends tph implements tqs {
    public static final rhf a;
    private static volatile tqy e;
    public int b;
    public tpn c = tpi.a;
    public int d = 1;

    static {
        rhf rhfVar = new rhf();
        a = rhfVar;
        tph.A(rhf.class, rhfVar);
    }

    private rhf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ࠞ\u0004᠌\u0002", new Object[]{"b", IQwwK.CBAXscJiTuERq, rgk.c, "d", rgk.d});
        }
        if (i2 == 3) {
            return new rhf();
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
        synchronized (rhf.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
