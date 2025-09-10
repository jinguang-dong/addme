package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttk extends tph implements tqs {
    public static final ttk a;
    private static volatile tqy f;
    public int b;
    public String c = "";
    public float d;
    public float e;

    static {
        ttk ttkVar = new ttk();
        a = ttkVar;
        tph.A(ttk.class, ttkVar);
    }

    private ttk() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ttk();
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
        synchronized (ttk.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
