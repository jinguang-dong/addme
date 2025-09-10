package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Optional;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mha {
    public static final sgv a = sgv.g("mha");
    private boolean A;
    final int b;
    final int c;
    public final owf d;
    public final owf e;
    public final nms f;
    final int g;
    final int h;
    public final jwn i;
    public final boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Float o;
    public int p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public String u;
    public final hbj v;
    private final int w;
    private final juu x;
    private int y;
    private int z;

    public mha(owf owfVar, owf owfVar2, nms nmsVar, jwn jwnVar, juu juuVar, hbj hbjVar) {
        this.d = owfVar;
        this.e = owfVar2;
        this.f = nmsVar;
        this.i = jwnVar;
        this.x = juuVar;
        this.v = hbjVar;
        this.b = ((Integer) hbjVar.a(gzy.e).orElse(30)).intValue();
        this.c = ((Integer) hbjVar.a(gzy.f).get()).intValue();
        this.w = ((Integer) hbjVar.a(gzy.d).orElse(15)).intValue();
        this.g = ((Integer) hbjVar.a(gzy.h).get()).intValue();
        this.h = ((Integer) hbjVar.a(gzy.i).get()).intValue();
        this.j = hbjVar.p(gzy.l);
    }

    public static final int f(float f, float f2) {
        if (new BigDecimal(Float.toString(Math.abs(f - f2))).setScale(2, RoundingMode.HALF_UP).floatValue() < 0.01f) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public final String a(poe poeVar) {
        Integer num;
        String str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        Optional optional = this.x.a;
        return (!optional.isPresent() || (num = (Integer) poeVar.a((CaptureResult.Key) optional.get())) == null) ? str : num.toString();
    }

    public final void b() {
        if (this.n) {
            this.n = false;
            this.k = 0;
        }
    }

    final void c() {
        this.y = 0;
    }

    public final void d() {
        this.z = 0;
    }

    public final boolean e(poe poeVar, int i) {
        Float f = (Float) poeVar.a(CaptureResult.LENS_FOCUS_DISTANCE);
        boolean z = false;
        if (f == null) {
            return false;
        }
        if (100.0f / f.floatValue() <= this.w) {
            this.y = Math.min(this.y + 1, i);
            d();
        } else {
            this.z = Math.min(this.z + 1, 15);
            c();
        }
        if (this.y >= i) {
            z = true;
        } else if (this.z < 15) {
            return this.A;
        }
        this.A = z;
        return z;
    }
}
