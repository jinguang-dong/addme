package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tto extends tph implements tqs {
    public static final tto a;
    private static volatile tqy c;
    private byte d = 2;
    public tpw b = trb.a;

    static {
        tto ttoVar = new tto();
        a = ttoVar;
        tph.A(tto.class, ttoVar);
    }

    private tto() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", ttn.class});
        }
        if (i2 == 3) {
            return new tto();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tto.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
