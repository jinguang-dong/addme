package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cze implements cyu {
    public final long a;
    public final long b;
    public final long c = -1;

    public cze(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j) {
        return (j / 1000) + 2082844800;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cze)) {
            return false;
        }
        cze czeVar = (cze) obj;
        if (this.a != czeVar.a || this.b != czeVar.b) {
            return false;
        }
        long j = czeVar.c;
        return true;
    }

    public final int hashCode() {
        return ((((a.r(this.a) + 527) * 31) + a.r(this.b)) * 31) + a.r(-1L);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=-1";
    }
}
