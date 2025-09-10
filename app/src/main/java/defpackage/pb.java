package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class pb {
    private final int a;

    public static boolean a(int i, Object obj) {
        return (obj instanceof pb) && i == ((pb) obj).a;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AudioRestrictionMode(value=" + this.a + ')';
    }
}
