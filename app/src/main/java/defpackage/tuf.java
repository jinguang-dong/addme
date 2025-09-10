package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tuf extends tph implements tqs {
    public static final tuf a;
    private static volatile tqy c;
    public long b;
    private int d;

    static {
        tuf tufVar = new tuf();
        a = tufVar;
        tph.A(tuf.class, tufVar);
    }

    private tuf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဃ\u0001", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new tuf();
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
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tuf.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
