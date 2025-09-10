package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class soi extends tph implements tqs {
    public static final soi a;
    private static volatile tqy f;
    public int b;
    public float c;
    public float d;
    public float e;

    static {
        soi soiVar = new soi();
        a = soiVar;
        tph.A(soi.class, soiVar);
    }

    private soi() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new soi();
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
        synchronized (soi.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
