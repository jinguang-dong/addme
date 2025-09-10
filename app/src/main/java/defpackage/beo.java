package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class beo extends ufq implements Map, bdx {
    public bev a;
    public Object b;
    public int c;
    public int d;
    public byi e = new byi();
    private bem f;

    public beo(bem bemVar) {
        this.f = bemVar;
        bem bemVar2 = this.f;
        this.a = bemVar2.b;
        this.d = bemVar2.b();
    }

    @Override // defpackage.ufq
    public final int b() {
        return this.d;
    }

    @Override // defpackage.bdx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bem a() {
        bev bevVar = this.a;
        bem bemVar = this.f;
        if (bevVar != bemVar.b) {
            this.e = new byi();
            bemVar = new bem(bevVar, b());
        }
        this.f = bemVar;
        return bemVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = bev.a;
        g(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.ufq
    public final Collection d() {
        return new ber(this);
    }

    @Override // defpackage.ufq
    public final Set e() {
        return new bej(this);
    }

    @Override // defpackage.ufq
    public final Set f() {
        return new beq(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final void g(int i) {
        this.d = i;
        this.c++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.a.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.b = null;
        this.a = this.a.e(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        bem bemVarA = map instanceof bem ? (bem) map : null;
        if (bemVarA == null) {
            beo beoVar = map instanceof beo ? (beo) map : null;
            bemVarA = beoVar != null ? beoVar.a() : null;
        }
        if (bemVarA == null) {
            super.putAll(map);
            return;
        }
        bfd bfdVar = new bfd(null);
        int iB = b();
        bev bevVar = this.a;
        bev bevVar2 = bemVarA.b;
        bevVar2.getClass();
        this.a = bevVar.f(bevVar2, 0, bfdVar, this);
        int iB2 = (bemVarA.b() + iB) - bfdVar.a;
        if (iB != iB2) {
            g(iB2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.b = null;
        bev bevVarG = this.a.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (bevVarG == null) {
            bevVarG = bev.a;
        }
        this.a = bevVarG;
        return this.b;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iB = b();
        bev bevVarH = this.a.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (bevVarH == null) {
            bevVarH = bev.a;
        }
        this.a = bevVarH;
        return iB != b();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
