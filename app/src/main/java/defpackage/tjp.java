package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjp implements Map.Entry {
    tjp a;
    tjp b;
    tjp c;
    tjp d;
    tjp e;
    public final Object f;
    final boolean g;
    public Object h;
    int i;

    public tjp(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f) + "=" + String.valueOf(this.h);
    }

    public tjp(boolean z, tjp tjpVar, Object obj, tjp tjpVar2, tjp tjpVar3) {
        this.a = tjpVar;
        this.f = obj;
        this.g = z;
        this.i = 1;
        this.d = tjpVar2;
        this.e = tjpVar3;
        tjpVar3.d = this;
        tjpVar2.e = this;
    }
}
