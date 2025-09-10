package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igb extends tph implements tqs {
    public static final igb a;
    private static volatile tqy f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        igb igbVar = new igb();
        a = igbVar;
        tph.A(igb.class, igbVar);
    }

    private igb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\f", new Object[]{"b", nWEkBGOQPWQp.EXptJKt, "d", "e"});
        }
        if (i2 == 3) {
            return new igb();
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
        synchronized (igb.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
