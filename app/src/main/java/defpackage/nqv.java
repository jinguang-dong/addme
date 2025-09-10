package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqv extends tph implements tqs {
    public static final nqv a;
    private static volatile tqy d;
    public toj b = toj.b;
    public long c;

    static {
        nqv nqvVar = new nqv();
        a = nqvVar;
        tph.A(nqv.class, nqvVar);
    }

    private nqv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new nqv();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (nqv.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
