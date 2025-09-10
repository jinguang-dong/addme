package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class qx {
    public final long a;

    public /* synthetic */ qx(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return mn.d(j, "StreamUseCase(value=");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qx) && this.a == ((qx) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
