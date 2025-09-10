package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npo {
    public final npn a;
    public final owf b;
    public final npm c;

    public npo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof npo) {
            npo npoVar = (npo) obj;
            if (this.a.equals(npoVar.a) && this.b.equals(npoVar.b) && this.c.equals(npoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        npm npmVar = this.c;
        owf owfVar = this.b;
        return "{" + this.a.toString() + ", " + owfVar.toString() + ", " + npmVar.toString() + "}";
    }

    public npo(npn npnVar, owf owfVar, npm npmVar) {
        npnVar.getClass();
        this.a = npnVar;
        owfVar.getClass();
        this.b = owfVar;
        npmVar.getClass();
        this.c = npmVar;
    }
}
