package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tua extends tph implements tqs {
    public static final tua a;
    private static volatile tqy b;
    private int c;
    private long d;
    private ttz e;
    private tub f;
    private byte g = 2;

    static {
        tua tuaVar = new tua();
        a = tuaVar;
        tph.A(tua.class, tuaVar);
    }

    private tua() {
        trb trbVar = trb.a;
        toj tojVar = toj.b;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0018\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0017ᐉ\u0007\u0018ᐉ\u0005", new Object[]{"c", "d", "f", "e"});
        }
        if (i2 == 3) {
            return new tua();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tua.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
