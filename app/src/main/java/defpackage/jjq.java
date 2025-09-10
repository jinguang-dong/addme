package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjq {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;

    public jjq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjq) {
            jjq jjqVar = (jjq) obj;
            if (this.a.equals(jjqVar.a) && this.b.equals(jjqVar.b) && this.c.equals(jjqVar.c) && this.d.equals(jjqVar.d) && this.e.equals(jjqVar.e) && this.f.equals(jjqVar.f) && this.g.equals(jjqVar.g) && this.h.equals(jjqVar.h) && this.i.equals(jjqVar.i) && this.j.equals(jjqVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        return this.j.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        Optional optional4 = this.g;
        Optional optional5 = this.f;
        Optional optional6 = this.e;
        Optional optional7 = this.d;
        Optional optional8 = this.c;
        Optional optional9 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional9) + ", " + String.valueOf(optional8) + ", " + String.valueOf(optional7) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public jjq(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = optional9;
        this.j = optional10;
    }
}
