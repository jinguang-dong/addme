package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juw {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public juw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juw) {
            juw juwVar = (juw) obj;
            if (this.a.equals(juwVar.a) && this.b.equals(juwVar.b) && this.c.equals(juwVar.c) && this.d.equals(juwVar.d) && this.e.equals(juwVar.e) && this.f.equals(juwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        return this.f.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional5) + ", " + String.valueOf(optional4) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public juw(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
    }
}
