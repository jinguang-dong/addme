package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saq extends AbstractMap implements Serializable, ryq {
    private final saw a;
    private transient Set b;

    public saq(saw sawVar) {
        this.a = sawVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ryq
    public final ryq d() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        sar sarVar = new sar(this.a);
        this.b = sarVar;
        return sarVar;
    }

    @Override // defpackage.ryq
    /* renamed from: g */
    public final Set values() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        saw sawVar = this.a;
        int iE = sawVar.e(obj);
        if (iE == -1) {
            return null;
        }
        return sawVar.a[iE];
    }

    @Override // defpackage.ryq
    public final void k(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.ryq
    public final Object put(Object obj, Object obj2) {
        return this.a.n(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iBb = ujp.bb(obj);
        saw sawVar = this.a;
        int iF = sawVar.f(obj, iBb);
        if (iF == -1) {
            return null;
        }
        Object obj2 = sawVar.a[iF];
        sawVar.j(iF, iBb);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
