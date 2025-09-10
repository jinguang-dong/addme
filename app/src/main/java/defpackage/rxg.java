package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxg extends sak {
    final Set a;
    final /* synthetic */ rxk b;

    public rxg(rxk rxkVar) {
        this.b = rxkVar;
        this.a = rxkVar.a.entrySet();
    }

    @Override // defpackage.sad, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.sak, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.sak
    /* renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.a.contains(ujp.az((Map.Entry) obj));
        }
        return false;
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ujp.bn(this, collection);
    }

    @Override // defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        rxk rxkVar = this.b;
        return new rxe(rxkVar, rxkVar.a.entrySet().iterator());
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Set set = this.a;
        if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        this.b.b.a.remove(entry.getValue());
        set.remove(entry);
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

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ujp.ap(this, objArr);
    }
}
