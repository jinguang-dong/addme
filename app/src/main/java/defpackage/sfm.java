package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sfm extends scn {
    final transient Object a;

    public sfm(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return new sdi(this.a);
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.scn, defpackage.sbe
    public final sbp v() {
        return sbp.l(this.a);
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int x(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }
}
