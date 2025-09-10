package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juk {
    public static final juk a = new juk(false);
    public static final juk b = new juk(true);
    public final boolean c;

    public juk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof juk) && this.c == ((juk) obj).c;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "{" + this.c + "}";
    }

    public juk(boolean z) {
        this.c = z;
    }
}
