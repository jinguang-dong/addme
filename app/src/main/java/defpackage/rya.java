package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rya extends rxx implements Set {
    final /* synthetic */ ryb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rya(ryb rybVar, Object obj, Set set) {
        super(rybVar, obj, set, null);
        this.f = rybVar;
    }

    @Override // defpackage.rxx, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAm = ujp.am((Set) this.b, collection);
        if (zAm) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zAm;
    }
}
