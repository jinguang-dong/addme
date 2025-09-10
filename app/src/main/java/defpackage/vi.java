package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class vi {
    public final long a;

    public /* synthetic */ vi(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return mn.d(j, "TimestampNs(value=");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vi) && this.a == ((vi) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
