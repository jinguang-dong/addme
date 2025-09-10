package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxp extends sdu {
    final /* synthetic */ rxr a;

    public rxp(rxr rxrVar) {
        this.a = rxrVar;
    }

    @Override // defpackage.sdu
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.sdu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.a.a.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rxq(this.a);
    }

    @Override // defpackage.sdu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        rxr rxrVar = this.a;
        Object key = entry.getKey();
        ryb rybVar = rxrVar.b;
        Map map = rybVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        rybVar.b -= size;
        return true;
    }
}
