package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class rd {
    public final int a;

    public static String a(int i) {
        return "RequestTemplate(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rd) && this.a == ((rd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
