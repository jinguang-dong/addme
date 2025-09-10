package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srj extends tph implements tqs {
    public static final srj a;
    private static volatile tqy z;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    public int o;
    public sth p;
    public int q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public long y;

    static {
        srj srjVar = new srj();
        a = srjVar;
        tph.A(srj.class, srjVar);
    }

    private srj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\fဂ\u000b\rဂ\f\u000eဇ\r\u000f᠌\u000e\u0010ဉ\u000f\u0011᠌\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017\u0019᠌\u0018\u001aဂ\u0019", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", sri.b, "p", "q", sri.a, "r", "s", "t", "u", "v", MyBPCgKwEjJI.DEcGPVoWW, "x", rgk.k, "y"});
        }
        if (i2 == 3) {
            return new srj();
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
        tqy tqyVar = z;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (srj.class) {
            tpdVar = z;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                z = tpdVar;
            }
        }
        return tpdVar;
    }
}
