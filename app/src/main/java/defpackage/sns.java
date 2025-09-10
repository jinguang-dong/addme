package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sns extends tph implements tqs {
    public static final sns a;
    private static volatile tqy j;
    public int b;
    public srj c;
    public tpw d;
    public float e;
    public tpw f;
    public soj g;
    public sqy h;
    public ssr i;

    static {
        sns snsVar = new sns();
        a = snsVar;
        tph.A(sns.class, snsVar);
    }

    private sns() {
        trb trbVar = trb.a;
        this.d = trbVar;
        this.f = trbVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0002\u0000\u0002ဉ\u0001\u0004\u001b\u0005ခ\u0002\u0007\u001b\bဉ\u0003\nဉ\u0005\u000bဉ\u0006", new Object[]{"b", "c", "d", spp.class, "e", "f", srb.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new sns();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sns.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
