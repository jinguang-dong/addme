package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzn extends rzr {
    public static final rzn a = new rzn();
    private static final long serialVersionUID = 0;

    private rzn() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.rzr
    /* renamed from: a */
    public final int compareTo(rzr rzrVar) {
        return rzrVar == this ? 0 : 1;
    }

    @Override // defpackage.rzr
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.rzr
    public final Comparable c(rzw rzwVar) {
        return rzwVar.b();
    }

    @Override // defpackage.rzr, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((rzr) obj);
    }

    @Override // defpackage.rzr
    public final Comparable d(rzw rzwVar) {
        throw new AssertionError();
    }

    @Override // defpackage.rzr
    public final void e(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.rzr
    public final void f(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.rzr
    public final boolean g(Comparable comparable) {
        return false;
    }

    @Override // defpackage.rzr
    public final rzr h(rzw rzwVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // defpackage.rzr
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.rzr
    public final rzr i(rzw rzwVar) {
        throw new IllegalStateException();
    }

    public final String toString() {
        return "+∞";
    }
}
