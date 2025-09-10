package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfj extends beo implements Map, bdx {
    private bfk f;

    public bfj(bfk bfkVar) {
        super(bfkVar);
        this.f = bfkVar;
    }

    @Override // defpackage.beo, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof ayp) {
            return super.containsKey((ayp) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof bbs) {
            return super.containsValue((bbs) obj);
        }
        return false;
    }

    @Override // defpackage.beo, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof ayp) {
            return (bbs) super.get((ayp) obj);
        }
        return null;
    }

    @Override // defpackage.beo, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ayp) ? obj2 : (bbs) Map.CC.$default$getOrDefault(this, (ayp) obj, (bbs) obj2);
    }

    @Override // defpackage.beo
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final bfk a() {
        bev bevVar = this.a;
        bfk bfkVar = this.f;
        if (bevVar != bfkVar.b) {
            this.e = new byi();
            bfkVar = new bfk(bevVar, this.d);
        }
        this.f = bfkVar;
        return bfkVar;
    }

    @Override // defpackage.beo, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof ayp) {
            return (bbs) super.remove((ayp) obj);
        }
        return null;
    }
}
