package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rxk extends saf implements Serializable, ryq {
    private static final long serialVersionUID = 0;
    public transient Map a;
    public transient rxk b;
    private transient Set c;
    private transient Set d;
    private transient Set e;

    public rxk(Map map, rxk rxkVar) {
        this.a = map;
        this.b = rxkVar;
    }

    @Override // defpackage.saf, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    public Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.saf, java.util.Map
    public final void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    @Override // defpackage.saf, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.ryq
    public final ryq d() {
        return this.b;
    }

    public final Object e(Object obj) {
        Object objRemove = this.a.remove(obj);
        h(objRemove);
        return objRemove;
    }

    @Override // defpackage.saf, java.util.Map
    public final Set entrySet() {
        Set set = this.e;
        if (set != null) {
            return set;
        }
        rxg rxgVar = new rxg(this);
        this.e = rxgVar;
        return rxgVar;
    }

    @Override // defpackage.saf
    protected final Map f() {
        return this.a;
    }

    @Override // defpackage.saf, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        rxj rxjVar = new rxj(this);
        this.d = rxjVar;
        return rxjVar;
    }

    public final void h(Object obj) {
        this.b.a.remove(obj);
    }

    final void i(Map map, Map map2) {
        rnt.L(this.a == null);
        rnt.L(this.b == null);
        a.I(map.isEmpty());
        a.I(map2.isEmpty());
        a.I(map != map2);
        this.a = map;
        this.b = new rxh(map2, this);
    }

    public final void j(Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            h(obj2);
        }
        this.b.a.put(obj3, obj);
    }

    @Override // defpackage.ryq
    public final void k(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.saf, java.util.Map
    public final Set keySet() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        rxi rxiVar = new rxi(this);
        this.c = rxiVar;
        return rxiVar;
    }

    @Override // defpackage.saf, java.util.Map, defpackage.ryq
    public Object put(Object obj, Object obj2) {
        b(obj);
        c(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && a.K(obj2, get(obj))) {
            return obj2;
        }
        rnt.F(!containsValue(obj2), "value already present: %s", obj2);
        Object objPut = this.a.put(obj, obj2);
        j(obj, zContainsKey, objPut, obj2);
        return objPut;
    }

    @Override // defpackage.saf, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.saf, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return e(obj);
        }
        return null;
    }

    public rxk(Map map, Map map2) {
        i(map, map2);
    }

    public Object c(Object obj) {
        return obj;
    }
}
