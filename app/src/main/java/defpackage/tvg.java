package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvg extends tph implements tqs {
    public static final tvg a;
    private static volatile tqy b;
    private tqm c;
    private tqm d;

    static {
        tvg tvgVar = new tvg();
        a = tvgVar;
        tph.A(tvg.class, tvgVar);
    }

    private tvg() {
        tqm tqmVar = tqm.a;
        this.c = tqmVar;
        this.d = tqmVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"c", tvf.a, "d", tve.a});
        }
        if (i2 == 3) {
            return new tvg();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tvg.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
