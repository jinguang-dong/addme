package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgh extends tph implements tqs {
    public static final tgh a;
    private static volatile tqy c;
    public tqm b;
    private tqm d;
    private tqm e;

    static {
        tgh tghVar = new tgh();
        a = tghVar;
        tph.A(tgh.class, tghVar);
    }

    private tgh() {
        tqm tqmVar = tqm.a;
        this.d = tqmVar;
        this.b = tqmVar;
        this.e = tqmVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"d", tge.a, "b", tgf.a, "e", tgg.a});
        }
        if (i2 == 3) {
            return new tgh();
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
        tqy tqyVar = c;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tgh.class) {
            tpdVar = c;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                c = tpdVar;
            }
        }
        return tpdVar;
    }
}
