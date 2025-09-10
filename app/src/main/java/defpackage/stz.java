package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stz extends tph implements tqs {
    private static volatile tqy H;
    public static final stz a;
    public int A;
    public ssf B;
    public int C;
    public int D;
    public long E;
    public int F;
    public float G;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public boolean x;
    public boolean y;
    public float z;

    static {
        stz stzVar = new stz();
        a = stzVar;
        tph.A(stz.class, stzVar);
    }

    private stz() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဂ\t\nဂ\n\u000bဂ\u000b\fဂ\f\rဂ\r\u000eဂ\u000f\u000fဂ\u0010\u0010ဂ\u0011\u0011ဂ\u0012\u0012ဂ\u0013\u0013ဇ\u0015\u0014င\b\u0015ဂ\u000e\u0016ဂ\u0014\u0017ဇ\u0016\u0018ခ\u0017\u0019᠌\u0018\u001aဉ\u0019\u001bင\u001a\u001cင\u001b\u001dဂ\u001c\u001eင\u001d\u001fခ\u001e", new Object[]{"b", "c", "d", clFzVRcygwbq.tRWZeUwMHrYJWlW, str.f, "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "x", "k", "q", "w", "y", "z", "A", str.i, "B", "C", "D", "E", "F", "G"});
        }
        if (i2 == 3) {
            return new stz();
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
        tqy tqyVar = H;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (stz.class) {
            tpdVar = H;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                H = tpdVar;
            }
        }
        return tpdVar;
    }
}
