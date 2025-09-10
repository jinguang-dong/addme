package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sug extends tph implements tqs {
    private static volatile tqy I;
    public static final sug a;
    public sto A;
    public int B;
    public sue C;
    public int D;
    public float E;
    public suc F;
    public int G;
    public int H;
    public int b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public long k;
    public suf l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public tpn u = tpi.a;
    public int v;
    public float w;
    public long x;
    public long y;
    public boolean z;

    static {
        sug sugVar = new sug();
        a = sugVar;
        tph.A(sug.class, sugVar);
    }

    private sug() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001 \u0000\u0001\u0001! \u0000\u0001\u0000\u0001ခ\u0000\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007င\u0006\bင\u0007\tင\b\nဂ\t\u000bဉ\n\fင\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014ࠞ\u0015င\u0013\u0016ခ\u0014\u0017ဂ\u0015\u0018ဂ\u0016\u0019ဇ\u0017\u001aဉ\u0018\u001b᠌\u0019\u001cဉ\u001a\u001dင\u001b\u001eခ\u001c\u001fဉ\u001d င\u001e!င\u001f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", str.k, "v", "w", "x", "y", "z", "A", "B", str.i, "C", "D", "E", "F", "G", "H"});
        }
        if (i2 == 3) {
            return new sug();
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
        tqy tqyVar = I;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sug.class) {
            tpdVar = I;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                I = tpdVar;
            }
        }
        return tpdVar;
    }
}
