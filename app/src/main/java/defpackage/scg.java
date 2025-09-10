package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scg extends sbe {
    private static final long serialVersionUID = 0;
    final sci a;

    public scg(sci sciVar) {
        this.a = sciVar;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.s(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        throw null;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return new sce(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
