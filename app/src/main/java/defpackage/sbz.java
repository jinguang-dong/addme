package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbz extends scx {
    private final sbv a;

    public sbz(sbv sbvVar) {
        this.a = sbvVar;
    }

    @Override // defpackage.scx
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().v().get(i)).getKey();
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // defpackage.scx, defpackage.scn, defpackage.sbe
    /* renamed from: fz */
    public final sgj listIterator() {
        return this.a.fE();
    }

    @Override // defpackage.scx, defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.scx, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new sby(this.a);
    }
}
