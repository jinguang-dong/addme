package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ryj implements seq {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof seq) {
            return a().equals(((seq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
