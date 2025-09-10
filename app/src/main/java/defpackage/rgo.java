package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgo extends tph implements tqs {
    public static final rgo a;
    private static volatile tqy f;
    public int b;
    public long c;
    public long d;
    public long e;
    private float g;

    static {
        rgo rgoVar = new rgo();
        a = rgoVar;
        tph.A(rgo.class, rgoVar);
    }

    private rgo() {
    }

    public static /* synthetic */ void b(rgo rgoVar) {
        rgoVar.b |= 1;
        rgoVar.g = 1.0f;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "g", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new rgo();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgo.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
