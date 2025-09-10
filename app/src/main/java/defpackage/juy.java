package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juy {
    public final Optional a;

    public juy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juy) {
            return this.a.equals(((juy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + "}";
    }

    public juy(Optional optional) {
        this.a = optional;
    }
}
