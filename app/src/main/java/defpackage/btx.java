package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btx {
    public final azr a;
    public final azr b;
    public long c;
    private final azr d;
    private final bbb e;
    private final bbb f;
    private final bbf g;
    private final bbb h;

    public btx() {
        bap bapVar = bap.c;
        this.a = new azz(true, bapVar);
        this.b = new azz(false, bapVar);
        this.e = new azv(0.0f);
        this.f = new azv(0.0f);
        this.d = new azz(null, bapVar);
        this.g = new azx(0L);
        this.h = new azv(1.0f);
        this.c = 0L;
        String str = brt.a;
    }

    public final void a(float f) {
        this.h.i(f);
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void c(long j) {
        this.g.h(j);
    }

    public final void d(float f) {
        this.e.i(f);
    }

    public final void e(float f) {
        this.f.i(f);
    }

    public final void f(Interpolator interpolator) {
        this.d.b(interpolator);
    }
}
