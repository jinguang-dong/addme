package j$.util;

import java.util.Comparator;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0130z extends d0 {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130z(java.util.SortedSet sortedSet, java.util.SortedSet sortedSet2) {
        super(sortedSet2, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
