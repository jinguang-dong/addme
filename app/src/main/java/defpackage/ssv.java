package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssv extends tph implements tqs {
    private static volatile tqy B;
    public static final ssv a;
    public float A;
    public int b;
    public ssu c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
        ssv ssvVar = new ssv();
        a = ssvVar;
        tph.A(ssv.class, ssvVar);
    }

    private ssv() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001ဉ\u0000\bခ\u0001\tခ\u0002\nခ\u0003\u000bခ\u0004\fခ\u0005\rခ\u0006\u000eခ\u0007\u000fခ\b\u0010ခ\t\u0011ခ\n\u0012ခ\u000b\u0013ခ\f\u0014ခ\r\u0015ခ\u000e\u0017ခ\u0010\u0018ခ\u0011\u0019ခ\u0012\u001aခ\u0013\u001bခ\u0014\u001cခ\u0015\u001dခ\u0016\u001eခ\u0018\u001fခ\u000f ခ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "s", "t", "u", JvFFEwFNdCrxf.uFibRu, "w", "x", "y", "A", "r", "z"});
        }
        if (i2 == 3) {
            return new ssv();
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
        tqy tqyVar = B;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ssv.class) {
            tpdVar = B;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                B = tpdVar;
            }
        }
        return tpdVar;
    }
}
