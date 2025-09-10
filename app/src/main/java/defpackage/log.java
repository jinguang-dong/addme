package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class log {
    public long a;
    private final long b;
    private final long c;
    private long d;

    private log() {
        this.d = 0L;
        this.a = 0L;
        this.b = 58823529L;
        this.c = 1000000000L;
    }

    public static log b() {
        rnt.E(true, "permitsPerSecond must be > 0: %s", 17L);
        return new log();
    }

    public final boolean a(long j) {
        long j2 = this.a;
        if ((j2 <= 0 || j - j2 > this.c || j - this.d < 58823529) && j - this.d < this.b) {
            return false;
        }
        this.d = j;
        return true;
    }

    public log(long j) {
        this.d = 0L;
        this.a = 0L;
        this.b = j;
        this.c = 2000000000L;
    }
}
