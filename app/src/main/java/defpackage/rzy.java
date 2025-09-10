package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzy extends rzm {
    public rzy(rzw rzwVar) {
        super(rzwVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final /* synthetic */ Iterator descendingIterator() {
        return sdf.a;
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // defpackage.scv, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.scv
    /* renamed from: fy */
    public final sgj descendingIterator() {
        return sdf.a;
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe
    /* renamed from: fz */
    public final sgj listIterator() {
        return sdf.a;
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return sdf.a;
    }

    @Override // defpackage.rzm, defpackage.scv
    public final scv k() {
        return scv.P(sff.a);
    }

    @Override // defpackage.scv, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.rzm, defpackage.scv
    public final /* bridge */ /* synthetic */ scv n(Object obj, boolean z) {
        return this;
    }

    @Override // defpackage.rzm, defpackage.scv
    public final /* bridge */ /* synthetic */ scv q(Object obj, boolean z, Object obj2, boolean z2) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // defpackage.rzm, defpackage.scv
    public final /* bridge */ /* synthetic */ scv t(Object obj, boolean z) {
        return this;
    }

    @Override // defpackage.rzm, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // defpackage.rzm
    public final seo u() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.scn, defpackage.sbe
    public final sbp v() {
        int i = sbp.d;
        return sex.a;
    }

    @Override // defpackage.scn
    public final boolean w() {
        return true;
    }

    @Override // defpackage.rzm, defpackage.scv, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new rzx(this.a);
    }

    @Override // defpackage.rzm
    public final rzm d(Comparable comparable, boolean z) {
        return this;
    }

    @Override // defpackage.rzm
    public final rzm j(Comparable comparable, boolean z) {
        return this;
    }

    @Override // defpackage.rzm
    public final rzm g(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }
}
