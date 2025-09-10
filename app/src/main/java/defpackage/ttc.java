package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttc extends tph implements tqs {
    public static final ttc a;
    private static volatile tqy h;
    public int b;
    public long c;
    public long d;
    public float e;
    public tpm f;
    public tpm g;
    private ttn i;
    private byte j = 2;

    static {
        ttc ttcVar = new ttc();
        a = ttcVar;
        tph.A(ttc.class, ttcVar);
    }

    private ttc() {
        tpa tpaVar = tpa.a;
        this.f = tpaVar;
        this.g = tpaVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004$\u0005$\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
        }
        if (i2 == 3) {
            return new ttc();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ttc.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
