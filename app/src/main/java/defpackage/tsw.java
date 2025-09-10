package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsw extends tph implements tqs {
    public static final tsw a;
    private static volatile tqy n;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;

    static {
        tsw tswVar = new tsw();
        a = tswVar;
        tph.A(tsw.class, tswVar);
    }

    private tsw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new tsw();
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
        tqy tqyVar = n;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tsw.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
