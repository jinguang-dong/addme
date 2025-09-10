package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwg {
    public final Optional a;

    public jwg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwg) {
            return this.a.equals(((jwg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + "}";
    }

    public jwg(Optional optional) {
        this.a = optional;
    }
}
