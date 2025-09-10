package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvg extends tph implements tqs {
    public static final pvg a;
    private static volatile tqy i;
    public int b;
    public pvl c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        pvg pvgVar = new pvg();
        a = pvgVar;
        tph.A(pvg.class, pvgVar);
    }

    private pvg() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"b", "c", "d", GdpuLBytnYW.YRrZTSJfupCyrqj, "g", "h", "e"});
        }
        if (i3 == 3) {
            return new pvg();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pvg.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
