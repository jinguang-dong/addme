package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mlc {
    public static final sgv a = sgv.g("mlc");
    public final int d;
    public final boolean e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final HashMap k;
    public final HashMap l;
    public final HashMap m;
    public sty n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public float u;
    public int x;
    private final boolean z;
    public final Object b = new Object();
    public float v = -1.0f;
    public long w = 0;
    public final obu y = new obu();
    public final String c = "";

    public mlc(mky mkyVar, boolean z, boolean z2, float f, int i, int i2, int i3, float f2) {
        this.e = z;
        this.z = z2;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = f2;
        int length = sty.values().length;
        this.d = mkyVar.e;
        this.n = sty.SLOW;
        this.o = false;
        this.x = 9;
        this.r = 0L;
        this.s = 0L;
        this.t = 0L;
        this.u = -1.0f;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        for (mkx mkxVar : mkx.values()) {
            this.k.put(mkxVar, 0);
            this.l.put(mkxVar, 0L);
            this.m.put(mkxVar, 0L);
        }
    }

    public final mkx a(sty styVar) {
        return (mkx) obu.k(styVar, (Class) this.y.a);
    }

    public final void b(mkx mkxVar) {
        synchronized (this.b) {
            HashMap map = this.m;
            if (!map.containsKey(mkxVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            map.put(mkxVar, Long.valueOf(((Long) map.get(mkxVar)).longValue() + 1));
        }
    }

    public final void c(mkx mkxVar) {
        synchronized (this.b) {
            HashMap map = this.k;
            if (!map.containsKey(mkxVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            map.put(mkxVar, Integer.valueOf(((Integer) map.get(mkxVar)).intValue() + 1));
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.z;
        }
        return z;
    }
}
