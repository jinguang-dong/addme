package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uze extends tph implements tqs {
    public static final uze a;
    private static volatile tqy e;
    public int b;
    public int c;
    public int d;

    static {
        uze uzeVar = new uze();
        a = uzeVar;
        tph.A(uze.class, uzeVar);
    }

    private uze() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", tyy.o, "d"});
        }
        if (i2 == 3) {
            return new uze();
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
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uze.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
