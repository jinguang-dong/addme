package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmr {
    public chq a;
    public cib b;
    public bku c;
    public long d = 0;

    public bmr(chq chqVar, cib cibVar, bku bkuVar) {
        this.a = chqVar;
        this.b = cibVar;
        this.c = bkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmr)) {
            return false;
        }
        bmr bmrVar = (bmr) obj;
        return a.ao(this.a, bmrVar.a) && this.b == bmrVar.b && a.ao(this.c, bmrVar.c) && a.q(this.d, bmrVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.r(this.d);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) bki.b(this.d)) + ')';
    }
}
