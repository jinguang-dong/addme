package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugn implements Map.Entry, ukf {
    private final ugq a;
    private final int b;
    private final int c;

    public ugn(ugq ugqVar, int i) {
        this.a = ugqVar;
        this.b = i;
        this.c = ugqVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a.ao(entry.getKey(), getKey()) && a.ao(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.c;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        ugq ugqVar = this.a;
        ugqVar.f();
        Object[] objArrK = ugqVar.k();
        int i = this.b;
        Object obj2 = objArrK[i];
        objArrK[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
