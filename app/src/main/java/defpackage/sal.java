package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sal extends sak implements SortedSet {
    protected sal() {
    }

    @Override // defpackage.sak
    protected /* bridge */ /* synthetic */ Set c() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    protected abstract SortedSet e();

    @Override // java.util.SortedSet
    public final Object first() {
        return e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return e().headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return e().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return e().tailSet(obj);
    }
}
