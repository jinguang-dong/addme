package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyc extends tph implements tqs {
    public static final gyc a;
    private static volatile tqy g;
    public int b;
    public float c;
    public int e;
    public String d = "";
    public String f = "";

    static {
        gyc gycVar = new gyc();
        a = gycVar;
        tph.A(gyc.class, gycVar);
    }

    private gyc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ለ\u0001\u0003᠌\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", sri.j, "f"});
        }
        if (i2 == 3) {
            return new gyc();
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
        synchronized (gyc.class) {
            tpdVar = g;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                g = tpdVar;
            }
        }
        return tpdVar;
    }
}
