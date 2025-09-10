package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sak extends sad implements Set {
    protected sak() {
    }

    @Override // defpackage.sad
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Set c();

    protected final boolean d(Collection collection) {
        collection.getClass();
        return ujp.am(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c().hashCode();
    }
}
