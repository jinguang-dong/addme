package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class swg {
    static final swg a;
    static final swg b;
    final boolean c;
    final Throwable d;

    static {
        if (swv.f) {
            b = null;
            a = null;
        } else {
            b = new swg(false, null);
            a = new swg(true, null);
        }
    }

    public swg(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
