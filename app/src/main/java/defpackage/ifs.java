package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifs extends tph implements tqs {
    public static final ifs a;
    private static volatile tqy h;
    public int b;
    public ift c;
    public ift d;
    public String e = "";
    public long f;
    public long g;

    static {
        ifs ifsVar = new ifs();
        a = ifsVar;
        tph.A(ifs.class, ifsVar);
    }

    private ifs() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004Ȉ\u0005\u0002\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ifs();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ifs.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
