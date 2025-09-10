package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spr extends tph implements tqs {
    public static final spr a;
    private static volatile tqy i;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    static {
        spr sprVar = new spr();
        a = sprVar;
        tph.A(spr.class, sprVar);
    }

    private spr() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0003\u0004ခ\u0004\u0005ခ\u0002\u0006ခ\u0005", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
        }
        if (i3 == 3) {
            return new spr();
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
        synchronized (spr.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
