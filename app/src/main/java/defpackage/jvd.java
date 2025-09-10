package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvd {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final Optional e;

    public jvd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvd) {
            jvd jvdVar = (jvd) obj;
            if (this.a.equals(jvdVar.a) && this.b.equals(jvdVar.b) && this.c.equals(jvdVar.c) && this.d.equals(jvdVar.d) && this.e.equals(jvdVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        Optional optional3 = this.c;
        Optional optional4 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public jvd(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
    }
}
