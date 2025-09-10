package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pny {
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
    public final Optional k;
    public final Optional l;

    public pny() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pny) {
            pny pnyVar = (pny) obj;
            if (this.a.equals(pnyVar.a) && this.b.equals(pnyVar.b) && this.c.equals(pnyVar.c) && this.d.equals(pnyVar.d) && this.e.equals(pnyVar.e) && this.f.equals(pnyVar.f) && this.g.equals(pnyVar.g) && this.h.equals(pnyVar.h) && this.i.equals(pnyVar.i) && this.j.equals(pnyVar.j) && this.k.equals(pnyVar.k) && this.l.equals(pnyVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        return this.l.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.l;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.i;
        Optional optional5 = this.h;
        Optional optional6 = this.g;
        Optional optional7 = this.f;
        Optional optional8 = this.e;
        Optional optional9 = this.d;
        Optional optional10 = this.c;
        Optional optional11 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional11) + ", " + String.valueOf(optional10) + ", " + String.valueOf(optional9) + ", " + String.valueOf(optional8) + ", " + String.valueOf(optional7) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public pny(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12) {
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
        this.k = optional11;
        this.l = optional12;
    }
}
