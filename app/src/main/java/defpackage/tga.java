package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tga extends tph implements tqs {
    public static final tga a;
    private static volatile tqy f;
    public Object c;
    public int d;
    public int b = 0;
    public String e = "";

    static {
        tga tgaVar = new tga();
        a = tgaVar;
        tph.A(tga.class, tgaVar);
    }

    private tga() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\t\u0001\u0000\u0001\n\t\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", "d", "e", tfs.class, tfz.class, tfy.class, tfv.class, tft.class, tfr.class, tfx.class});
        }
        if (i2 == 3) {
            return new tga();
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
        synchronized (tga.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
