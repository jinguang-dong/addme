package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pia {
    public final long a;
    public volatile long b;

    public pia(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    public final boolean a(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.b;
        long j5 = j3 + j4;
        if (j5 == 0) {
            return true;
        }
        long j6 = this.a;
        if (j6 == 0 || j5 >= j6 || j5 <= (-j6)) {
            return false;
        }
        this.b = j4 - j5;
        return true;
    }

    public final boolean b(long j, long j2) {
        return ((j2 - j) - this.b) + this.a < 0;
    }
}
