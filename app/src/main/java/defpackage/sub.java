package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sub extends tph implements tqs {
    public static final sub a;
    private static volatile tqy e;
    public int b;
    public float c;
    public float d;

    static {
        sub subVar = new sub();
        a = subVar;
        tph.A(sub.class, subVar);
    }

    private sub() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", CGlJpiVWrCQOq.pLbXDM});
        }
        if (i2 == 3) {
            return new sub();
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
        synchronized (sub.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
