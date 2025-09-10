package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class sek extends sah implements Serializable {
    private static final long serialVersionUID = 0;
    final sed a;
    transient Set b;
    transient Set c;

    public sek(sed sedVar) {
        this.a = sedVar;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sad, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Set c() {
        return DesugarCollections.unmodifiableSet(this.a.f());
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sah, defpackage.sed
    public final int d(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sah, defpackage.sed
    public Set f() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.b = setC;
        return setC;
    }

    @Override // defpackage.sah, defpackage.sed
    public final Set g() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.a.g());
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // defpackage.sah, defpackage.sed
    public final void h(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.sah, defpackage.sed
    public final boolean i(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ujp.aJ(this.a.iterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sah, defpackage.sad
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public sed b() {
        return this.a;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
