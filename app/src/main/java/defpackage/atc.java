package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atc {
    public static final ava a;
    public static final ava b;
    public static final ava c;
    public static final ayp d = new ayz(bap.c, new adq(10));
    private static final ate e;
    private static final ate f;

    static {
        long j = bkv.f;
        e = new ate(true, Float.NaN, j);
        f = new ate(false, Float.NaN, j);
        a = new ava(0.16f, 0.24f, 0.08f, 0.24f);
        b = new ava(0.08f, 0.12f, 0.04f, 0.12f);
        c = new ava(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static /* synthetic */ afr a(float f2, int i) {
        int i2 = i & 2;
        long j = bkv.f;
        if (i2 != 0) {
            f2 = Float.NaN;
        }
        int i3 = i & 1;
        if (cht.b(f2, Float.NaN) && a.q(j, j)) {
            return i3 != 0 ? e : f;
        }
        return new ate(1 == i3, f2, j);
    }
}
