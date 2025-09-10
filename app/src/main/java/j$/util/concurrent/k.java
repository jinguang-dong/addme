package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes3.dex */
public class k implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile k d;

    public k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public k a(int i, Object obj) {
        Object obj2;
        k kVar = this;
        do {
            if (kVar.a == i && ((obj2 = kVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return kVar;
            }
            kVar = kVar.d;
        } while (kVar != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.c;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.g.Q(this.b, this.c);
    }

    public k(int i, Object obj, Object obj2, k kVar) {
        this(i, obj, obj2);
        this.d = kVar;
    }
}
