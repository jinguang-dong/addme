package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uyd extends tpf implements tqs {
    public static final uyd a;
    private static volatile tqy b;
    private byte c = 2;

    static {
        uyd uydVar = new uyd();
        a = uydVar;
        tph.A(uyd.class, uydVar);
    }

    private uyd() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new uyd();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uyd.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
