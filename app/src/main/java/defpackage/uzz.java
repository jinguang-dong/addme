package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzz extends tph implements tqs {
    public static final uzz a;
    private static volatile tqy e;
    public int b;
    public tou c;
    public tou d;
    private byte f = 2;

    static {
        uzz uzzVar = new uzz();
        a = uzzVar;
        tph.A(uzz.class, uzzVar);
    }

    private uzz() {
        tqh tqhVar = tqh.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new uzz();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uzz.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
