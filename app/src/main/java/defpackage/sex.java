package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sex extends sbp {
    public static final sbp a = new sex(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public sex(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.sbe
    public final Object[] A() {
        return this.b;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rnt.S(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbp, defpackage.sbe
    public final int x(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.c;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.sbe
    public final int y() {
        return this.c;
    }

    @Override // defpackage.sbe
    public final int z() {
        return 0;
    }
}
