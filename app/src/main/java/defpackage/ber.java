package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ber extends ufo implements Collection, uke {
    private final beo a;

    public ber(beo beoVar) {
        this.a = beoVar;
    }

    @Override // defpackage.ufo
    public final int a() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        bew[] bewVarArr = new bew[8];
        for (int i = 0; i < 8; i++) {
            bewVarArr[i] = new bfa();
        }
        return new bep(this.a, bewVarArr);
    }
}
