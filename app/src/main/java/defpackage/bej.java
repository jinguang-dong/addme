package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bej extends ufr {
    private final beo a;

    public bej() {
        throw null;
    }

    @Override // defpackage.ufr
    public final int a() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
                Object key = entry.getKey();
                beo beoVar = this.a;
                Object obj2 = beoVar.get(key);
                return obj2 != null ? a.ao(obj2, entry.getValue()) : entry.getValue() == null && beoVar.containsKey(entry.getKey());
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new boi(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
            return this.a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    public bej(beo beoVar) {
        this.a = beoVar;
    }
}
