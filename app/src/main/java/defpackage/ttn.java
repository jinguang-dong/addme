package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttn extends tpf implements tqs {
    public static final ttn a;
    private static volatile tqy l;
    public int b;
    public ttl c;
    public tpw d;
    public float e;
    public float f;
    public float g;
    public float h;
    public tpw i;
    public long j;
    public long k;
    private byte m = 2;

    static {
        ttn ttnVar = new ttn();
        a = ttnVar;
        tph.A(ttn.class, ttnVar);
    }

    private ttn() {
        trb trbVar = trb.a;
        this.d = trbVar;
        this.i = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\b\u001b\tဃ\u0007\fဃ\u0006", new Object[]{"b", "c", "d", ttm.class, "e", "f", "g", "h", "i", ttk.class, "k", "j"});
        }
        if (i2 == 3) {
            return new ttn();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ttn.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
