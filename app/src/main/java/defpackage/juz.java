package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juz {
    private final Optional a;
    private final Optional b;

    public juz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juz) {
            juz juzVar = (juz) obj;
            if (this.a.equals(juzVar.a) && this.b.equals(juzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional) + "}";
    }

    public juz(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
