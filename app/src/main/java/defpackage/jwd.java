package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwd {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;

    public jwd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwd) {
            jwd jwdVar = (jwd) obj;
            if (this.a.equals(jwdVar.a) && this.b.equals(jwdVar.b) && this.c.equals(jwdVar.c) && this.d.equals(jwdVar.d) && this.e.equals(jwdVar.e) && this.f.equals(jwdVar.f) && this.g.equals(jwdVar.g) && this.h.equals(jwdVar.h) && this.i.equals(jwdVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        return this.i.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.i;
        Optional optional2 = this.h;
        Optional optional3 = this.g;
        Optional optional4 = this.f;
        Optional optional5 = this.e;
        Optional optional6 = this.d;
        Optional optional7 = this.c;
        Optional optional8 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional8) + ", " + String.valueOf(optional7) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public jwd(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = optional9;
    }
}
