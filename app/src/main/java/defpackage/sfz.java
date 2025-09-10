package defpackage;

import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sfz extends sft implements SortedMap {
    private static final long serialVersionUID = 0;

    public sfz(SortedMap sortedMap, Object obj) {
        super(sortedMap, obj);
    }

    @Override // defpackage.sft
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedMap a() {
        return (SortedMap) super.a();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.h) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Object objFirstKey;
        synchronized (this.h) {
            objFirstKey = a().firstKey();
        }
        return objFirstKey;
    }

    public SortedMap headMap(Object obj) {
        sfz sfzVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sfzVar = new sfz(a().headMap(obj), obj2);
        }
        return sfzVar;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Object objLastKey;
        synchronized (this.h) {
            objLastKey = a().lastKey();
        }
        return objLastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        sfz sfzVar;
        Object obj3 = this.h;
        synchronized (obj3) {
            sfzVar = new sfz(a().subMap(obj, obj2), obj3);
        }
        return sfzVar;
    }

    public SortedMap tailMap(Object obj) {
        sfz sfzVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sfzVar = new sfz(a().tailMap(obj), obj2);
        }
        return sfzVar;
    }
}
