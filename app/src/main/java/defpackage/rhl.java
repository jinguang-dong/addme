package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhl extends tph implements tqs {
    public static final rhl a;
    private static volatile tqy e;
    public int b;
    public tty c;
    public float d;
    private byte f = 2;

    static {
        rhl rhlVar = new rhl();
        a = rhlVar;
        tph.A(rhl.class, rhlVar);
    }

    private rhl() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new rhl();
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
        synchronized (rhl.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
