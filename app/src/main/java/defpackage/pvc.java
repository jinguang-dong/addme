package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvc extends tph implements tqs {
    public static final pvc a;
    private static volatile tqy x;
    public int b;
    public pvb c;
    public String d = "";
    public String e = "";
    public int f;
    public tnw g;
    public tnw h;
    public tnw i;
    public int j;
    public long k;
    public long l;
    public pve m;
    public boolean n;
    public tpw o;
    public int p;
    public tpw q;
    public int r;
    public long s;
    public String t;
    public tpw u;
    public vac v;
    public String w;

    static {
        pvc pvcVar = new pvc();
        a = pvcVar;
        tph.A(pvc.class, pvcVar);
    }

    private pvc() {
        trb trbVar = trb.a;
        this.o = trbVar;
        this.q = trbVar;
        this.t = "";
        this.u = trbVar;
        this.w = "";
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0015\u0000\u0001\u0001年皤\u0015\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0004\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"b", "d", "o", pva.class, "k", "e", "f", "l", "j", nvd.m, "m", "n", "p", "q", pvf.class, "r", nvd.s, "g", "s", "u", "t", "h", "v", "i", "w", "c"});
        }
        if (i2 == 3) {
            return new pvc();
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
        tqy tqyVar = x;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pvc.class) {
            tpdVar = x;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                x = tpdVar;
            }
        }
        return tpdVar;
    }
}
