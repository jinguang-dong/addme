package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sbv implements Map, Serializable, j$.util.Map {
    private static final long serialVersionUID = 912559;
    private transient scn a;
    private transient scn b;
    private transient sbe c;

    public static sbr j(int i) {
        ujp.bq(i, "expectedSize");
        return new sbr(i);
    }

    public static sbv l(Iterable iterable) {
        sbr sbrVar = new sbr(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        sbrVar.i(iterable);
        return sbrVar.b();
    }

    public static sbv m(Map map) {
        if ((map instanceof sbv) && !(map instanceof SortedMap)) {
            sbv sbvVar = (sbv) map;
            if (!sbvVar.fF()) {
                return sbvVar;
            }
        }
        return l(map.entrySet());
    }

    public static sbv n(Object obj, Object obj2) {
        ujp.bo(obj, obj2);
        return sfc.a(1, new Object[]{obj, obj2});
    }

    public static sbv o(Object obj, Object obj2, Object obj3, Object obj4) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        return sfc.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static sbv p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        return sfc.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static sbv q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        ujp.bo(obj7, obj8);
        return sfc.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static sbv r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        ujp.bo(obj7, obj8);
        ujp.bo(obj9, obj10);
        ujp.bo(obj11, obj12);
        ujp.bo(obj13, obj14);
        return sfc.a(7, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14});
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ujp.aA(this, obj);
    }

    public abstract sbe f();

    public abstract scn fC();

    public abstract scn fD();

    public sgj fE() {
        throw null;
    }

    public abstract boolean fF();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public sbe values() {
        sbe sbeVar = this.c;
        if (sbeVar != null) {
            return sbeVar;
        }
        sbe sbeVarF = f();
        this.c = sbeVarF;
        return sbeVarF;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ujp.ah(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final scn entrySet() {
        scn scnVar = this.a;
        if (scnVar != null) {
            return scnVar;
        }
        scn scnVarFC = fC();
        this.a = scnVarFC;
        return scnVarFC;
    }

    @Override // java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public scn keySet() {
        scn scnVar = this.b;
        if (scnVar != null) {
            return scnVar;
        }
        scn scnVarFD = fD();
        this.b = scnVarFD;
        return scnVarFD;
    }

    public final String toString() {
        StringBuilder sbBm = ujp.bm(size());
        sbBm.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sbBm.append(", ");
            }
            sbBm.append(entry.getKey());
            sbBm.append('=');
            sbBm.append(entry.getValue());
            z = false;
        }
        sbBm.append('}');
        return sbBm.toString();
    }

    public Object writeReplace() {
        return new sbu(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
