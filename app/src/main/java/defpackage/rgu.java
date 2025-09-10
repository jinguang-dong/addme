package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgu extends tph implements tqs {
    public static final rgu a;
    private static volatile tqy h;
    public int b;
    public Object d;
    public rgx e;
    public boolean f;
    public int g;
    public int c = 0;
    private byte i = 2;

    static {
        rgu rguVar = new rgu();
        a = rguVar;
        tph.A(rgu.class, rguVar);
    }

    private rgu() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0005:\u0000\u0006:\u0000\bင\u0005", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new rgu();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgu.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
