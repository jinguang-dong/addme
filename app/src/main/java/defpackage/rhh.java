package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhh extends tph implements tqs {
    public static final rhh a;
    private static volatile tqy g;
    public int b;
    public Object d;
    public float e;
    public int c = 0;
    public String f = "";

    static {
        rhh rhhVar = new rhh();
        a = rhhVar;
        tph.A(rhh.class, rhhVar);
    }

    private rhh() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001;\u0000\u0002ခ\u0000\u0003;\u0000\u0004ဈ\u0001", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new rhh();
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
        tqy tqyVar = g;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rhh.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
