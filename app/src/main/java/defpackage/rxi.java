package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxi extends sak {
    final /* synthetic */ rxk a;

    public rxi(rxk rxkVar) {
        this.a = rxkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sak, defpackage.sad
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set b() {
        return this.a.a.keySet();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sdq(this.a.entrySet().iterator());
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.e(obj);
        return true;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        return d(collection);
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return t(collection);
    }
}
