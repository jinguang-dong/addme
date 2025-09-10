package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptr extends tpf implements tqs {
    public static final ptr a;
    private static volatile tqy j;
    public int b;
    public long e;
    public long f;
    public tnw g;
    public boolean h;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        ptr ptrVar = new ptr();
        a = ptrVar;
        tph.A(ptr.class, ptrVar);
    }

    private ptr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ptr();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ptr.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
