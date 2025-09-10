package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pil implements peo {
    private static int a;
    private final int b = h();
    public final pjr f;
    public final boolean g;
    public final peq h;

    public pil(peq peqVar, pjr pjrVar, boolean z) {
        this.h = peqVar;
        this.f = pjrVar;
        this.g = z;
    }

    private static synchronized int h() {
        int i;
        i = a;
        a = i + 1;
        return i;
    }

    @Override // defpackage.peo
    public final peq c() {
        return this.h;
    }

    @Override // defpackage.peo
    public final pjr d() {
        return this.f;
    }

    @Override // defpackage.peo
    public final boolean f() {
        return this.h.k;
    }

    public abstract long g();

    public abstract pet i();

    public abstract boolean j();

    public final long k() {
        return this.h.r;
    }

    public final String toString() {
        return "Stream-" + this.b;
    }
}
