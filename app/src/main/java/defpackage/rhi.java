package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhi extends tph implements tqs {
    public static final rhi a;
    private static volatile tqy d;
    public int b;
    public rhj c;

    static {
        rhi rhiVar = new rhi();
        a = rhiVar;
        tph.A(rhi.class, rhiVar);
    }

    private rhi() {
        toj tojVar = toj.b;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new rhi();
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
        synchronized (rhi.class) {
            tpdVar = d;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                d = tpdVar;
            }
        }
        return tpdVar;
    }
}
