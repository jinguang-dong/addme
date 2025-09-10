package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spv extends tph implements tqs {
    public static final spv a;
    private static volatile tqy q;
    public int b;
    public String c = "";
    public String d = "";
    public float e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public float o;
    public float p;

    static {
        spv spvVar = new spv();
        a = spvVar;
        tph.A(spv.class, spvVar);
    }

    private spv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ခ\u0005\u0007ခ\u0006\tဇ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fခ\u000e\u0010ခ\u000f", new Object[]{"b", "c", "d", "e", "f", pAAtrB.ZMYUBT, "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new spv();
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
        tqy tqyVar = q;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (spv.class) {
            tpdVar = q;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                q = tpdVar;
            }
        }
        return tpdVar;
    }
}
