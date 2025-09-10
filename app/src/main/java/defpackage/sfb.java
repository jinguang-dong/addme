package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sfb extends sbp {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public sfb(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rnt.S(i, this.c);
        Object obj = this.a[i + i + this.b];
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
}
