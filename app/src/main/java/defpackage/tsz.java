package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsz extends tph implements tqs {
    public static final tsz a;
    private static volatile tqy e;
    public int b;
    public long c;
    public float d;
    private byte f = 2;

    static {
        tsz tszVar = new tsz();
        a = tszVar;
        tph.A(tsz.class, tszVar);
    }

    private tsz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tsz();
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
        synchronized (tsz.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
