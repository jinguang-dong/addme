package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxj extends tph implements tqs {
    public static final uxj a;
    private static volatile tqy f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        uxj uxjVar = new uxj();
        a = uxjVar;
        tph.A(uxj.class, uxjVar);
    }

    private uxj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002=\u0000\u0005=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new uxj();
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
        synchronized (uxj.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
