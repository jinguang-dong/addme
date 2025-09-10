package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tho extends tph implements tqs {
    public static final tho a;
    private static volatile tqy i;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    private int j;
    public int b = 1;
    public float h = -1.0f;

    static {
        tho thoVar = new tho();
        a = thoVar;
        tph.A(tho.class, thoVar);
    }

    private tho() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new tho();
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
        synchronized (tho.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
