package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tri implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    final /* synthetic */ trl c;

    public tri(trl trlVar, Comparable comparable, Object obj) {
        this.c = trlVar;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((tri) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a.ao(this.a, entry.getKey()) && a.ao(this.b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.e();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.a) + "=" + String.valueOf(this.b);
    }
}
