package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juv {
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
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;
    private final Optional p;

    public juv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juv) {
            juv juvVar = (juv) obj;
            if (this.a.equals(juvVar.a) && this.b.equals(juvVar.b) && this.c.equals(juvVar.c) && this.d.equals(juvVar.d) && this.e.equals(juvVar.e) && this.f.equals(juvVar.f) && this.g.equals(juvVar.g) && this.l.equals(juvVar.l) && this.m.equals(juvVar.m) && this.n.equals(juvVar.n) && this.h.equals(juvVar.h) && this.i.equals(juvVar.i) && this.j.equals(juvVar.j) && this.o.equals(juvVar.o) && this.k.equals(juvVar.k) && this.p.equals(juvVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.k.hashCode();
        return this.p.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.p;
        Optional optional2 = this.k;
        Optional optional3 = this.o;
        Optional optional4 = this.j;
        Optional optional5 = this.i;
        Optional optional6 = this.h;
        Optional optional7 = this.n;
        Optional optional8 = this.m;
        Optional optional9 = this.l;
        Optional optional10 = this.g;
        Optional optional11 = this.f;
        Optional optional12 = this.e;
        Optional optional13 = this.d;
        Optional optional14 = this.c;
        Optional optional15 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional15) + ", " + String.valueOf(optional14) + ", " + String.valueOf(optional13) + ", " + String.valueOf(optional12) + ", " + String.valueOf(optional11) + ", " + String.valueOf(optional10) + ", " + String.valueOf(optional9) + ", " + String.valueOf(optional8) + ", " + String.valueOf(optional7) + ", " + String.valueOf(optional6) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public juv(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15, Optional optional16) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = optional10;
        this.h = optional11;
        this.i = optional12;
        this.j = optional13;
        this.o = optional14;
        this.k = optional15;
        this.p = optional16;
    }
}
