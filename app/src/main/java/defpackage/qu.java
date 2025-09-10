package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class qu {
    public final int a;

    public static String a(int i) {
        return "MirrorMode(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qu) && this.a == ((qu) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
