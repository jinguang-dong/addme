package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxx extends tph implements tqs {
    public static final uxx a;
    private static volatile tqy ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public uxw G;
    public long H;
    public uxw I;
    public uxw J;
    public uxw K;
    public uxw L;
    public uxw M;
    public uxw N;
    public uxw O;
    public uxw P;
    public uxw Q;
    public uxw R;
    public uxw S;
    public uxw T;
    public uxw U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public long aj;
    public uxw ak;
    public long al;
    public long am;
    public long an;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public tpw h;
    public tpw i;
    public tpw j;
    public tpw k;
    public tpw l;
    public tpw m;
    public uxw n;
    public tpw o;
    public tpw p;
    public tpw q;
    public tpw r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        uxx uxxVar = new uxx();
        a = uxxVar;
        tph.A(uxx.class, uxxVar);
    }

    private uxx() {
        trb trbVar = trb.a;
        this.h = trbVar;
        this.i = trbVar;
        this.j = trbVar;
        this.k = trbVar;
        this.l = trbVar;
        this.m = trbVar;
        this.o = trbVar;
        this.p = trbVar;
        this.q = trbVar;
        this.r = trbVar;
    }

    public final void F() {
        tpw tpwVar = this.l;
        if (tpwVar.c()) {
            return;
        }
        this.l = tph.v(tpwVar);
    }

    public final void G() {
        tpw tpwVar = this.k;
        if (tpwVar.c()) {
            return;
        }
        this.k = tph.v(tpwVar);
    }

    public final void H() {
        tpw tpwVar = this.h;
        if (tpwVar.c()) {
            return;
        }
        this.h = tph.v(tpwVar);
    }

    public final void I() {
        tpw tpwVar = this.i;
        if (tpwVar.c()) {
            return;
        }
        this.i = tph.v(tpwVar);
    }

    public final void J() {
        tpw tpwVar = this.j;
        if (tpwVar.c()) {
            return;
        }
        this.j = tph.v(tpwVar);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000bဉ\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010ဂ\u0005\u0011ဂ\u0006\u0012ဂ\u0007\u0013ဂ\b\u0014ဂ\t\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u0018ဂ\r\u0019ဂ\u000e\u001aဂ\u000f\u001bဂ\u0010\u001cဂ\u0011\u001dဂ\u0012\u001eဉ\u0013\u001fဂ\u0014 ဉ\u0015!ဉ\u0016\"ဉ\u0017#ဉ\u0018$ဉ\u0019%ဉ\u001a&ဉ\u001b'ဉ\u001c(ဉ\u001d)ဉ\u001e*ဉ\u001f+ဉ ,ဉ!-ဂ\".ဂ#/ဂ$0ဂ%1ဂ&2ဂ'3ဂ(4ဂ)5ဂ*6ဂ+7ဂ,8ဂ-9ဂ.:ဂ/;ဂ0=ဉ1>ဂ2?ဂ3@ဂ4", new Object[]{"b", "c", "d", "e", "f", "g", "h", uxw.class, "i", uxw.class, "j", uxw.class, "k", uxw.class, "l", uxw.class, "m", uxw.class, "n", "o", uxw.class, "p", uxt.class, "q", uxu.class, "r", uxs.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an"});
        }
        if (i2 == 3) {
            return new uxx();
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
        tqy tqyVar = ao;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uxx.class) {
            tpdVar = ao;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                ao = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void c() {
        tpw tpwVar = this.m;
        if (tpwVar.c()) {
            return;
        }
        this.m = tph.v(tpwVar);
    }

    public final void i() {
        tpw tpwVar = this.o;
        if (tpwVar.c()) {
            return;
        }
        this.o = tph.v(tpwVar);
    }
}
