package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqb implements Map.Entry {
    public final Map.Entry a;

    public tqb(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((tqd) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof tqr)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        tqd tqdVar = (tqd) this.a.getValue();
        tqr tqrVar = tqdVar.a;
        tqdVar.b = null;
        tqdVar.a = (tqr) obj;
        return tqrVar;
    }
}
