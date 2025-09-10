package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puh extends tph implements tqs {
    public static final puh a;
    private static volatile tqy e;
    public int b;
    public pug d;
    private byte f = 2;
    public tpw c = trb.a;

    static {
        puh puhVar = new puh();
        a = puhVar;
        tph.A(puh.class, puhVar);
    }

    private puh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "c", puf.class, "d"});
        }
        if (i2 == 3) {
            return new puh();
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
        synchronized (puh.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
