package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yd extends aaa implements Map, j$.util.Map {
    xx a;
    xz b;
    yb c;

    public yd() {
    }

    public final boolean a(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
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
    public final Set entrySet() {
        xx xxVar = this.a;
        if (xxVar != null) {
            return xxVar;
        }
        xx xxVar2 = new xx(this);
        this.a = xxVar2;
        return xxVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        xz xzVar = this.b;
        if (xzVar != null) {
            return xzVar;
        }
        xz xzVar2 = new xz(this);
        this.b = xzVar2;
        return xzVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        h(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        yb ybVar = this.c;
        if (ybVar != null) {
            return ybVar;
        }
        yb ybVar2 = new yb(this);
        this.c = ybVar2;
        return ybVar2;
    }

    public yd(int i) {
        super(i);
    }

    public yd(aaa aaaVar) {
        super((byte[]) null);
        i(aaaVar);
    }
}
