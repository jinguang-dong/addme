package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class scx extends scn {
    @Override // defpackage.scn
    public final sbp C() {
        return new scw(this);
    }

    public abstract Object a(int i);

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public sgj listIterator() {
        throw null;
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
