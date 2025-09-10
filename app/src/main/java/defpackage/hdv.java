package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hdv {
    public final ltf a;

    public hdv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdv) {
            return this.a.equals(((hdv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + "}";
    }

    public hdv(ltf ltfVar) {
        this.a = ltfVar;
    }
}
