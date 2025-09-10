package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thw extends tph implements tqs {
    public static final thw a;
    private static volatile tqy d;
    public double b;
    public int c;
    private int e;

    static {
        thw thwVar = new thw();
        a = thwVar;
        tph.A(thw.class, thwVar);
    }

    private thw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"e", "b", ibINv.gHPxwoPMSXaXFJ});
        }
        if (i2 == 3) {
            return new thw();
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
        synchronized (thw.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
