package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class qt {
    public final long a;

    public /* synthetic */ qt(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return mn.d(j, "DynamicRangeProfile(value=");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qt) && this.a == ((qt) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
