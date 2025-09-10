package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class qz {
    public final int a;

    public static String a(int i) {
        return "TimestampBase(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qz) && this.a == ((qz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
