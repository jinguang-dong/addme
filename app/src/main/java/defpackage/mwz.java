package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwz extends tph implements tqs {
    public static final mwz a;
    private static volatile tqy n;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i = "";
    public String j = "";
    public float k;
    public float l;
    public float m;

    static {
        mwz mwzVar = new mwz();
        a = mwzVar;
        tph.A(mwz.class, mwzVar);
    }

    private mwz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007Ȉ\bȈ\tခ\u0000\nခ\u0001\u000bခ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new mwz();
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
        synchronized (mwz.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
