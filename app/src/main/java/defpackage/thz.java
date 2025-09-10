package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thz extends tph implements tqs {
    public static final thz a;
    private static volatile tqy s;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f = -1.0f;
    public float g = -1.0f;
    public int h;
    public tpm i;
    public boolean j;
    public thx k;
    public float l;
    public float m;
    public thx n;
    public thx o;
    public thx p;
    public thx q;
    public thw r;

    static {
        thz thzVar = new thz();
        a = thzVar;
        tph.A(thz.class, thzVar);
    }

    private thz() {
        tpi tpiVar = tpi.a;
        this.i = tpa.a;
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
            return new trc(a, "\u0004\u0010\u0000\u0001\u0003,\u0010\u0000\u0001\u0000\u0003ဋ\u0004\u0004ဋ\u0005\u0006ဋ\t\nခ\u0007\u000bခ\b\fဇ\u000b\r\u0013\u001dင\u0003#ဉ\u0013$ဉ\u0016%ဉ\u0017&ဉ\u0018'ဉ\u0019(ဉ\u001a+ခ\u0014,ခ\u0015", new Object[]{"b", "d", "e", "h", "f", "g", "j", "i", "c", "k", "n", "o", "p", "q", "r", "l", "m"});
        }
        if (i2 == 3) {
            return new thz();
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
        tqy tqyVar = s;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (thz.class) {
            tpdVar = s;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                s = tpdVar;
            }
        }
        return tpdVar;
    }
}
