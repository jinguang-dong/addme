package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sft extends sfw implements Map {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;
    transient Set c;

    public sft(Map map, Object obj) {
        super(map, obj);
    }

    public Map a() {
        return (Map) this.g;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.h) {
            a().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.h) {
            zContainsKey = a().containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.h) {
            zContainsValue = a().containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        Object obj = this.h;
        synchronized (obj) {
            if (this.c == null) {
                this.c = new sfy(a().entrySet(), obj);
            }
            set = this.c;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.h) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.h) {
            obj2 = a().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.h) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.h) {
            zIsEmpty = a().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public Set keySet() {
        Set set;
        Object obj = this.h;
        synchronized (obj) {
            if (this.a == null) {
                this.a = new sfy(a().keySet(), obj);
            }
            set = this.a;
        }
        return set;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.h) {
            objPut = a().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.h) {
            a().putAll(map);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.h) {
            objRemove = a().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.h) {
            size = a().size();
        }
        return size;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        Object obj = this.h;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new sfr(a().values(), obj);
            }
            collection = this.b;
        }
        return collection;
    }
}
