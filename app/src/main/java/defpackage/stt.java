package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class stt extends tph implements tqs {
    public static final stt a;
    private static volatile tqy g;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        stt sttVar = new stt();
        a = sttVar;
        tph.A(stt.class, sttVar);
    }

    private stt() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", INRGuObcrHjSQz.nGcnIrm, rgk.l, "d", rgk.m, "e", "f"});
        }
        if (i2 == 3) {
            return new stt();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (stt.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
