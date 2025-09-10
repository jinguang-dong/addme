package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sag extends sai implements Map.Entry {
    protected sag() {
    }

    @Override // defpackage.sai
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract Map.Entry b();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return b().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return b().getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return b().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return b().hashCode();
    }

    public Object setValue(Object obj) {
        return b().setValue(obj);
    }
}
