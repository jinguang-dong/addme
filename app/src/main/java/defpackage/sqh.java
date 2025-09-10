package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqh extends tph implements tqs {
    public static final sqh a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;

    static {
        sqh sqhVar = new sqh();
        a = sqhVar;
        tph.A(sqh.class, sqhVar);
    }

    private sqh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဂ\u0004", new Object[]{"b", "c", rgk.k, "d", spd.s, "e", spd.r, "f", "g"});
        }
        if (i2 == 3) {
            return new sqh();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sqh.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
