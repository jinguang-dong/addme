package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bqd {
    private final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof bqd) && this.a == ((bqd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
