package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhh implements Map.Entry, ukf {
    final /* synthetic */ bhi a;
    private final Object b;
    private Object c;

    public bhh(bhi bhiVar) {
        this.a = bhiVar;
        Map.Entry entry = bhiVar.c;
        entry.getClass();
        this.b = entry.getKey();
        Map.Entry entry2 = bhiVar.c;
        entry2.getClass();
        this.c = entry2.getValue();
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
    public final Object setValue(Object obj) {
        bhi bhiVar = this.a;
        bhc bhcVar = bhiVar.a;
        if (bhcVar.a() != bhiVar.b) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.c;
        bhcVar.put(this.b, obj);
        this.c = obj;
        return obj2;
    }
}
