package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szy extends tph implements tqs {
    public static final szy a;
    private static volatile tqy d;
    public tpm b;
    public tpm c;

    static {
        szy szyVar = new szy();
        a = szyVar;
        tph.A(szy.class, szyVar);
    }

    private szy() {
        tpa tpaVar = tpa.a;
        this.b = tpaVar;
        this.c = tpaVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001$\u0002$", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new szy();
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
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (szy.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
