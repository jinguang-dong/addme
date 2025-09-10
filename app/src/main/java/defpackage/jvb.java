package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvb {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    private final Optional i;
    private final Optional j;

    public jvb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvb) {
            jvb jvbVar = (jvb) obj;
            if (this.a.equals(jvbVar.a) && this.b.equals(jvbVar.b) && this.c.equals(jvbVar.c) && this.d.equals(jvbVar.d) && this.e.equals(jvbVar.e) && this.f.equals(jvbVar.f) && this.i.equals(jvbVar.i) && this.g.equals(jvbVar.g) && this.j.equals(jvbVar.j) && this.h.equals(jvbVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.j.hashCode();
        return this.h.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.j;
        Optional optional3 = this.g;
        Optional optional4 = this.i;
        Optional optional5 = this.f;
        Optional optional6 = this.e;
        Optional optional7 = this.d;
        Optional optional8 = this.c;
        Optional optional9 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional9) + ", " + String.valueOf(optional8) + ", " + String.valueOf(optional7) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public jvb(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.i = optional7;
        this.g = optional8;
        this.j = optional9;
        this.h = optional10;
    }
}
