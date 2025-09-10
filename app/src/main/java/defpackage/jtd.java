package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtd {
    public final pjr a;
    public final pka b;
    public final pas c;
    public final ngp d;
    public final boolean e;
    private final pae f;

    public jtd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtd) {
            jtd jtdVar = (jtd) obj;
            if (this.a.equals(jtdVar.a) && this.b.equals(jtdVar.b) && this.f.equals(jtdVar.f) && this.c.equals(jtdVar.c) && this.d.equals(jtdVar.d) && this.e == jtdVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.e ? 1237 : 1231) ^ ((((((((((this.a.b ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        ngp ngpVar = this.d;
        pas pasVar = this.c;
        pae paeVar = this.f;
        pka pkaVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(pkaVar) + ", " + String.valueOf(paeVar) + ", " + String.valueOf(pasVar) + ", " + String.valueOf(ngpVar) + ", " + this.e + "}";
    }

    public jtd(pjr pjrVar, pka pkaVar, pae paeVar, pas pasVar, ngp ngpVar, boolean z) {
        this.a = pjrVar;
        this.b = pkaVar;
        this.f = paeVar;
        this.c = pasVar;
        this.d = ngpVar;
        this.e = z;
    }
}
