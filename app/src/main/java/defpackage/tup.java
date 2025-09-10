package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tup extends tph implements tqs {
    public static final tup a;
    private static volatile tqy q;
    public int b;
    public long c;
    public long d;
    public long e;
    public tuj f;
    public tto g;
    public tto h;
    public boolean i;
    public tuq k;
    public tuo l;
    public float m;
    public tuy n;
    public ttv o;
    public tur p;
    private byte r = 2;
    public boolean j = true;

    static {
        tup tupVar = new tup();
        a = tupVar;
        tph.A(tup.class, tupVar);
    }

    private tup() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000e\u0000\u0001\u0001\u001f\u000e\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0005\u0004ᐉ\u0006\u0005ခ\u0010\u0006ဉ\u000e\u0007ဉ\u000f\bဂ\u0003\u000bဇ\t\u0012ᐉ\u0007\u0013ဉ\u0017\u0015ဉ\u0015\u0016ဇ\u000b\u001fဉ\u001a", new Object[]{"b", "c", "d", "f", "g", "m", "k", "l", "e", "i", "h", "o", "n", "j", "p"});
        }
        if (i2 == 3) {
            return new tup();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = q;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tup.class) {
            tpdVar = q;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                q = tpdVar;
            }
        }
        return tpdVar;
    }
}
