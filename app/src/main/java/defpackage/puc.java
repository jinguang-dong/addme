package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puc extends tpf implements tqs {
    public static final puc a;
    private static volatile tqy s;
    public int b;
    public long e;
    public int f;
    public tvy h;
    public long j;
    public tvy k;
    public int m;
    public int n;
    public tnw q;
    private byte t = 2;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public tpw l = trb.a;
    public String o = "";
    public String p = "";

    static {
        puc pucVar = new puc();
        a = pucVar;
        tph.A(puc.class, pucVar);
    }

    private puc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.t);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", pue.class, "i", "f", nvd.g, "j", "m", nvd.f, "n", nvd.e, "o", "p", "q"});
        }
        if (i2 == 3) {
            return new puc();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.t = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = s;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (puc.class) {
            tpdVar = s;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                s = tpdVar;
            }
        }
        return tpdVar;
    }
}
