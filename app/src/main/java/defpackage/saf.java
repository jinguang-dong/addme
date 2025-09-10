package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class saf extends sai implements Map {
    protected saf() {
    }

    @Override // defpackage.sai
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public void clear() {
        f().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return f().containsValue(obj);
    }

    public Set entrySet() {
        return f().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || f().equals(obj);
    }

    protected abstract Map f();

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return f().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return f().isEmpty();
    }

    public Set keySet() {
        return f().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return f().put(obj, obj2);
    }

    public void putAll(Map map) {
        f().putAll(map);
    }

    public Object remove(Object obj) {
        return f().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return f().size();
    }

    public Collection values() {
        return f().values();
    }
}
