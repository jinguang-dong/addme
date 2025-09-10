package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trb extends tnu implements RandomAccess {
    public static final trb a;
    private static final Object[] c;
    public Object[] b;
    private int d;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        a = new trb(objArr, 0, false);
    }

    trb() {
        this(c, 0, true);
    }

    private final String d(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        fG();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.d - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.tpw
    public final /* bridge */ /* synthetic */ tpw e(int i) {
        if (i >= this.d) {
            return new trb(i == 0 ? c : Arrays.copyOf(this.b, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.b[i];
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        fG();
        f(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        fG();
        f(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private trb(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        fG();
        int i = this.d;
        int length = this.b.length;
        if (i == length) {
            this.b = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
