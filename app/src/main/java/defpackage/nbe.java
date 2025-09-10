package defpackage;

import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbe {
    public final Object a;
    public final String b;
    public final OptionalInt c;
    public final OptionalInt d;
    public final Optional e;
    public final Optional f;
    public final OptionalInt g;
    public final Optional h;
    public final OptionalInt i;
    public final boolean j;
    public final boolean k;

    public nbe() {
        throw null;
    }

    public static nbd a() {
        nbd nbdVar = new nbd((byte[]) null);
        nbdVar.f(true);
        nbdVar.b(true);
        return nbdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbe) {
            nbe nbeVar = (nbe) obj;
            if (this.a.equals(nbeVar.a) && this.b.equals(nbeVar.b) && this.c.equals(nbeVar.c) && this.d.equals(nbeVar.d) && this.e.equals(nbeVar.e) && this.f.equals(nbeVar.f) && this.g.equals(nbeVar.g) && this.h.equals(nbeVar.h) && this.i.equals(nbeVar.i) && this.j == nbeVar.j && this.k == nbeVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true == this.k ? 1231 : 1237);
    }

    public final String toString() {
        OptionalInt optionalInt = this.i;
        Optional optional = this.h;
        OptionalInt optionalInt2 = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        OptionalInt optionalInt3 = this.d;
        OptionalInt optionalInt4 = this.c;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + String.valueOf(optionalInt4) + ", " + String.valueOf(optionalInt3) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optionalInt2) + ", " + String.valueOf(optional) + ", " + String.valueOf(optionalInt) + ", " + this.j + ", " + this.k + "}";
    }

    public nbe(Object obj, String str, OptionalInt optionalInt, OptionalInt optionalInt2, Optional optional, Optional optional2, OptionalInt optionalInt3, Optional optional3, OptionalInt optionalInt4, boolean z, boolean z2) {
        this.a = obj;
        this.b = str;
        this.c = optionalInt;
        this.d = optionalInt2;
        this.e = optional;
        this.f = optional2;
        this.g = optionalInt3;
        this.h = optional3;
        this.i = optionalInt4;
        this.j = z;
        this.k = z2;
    }
}
