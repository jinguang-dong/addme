package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tti extends tph implements tqs {
    public static final tti a;
    private static volatile tqy i;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int f = -1;
    public float g = -1.0f;
    public float h = -1.0f;
    private int j;

    static {
        tti ttiVar = new tti();
        a = ttiVar;
        tph.A(tti.class, ttiVar);
    }

    private tti() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new tti();
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
        synchronized (tti.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
