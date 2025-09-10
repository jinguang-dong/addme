package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxg {
    public final put a;

    public pxg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxg) {
            return this.a.equals(((pxg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + "}";
    }

    public pxg(put putVar) {
        this.a = putVar;
    }
}
