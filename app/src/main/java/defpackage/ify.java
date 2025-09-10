package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ify extends tph implements tqs {
    public static final ify a;
    private static volatile tqy j;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public toj b = toj.b;
    public String h = "";
    public tpw i = trb.a;

    static {
        ify ifyVar = new ify();
        a = ifyVar;
        tph.A(ify.class, ifyVar);
    }

    private ify() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\b\u0000\u0000\u0002\t\b\u0000\u0001\u0000\u0002\n\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0004\bȈ\t\u001b", new Object[]{"b", "c", "d", "e", "f", "g", CGlJpiVWrCQOq.fQedMMWgvrPUou, "i", ifr.class});
        }
        if (i2 == 3) {
            return new ify();
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
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ify.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
