package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfl extends sal implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet a;
    private final SortedSet b;
    private transient sfl c;

    public sfl(NavigableSet navigableSet) {
        navigableSet.getClass();
        this.a = navigableSet;
        this.b = DesugarCollections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.sad, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.b;
    }

    @Override // defpackage.sak, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.sal, defpackage.sak
    /* renamed from: c */
    protected final /* synthetic */ Set a() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ujp.aJ(this.a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        sfl sflVar = this.c;
        if (sflVar != null) {
            return sflVar;
        }
        sfl sflVar2 = new sfl(this.a.descendingSet());
        this.c = sflVar2;
        sflVar2.c = this;
        return sflVar2;
    }

    @Override // defpackage.sal
    protected final SortedSet e() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ujp.aj(this.a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ujp.aj(this.a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ujp.aj(this.a.tailSet(obj, z));
    }
}
