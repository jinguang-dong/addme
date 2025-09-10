package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class puv {
    public final String a;
    public final rwc b;
    public final rwc c;
    public final boolean d;

    public puv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof puv) {
            puv puvVar = (puv) obj;
            if (this.a.equals(puvVar.a) && this.b.equals(puvVar.b) && this.c.equals(puvVar.c) && this.d == puvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.d ? 1237 : 1231) ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.c;
        return "{" + this.a + ", " + String.valueOf(this.b) + ", " + String.valueOf(rwcVar) + ", false, " + this.d + "}";
    }

    public puv(rwc rwcVar, rwc rwcVar2) {
        this.a = "uranus-joy-animation";
        this.b = rwcVar;
        this.c = rwcVar2;
        this.d = true;
    }
}
