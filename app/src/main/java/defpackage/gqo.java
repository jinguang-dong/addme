package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
enum gqo {
    FAST_LONG(0, 100, 0.1f, 1.0f, 100),
    FAST_SHORT(0, 100, 0.0f, 0.1f, 200),
    SLOW_SHORT(100, Long.MAX_VALUE, 0.0f, 0.1f, 200),
    SLOW_LONG(100, Long.MAX_VALUE, 0.1f, 1.0f, 50);

    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public final int i;

    gqo(long j2, long j3, float f, float f2, int i) {
        this.e = j2;
        this.f = j3;
        this.g = f;
        this.h = f2;
        this.i = i;
    }
}
