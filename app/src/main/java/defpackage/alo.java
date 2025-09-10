package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alo implements alv {
    private final ami a;
    private final chq b;

    public alo(ami amiVar, chq chqVar) {
        this.a = amiVar;
        this.b = chqVar;
    }

    @Override // defpackage.alv
    public final float a() {
        ami amiVar = this.a;
        chq chqVar = this.b;
        return chqVar.di(amiVar.a(chqVar));
    }

    @Override // defpackage.alv
    public final float b(cib cibVar) {
        ami amiVar = this.a;
        chq chqVar = this.b;
        return chqVar.di(amiVar.b(chqVar, cibVar));
    }

    @Override // defpackage.alv
    public final float c(cib cibVar) {
        ami amiVar = this.a;
        chq chqVar = this.b;
        return chqVar.di(amiVar.c(chqVar, cibVar));
    }

    @Override // defpackage.alv
    public final float d() {
        ami amiVar = this.a;
        chq chqVar = this.b;
        return chqVar.di(amiVar.d(chqVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alo)) {
            return false;
        }
        alo aloVar = (alo) obj;
        return a.ao(this.a, aloVar.a) && a.ao(this.b, aloVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
