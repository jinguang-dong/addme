package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class the extends tph implements tqs {
    public static final the a;
    private static volatile tqy m;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = -999.0f;
    public float k;
    public float l;
    private int n;

    static {
        the theVar = new the();
        a = theVar;
        tph.A(the.class, theVar);
    }

    private the() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b", new Object[]{"n", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new the();
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
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (the.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
