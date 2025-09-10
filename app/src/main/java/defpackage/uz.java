package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class uz {
    public final long a;

    public static final int a(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j >= j2 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uz) && this.a == ((uz) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return "DurationNs(value=" + this.a + ')';
    }
}
