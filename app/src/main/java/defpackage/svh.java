package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svh extends tph implements tqs {
    public static final svh a;
    private static volatile tqy f;
    public int b;
    public tpw c = trb.a;
    public long d;
    public long e;

    static {
        svh svhVar = new svh();
        a = svhVar;
        tph.A(svh.class, svhVar);
    }

    private svh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"b", ibINv.bHYcIkibStoR, svg.class, "d", "e"});
        }
        if (i2 == 3) {
            return new svh();
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
        synchronized (svh.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
