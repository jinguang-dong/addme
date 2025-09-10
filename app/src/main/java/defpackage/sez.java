package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sez extends scn {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient sbv d;

    public sez(sbv sbvVar, Object[] objArr, int i, int i2) {
        this.d = sbvVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.scn
    public final sbp C() {
        return new sey(this);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return v().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int x(Object[] objArr, int i) {
        return v().x(objArr, i);
    }
}
