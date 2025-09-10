package defpackage;

import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzs extends scv {
    private final scv a;

    public rzs(scv scvVar) {
        super(sem.b(scvVar.b).a());
        this.a = scvVar;
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.floor(obj);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final /* synthetic */ NavigableSet descendingSet() {
        return this.a;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return this.a.fA();
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // defpackage.scv
    /* renamed from: fx */
    public final scv descendingSet() {
        return this.a;
    }

    @Override // defpackage.scv, java.util.NavigableSet
    /* renamed from: fy */
    public final sgj descendingIterator() {
        return this.a.listIterator();
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return this.a.descendingIterator();
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.lower(obj);
    }

    @Override // defpackage.scv
    public final scv k() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.higher(obj);
    }

    @Override // defpackage.scv
    public final scv n(Object obj, boolean z) {
        return this.a.tailSet(obj, z).descendingSet();
    }

    @Override // defpackage.scv
    public final scv q(Object obj, boolean z, Object obj2, boolean z2) {
        return this.a.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.scv
    public final scv t(Object obj, boolean z) {
        return this.a.m(obj, z).descendingSet();
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
