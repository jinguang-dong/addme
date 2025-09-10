package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sfa extends scn {
    private final transient sbv a;
    private final transient sbp b;

    public sfa(sbv sbvVar, sbp sbpVar) {
        this.a = sbvVar;
        this.b = sbpVar;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return this.b.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.scn, defpackage.sbe
    public final sbp v() {
        return this.b;
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int x(Object[] objArr, int i) {
        return this.b.x(objArr, i);
    }
}
