package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tux extends tph implements tqs {
    public static final tux a;
    private static volatile tqy e;
    public int b;
    public tpm c = tpa.a;
    public float d;

    static {
        tux tuxVar = new tux();
        a = tuxVar;
        tph.A(tux.class, tuxVar);
    }

    private tux() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ခ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tux();
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
        synchronized (tux.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
