package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfk extends bem implements Map, bdy {
    public static final bfk d = new bfk(bev.a, 0);

    public bfk(bev bevVar, int i) {
        super(bevVar, i);
    }

    @Override // defpackage.bem, defpackage.bdy
    public final /* synthetic */ bdx a() {
        return new bfj(this);
    }

    @Override // defpackage.bem, defpackage.ufn, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof ayp) {
            return super.containsKey((ayp) obj);
        }
        return false;
    }

    @Override // defpackage.ufn, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof bbs) {
            return super.containsValue((bbs) obj);
        }
        return false;
    }

    @Override // defpackage.bem
    /* renamed from: d */
    public final /* synthetic */ beo a() {
        return new bfj(this);
    }

    @Override // defpackage.bem, defpackage.ufn, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof ayp) {
            return (bbs) super.get((ayp) obj);
        }
        return null;
    }

    @Override // defpackage.ufn, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ayp) ? obj2 : (bbs) Map.CC.$default$getOrDefault(this, (ayp) obj, (bbs) obj2);
    }

    public final Object h(ayp aypVar) {
        return bay.J(this, aypVar);
    }

    public final bfk i(ayp aypVar, bbs bbsVar) {
        beu beuVarD = this.b.d(aypVar.hashCode(), aypVar, bbsVar, 0);
        if (beuVarD == null) {
            return this;
        }
        return new bfk(beuVarD.a, this.c + beuVarD.b);
    }
}
