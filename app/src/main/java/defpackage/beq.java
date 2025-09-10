package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class beq extends ufr implements Set, ukh {
    private final beo a;

    public beq(beo beoVar) {
        this.a = beoVar;
    }

    @Override // defpackage.ufr
    public final int a() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        bew[] bewVarArr = new bew[8];
        for (int i = 0; i < 8; i++) {
            bewVarArr[i] = new bey();
        }
        return new bep(this.a, bewVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        beo beoVar = this.a;
        if (!beoVar.containsKey(obj)) {
            return false;
        }
        beoVar.remove(obj);
        return true;
    }
}
