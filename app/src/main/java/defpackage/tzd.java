package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzd extends tph implements tqs {
    public static final tpo a = new tzb(0);
    public static final tzd b;
    private static volatile tqy d;
    public tpn c;

    static {
        tzd tzdVar = new tzd();
        b = tzdVar;
        tph.A(tzd.class, tzdVar);
    }

    private tzd() {
        trb trbVar = trb.a;
        this.c = tpi.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002ࠬ", new Object[]{"c", tyy.c});
        }
        if (i2 == 3) {
            return new tzd();
        }
        if (i2 == 4) {
            return new tpc(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = d;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tzd.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(b);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
