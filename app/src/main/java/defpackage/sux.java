package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sux extends tph implements tqs {
    public static final sux a;
    private static volatile tqy x;
    public int b;
    public int c;
    public int d;
    public suv e;
    public long f;
    public svo g;
    public svd h;
    public suw i;
    public svk j;
    public svc k;
    public svh l;
    public suu m;
    public svf n;
    public svb o;
    public svi p;
    public suy q;
    public sva r;
    public sve s;
    public svn t;
    public svj u;
    public svl v;
    public suz w;

    static {
        sux suxVar = new sux();
        a = suxVar;
        tph.A(sux.class, suxVar);
    }

    private sux() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0013\u0000\u0003\nQ\u0013\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001f(ဉ'.ဉ-0ဉ/1ဉ03ဉ36ဉ6?ဉ?@ဉ@BဉBCဉCGဉHHဉ\u0014KဉIMဉKPဉNQဉO", new Object[]{"b", MyBPCgKwEjJI.uiAwPtaAtCxL, "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "g", "t", "u", "v", "w"});
        }
        if (i2 == 3) {
            return new sux();
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
        synchronized (sux.class) {
            tpdVar = x;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                x = tpdVar;
            }
        }
        return tpdVar;
    }
}
