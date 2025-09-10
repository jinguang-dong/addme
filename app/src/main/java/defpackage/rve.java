package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rve extends tph implements tqs {
    public static final rve a;
    private static volatile tqy p;
    public float b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;

    static {
        rve rveVar = new rve();
        a = rveVar;
        tph.A(rve.class, rveVar);
    }

    private rve() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0001\u0002\u000b\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0007\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", yoGAhrpjU.qyhW, "m", "n", "o"});
        }
        if (i2 == 3) {
            return new rve();
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
        tqy tqyVar = p;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rve.class) {
            tpdVar = p;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                p = tpdVar;
            }
        }
        return tpdVar;
    }
}
