package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iep extends tph implements tqs {
    public static final iep a;
    private static volatile tqy f;
    public long b;
    public long c;
    public String d = "";
    public int e;

    static {
        iep iepVar = new iep();
        a = iepVar;
        tph.A(iep.class, iepVar);
    }

    private iep() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004\f", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new iep();
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
        synchronized (iep.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
