package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isf {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;

    public isf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isf) {
            isf isfVar = (isf) obj;
            if (this.a.equals(isfVar.a) && this.b.equals(isfVar.b) && this.c.equals(isfVar.c) && this.d.equals(isfVar.d) && this.e == isfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.e ? 1237 : 1231) ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + ", " + this.e + "}";
    }

    public isf(Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = z;
    }
}
