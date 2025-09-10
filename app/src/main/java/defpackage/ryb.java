package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ryb extends ryg implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected ryb(Map map) {
        a.I(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    @Override // defpackage.sea
    public Collection b(Object obj) {
        Collection collectionA = (Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return c(obj, collectionA);
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.sea
    public final int e() {
        return this.b;
    }

    @Override // defpackage.ryg
    public final Collection f() {
        return this instanceof ryl ? new rye(this) : new seb(this);
    }

    @Override // defpackage.ryg
    public final Iterator g() {
        return new rxo(this);
    }

    @Override // defpackage.ryg
    public final Iterator h() {
        return new rxn(this);
    }

    final List i(Object obj, List list, rxx rxxVar) {
        return list instanceof RandomAccess ? new rxv(this, obj, list, rxxVar) : new rxz(this, obj, list, rxxVar);
    }

    @Override // defpackage.ryg
    public final Map j() {
        return new rxr(this, this.a);
    }

    @Override // defpackage.ryg
    public final Set k() {
        return new rxu(this, this.a);
    }

    @Override // defpackage.sea
    public final void l() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void m(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            a.I(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    public final boolean n(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ryg
    public final void o(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
            }
        } else {
            Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.b++;
            this.a.put(obj, collectionA);
        }
    }
}
