package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwf {
    public final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public jwf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwf) {
            jwf jwfVar = (jwf) obj;
            if (this.a.equals(jwfVar.a) && this.b.equals(jwfVar.b) && this.c.equals(jwfVar.c) && this.d.equals(jwfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public jwf(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }
}
