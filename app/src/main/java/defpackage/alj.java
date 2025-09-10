package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alj implements ami {
    private final ami a;
    private final ami b;

    public alj(ami amiVar, ami amiVar2) {
        this.a = amiVar;
        this.b = amiVar2;
    }

    @Override // defpackage.ami
    public final int a(chq chqVar) {
        return ukc.n(this.a.a(chqVar) - this.b.a(chqVar), 0);
    }

    @Override // defpackage.ami
    public final int b(chq chqVar, cib cibVar) {
        return ukc.n(this.a.b(chqVar, cibVar) - this.b.b(chqVar, cibVar), 0);
    }

    @Override // defpackage.ami
    public final int c(chq chqVar, cib cibVar) {
        return ukc.n(this.a.c(chqVar, cibVar) - this.b.c(chqVar, cibVar), 0);
    }

    @Override // defpackage.ami
    public final int d(chq chqVar) {
        return ukc.n(this.a.d(chqVar) - this.b.d(chqVar), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alj)) {
            return false;
        }
        alj aljVar = (alj) obj;
        return a.ao(aljVar.a, this.a) && a.ao(aljVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
