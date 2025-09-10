package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ryg implements sea {
    private transient Collection a;
    private transient Set b;
    public transient Collection c;
    private transient Map d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sea) {
            return q().equals(((sea) obj).q());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Iterator g();

    public Iterator h() {
        throw null;
    }

    public final int hashCode() {
        return q().hashCode();
    }

    public abstract Map j();

    public abstract Set k();

    public void o(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.sea
    public Collection p() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.a = collectionF;
        return collectionF;
    }

    @Override // defpackage.sea
    public Map q() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapJ = j();
        this.d = mapJ;
        return mapJ;
    }

    @Override // defpackage.sea
    public Set r() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setK = k();
        this.b = setK;
        return setK;
    }

    @Override // defpackage.sea
    public final boolean s(Object obj, Object obj2) {
        Collection collection = (Collection) q().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public final boolean t(Object obj) {
        Iterator it = q().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return q().toString();
    }

    public final boolean u() {
        return e() == 0;
    }

    @Override // defpackage.sea
    public boolean v(Object obj, Object obj2) {
        Collection collection = (Collection) q().get(obj);
        return collection != null && collection.remove(obj2);
    }
}
