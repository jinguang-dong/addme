package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spq extends tph implements tqs {
    public static final spq a;
    private static volatile tqy h;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;

    static {
        spq spqVar = new spq();
        a = spqVar;
        tph.A(spq.class, spqVar);
    }

    private spq() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"b", "c", spd.k, "d", "e", "f", YyLACfm.TmfaCJeNBu});
        }
        if (i2 == 3) {
            return new spq();
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
        synchronized (spq.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
