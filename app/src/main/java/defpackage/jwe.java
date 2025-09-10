package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwe {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public jwe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwe) {
            jwe jweVar = (jwe) obj;
            if (this.a.equals(jweVar.a) && this.b.equals(jweVar.b) && this.c.equals(jweVar.c) && this.d.equals(jweVar.d)) {
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

    public jwe(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }
}
