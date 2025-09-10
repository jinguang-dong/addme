package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzg extends tpf implements tqs {
    public static final tzg a;
    private static volatile tqy f;
    public int b;
    public tud c;
    public int d;
    public tmp e;
    private byte g = 2;

    static {
        tzg tzgVar = new tzg();
        a = tzgVar;
        tph.A(tzg.class, tzgVar);
    }

    private tzg() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", tyy.d, "e"});
        }
        if (i2 == 3) {
            return new tzg();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tzg.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
