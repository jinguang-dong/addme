package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqe extends tph implements tqs {
    public static final sqe a;
    private static volatile tqy h;
    public int b;
    public int c;
    public sub d;
    public long e;
    public int f;
    public int g;

    static {
        sqe sqeVar = new sqe();
        a = sqeVar;
        tph.A(sqe.class, sqeVar);
    }

    private sqe() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004ဂ\u0002\u0006᠌\u0004\u0007ဋ\u0005", new Object[]{"b", "c", spd.p, "d", "e", "f", spd.q, "g"});
        }
        if (i2 == 3) {
            return new sqe();
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
        synchronized (sqe.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
