package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class bgu implements Set, ukh {
    public final bhc a;

    public bgu(bhc bhcVar) {
        this.a = bhcVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ujj.b(this, objArr);
    }
}
