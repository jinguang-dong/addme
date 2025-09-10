package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgx extends tpf implements tqs {
    public static final rgx a;
    private static volatile tqy l;
    public int b;
    public rgl d;
    public rhf e;
    public rhk f;
    public boolean g;
    public rgy h;
    public int i;
    public tsk j;
    private rgz m;
    private rgd n;
    private byte o = 2;
    public tpw c = trb.a;
    public String k = "";

    static {
        rgx rgxVar = new rgx();
        a = rgxVar;
        tph.A(rgx.class, rgxVar);
    }

    private rgx() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u000b\u0000\u0001\u0001>\u000b\u0000\u0001\u0002\u0001\u001b\u0003ဉ\u0001\bဉ\u000f\u000fဉ\u001f\u0014ᐉ\u0003&ᐉ\b'ဉ\u0015-᠌\u0014.ဇ\n8ဈ\u0017>ဉ\u0000", new Object[]{"b", "c", rhm.class, "e", "h", "n", "f", "m", "j", "i", rgk.a, "g", "k", "d"});
        }
        if (i2 == 3) {
            return new rgx();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = l;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgx.class) {
            tpdVar = l;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                l = tpdVar;
            }
        }
        return tpdVar;
    }
}
