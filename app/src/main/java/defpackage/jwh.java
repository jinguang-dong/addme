package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwh {
    public final Optional a;

    public jwh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwh) {
            return this.a.equals(((jwh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + "}";
    }

    public jwh(Optional optional) {
        this.a = optional;
    }
}
