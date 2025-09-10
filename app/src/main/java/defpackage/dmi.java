package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmi {
    public long a;
    public long b;

    private static final long c(long j, long j2) {
        return j2 == 0 ? j : ((j2 / 4) * 3) + (j / 4);
    }

    public final void a(long j) {
        this.a = c(j, this.a);
    }

    public final void b(long j) {
        this.b = c(j, this.b);
    }
}
