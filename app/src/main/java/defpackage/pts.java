package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pts extends tph implements tqs {
    public static final pts a;
    private static volatile tqy o;
    public int b;
    public int f;
    public int g;
    public tpw h;
    public long i;
    public String j;
    public tpw k;
    public tnw l;
    public tnw m;
    public String n;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        pts ptsVar = new pts();
        a = ptsVar;
        tph.A(pts.class, ptsVar);
    }

    private pts() {
        trb trbVar = trb.a;
        this.h = trbVar;
        this.j = "";
        this.k = trbVar;
        this.n = "";
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000fဈ\n", new Object[]{"b", "c", "h", ptr.class, "d", "f", "g", nvd.d, "e", "i", "k", "l", "j", "m", "n"});
        }
        if (i2 == 3) {
            return new pts();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = o;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pts.class) {
            tpdVar = o;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                o = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.h;
        if (tpwVar.c()) {
            return;
        }
        this.h = tph.v(tpwVar);
    }
}
