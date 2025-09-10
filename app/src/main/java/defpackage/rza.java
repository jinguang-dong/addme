package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rza extends AbstractSet {
    final /* synthetic */ rzf a;

    public rza(rzf rzfVar) {
        this.a = rzfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = rzfVar.d(entry.getKey());
            if (iD != -1 && a.K(rzfVar.h(iD), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        int iBg;
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        if (mapJ != null) {
            return mapJ.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (rzfVar.o() || (iBg = ujp.bg(entry.getKey(), entry.getValue(), (iC = rzfVar.c()), rzfVar.g(), rzfVar.p(), rzfVar.q(), rzfVar.r())) == -1) {
            return false;
        }
        rzfVar.m(iBg, iC);
        rzfVar.f--;
        rzfVar.k();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
