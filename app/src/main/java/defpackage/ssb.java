package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssb extends tph implements tqs {
    public static final ssb a;
    private static volatile tqy y;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public spz q;
    public spz r;
    public spz s;
    public spz t;
    public spz u;
    public float v;
    public float w;
    public snu x;

    static {
        ssb ssbVar = new ssb();
        a = ssbVar;
        tph.A(ssb.class, ssbVar);
    }

    private ssb() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0016\u0016ခ\u0014\u0017ခ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", CGlJpiVWrCQOq.uPOfUQg, "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x", "v", "w"});
        }
        if (i2 == 3) {
            return new ssb();
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
        tqy tqyVar = y;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ssb.class) {
            tpdVar = y;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                y = tpdVar;
            }
        }
        return tpdVar;
    }
}
