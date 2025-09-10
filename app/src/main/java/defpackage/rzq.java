package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzq extends rzr {
    private static final long serialVersionUID = 0;

    public rzq(Comparable comparable) {
        super(comparable);
    }

    @Override // defpackage.rzr
    public final Comparable c(rzw rzwVar) {
        return rzwVar.f(this.b);
    }

    @Override // defpackage.rzr
    public final Comparable d(rzw rzwVar) {
        return this.b;
    }

    @Override // defpackage.rzr
    public final void e(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.rzr
    public final void f(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.rzr
    public final boolean g(Comparable comparable) {
        return seo.b(this.b, comparable) <= 0;
    }

    @Override // defpackage.rzr
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.rzr
    public final rzr i(rzw rzwVar) {
        Comparable comparableF = rzwVar.f(this.b);
        return comparableF == null ? rzn.a : new rzo(comparableF);
    }

    public final String toString() {
        return "\\" + this.b.toString() + "/";
    }

    @Override // defpackage.rzr
    public final rzr h(rzw rzwVar) {
        return this;
    }
}
