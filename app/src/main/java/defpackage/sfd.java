package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sfd extends scn {
    public static final sfd a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new sfd(objArr, 0, objArr, 0, 0);
    }

    public sfd(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.sbe
    public final Object[] A() {
        return this.b;
    }

    @Override // defpackage.scn
    public final sbp C() {
        return sbp.g(this.b, this.g);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int iBb = ujp.bb(obj);
                while (true) {
                    int i = iBb & this.f;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iBb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz, reason: merged with bridge method [inline-methods] */
    public final sgj listIterator() {
        return v().iterator();
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.scn
    public final boolean w() {
        return true;
    }

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int x(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.sbe
    public final int y() {
        return this.g;
    }

    @Override // defpackage.sbe
    public final int z() {
        return 0;
    }
}
