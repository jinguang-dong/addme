package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfu extends sfz implements NavigableMap {
    private static final long serialVersionUID = 0;
    transient NavigableSet d;
    transient NavigableMap e;
    transient NavigableSet f;

    public sfu(NavigableMap navigableMap, Object obj) {
        super(navigableMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.sfz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) super.a();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryAg;
        Object obj2 = this.h;
        synchronized (obj2) {
            entryAg = ujp.ag(a().ceilingEntry(obj), obj2);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Object objCeilingKey;
        synchronized (this.h) {
            objCeilingKey = a().ceilingKey(obj);
        }
        return objCeilingKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        Object obj = this.h;
        synchronized (obj) {
            NavigableSet navigableSet = this.d;
            if (navigableSet != null) {
                return navigableSet;
            }
            sfv sfvVar = new sfv(a().descendingKeySet(), obj);
            this.d = sfvVar;
            return sfvVar;
        }
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        Object obj = this.h;
        synchronized (obj) {
            NavigableMap navigableMap = this.e;
            if (navigableMap != null) {
                return navigableMap;
            }
            sfu sfuVar = new sfu(a().descendingMap(), obj);
            this.e = sfuVar;
            return sfuVar;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryAg;
        Object obj = this.h;
        synchronized (obj) {
            entryAg = ujp.ag(a().firstEntry(), obj);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryAg;
        Object obj2 = this.h;
        synchronized (obj2) {
            entryAg = ujp.ag(a().floorEntry(obj), obj2);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Object objFloorKey;
        synchronized (this.h) {
            objFloorKey = a().floorKey(obj);
        }
        return objFloorKey;
    }

    @Override // defpackage.sfz, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryAg;
        Object obj2 = this.h;
        synchronized (obj2) {
            entryAg = ujp.ag(a().higherEntry(obj), obj2);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Object objHigherKey;
        synchronized (this.h) {
            objHigherKey = a().higherKey(obj);
        }
        return objHigherKey;
    }

    @Override // defpackage.sft, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryAg;
        Object obj = this.h;
        synchronized (obj) {
            entryAg = ujp.ag(a().lastEntry(), obj);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryAg;
        Object obj2 = this.h;
        synchronized (obj2) {
            entryAg = ujp.ag(a().lowerEntry(obj), obj2);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Object objLowerKey;
        synchronized (this.h) {
            objLowerKey = a().lowerKey(obj);
        }
        return objLowerKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        Object obj = this.h;
        synchronized (obj) {
            NavigableSet navigableSet = this.f;
            if (navigableSet != null) {
                return navigableSet;
            }
            sfv sfvVar = new sfv(a().navigableKeySet(), obj);
            this.f = sfvVar;
            return sfvVar;
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        Map.Entry entryAg;
        Object obj = this.h;
        synchronized (obj) {
            entryAg = ujp.ag(a().pollFirstEntry(), obj);
        }
        return entryAg;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        Map.Entry entryAg;
        Object obj = this.h;
        synchronized (obj) {
            entryAg = ujp.ag(a().pollLastEntry(), obj);
        }
        return entryAg;
    }

    @Override // defpackage.sfz, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.sfz, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        sfu sfuVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sfuVar = new sfu(a().headMap(obj, z), obj2);
        }
        return sfuVar;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        sfu sfuVar;
        Object obj3 = this.h;
        synchronized (obj3) {
            sfuVar = new sfu(a().subMap(obj, z, obj2, z2), obj3);
        }
        return sfuVar;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        sfu sfuVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sfuVar = new sfu(a().tailMap(obj, z), obj2);
        }
        return sfuVar;
    }
}
