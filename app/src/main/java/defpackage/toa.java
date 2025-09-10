package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toa extends tnu implements RandomAccess, tpj, tqz {
    public static final toa a;
    private static final boolean[] c;
    public int b;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        c = zArr;
        a = new toa(zArr, 0, false);
    }

    toa() {
        this(c, 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fG();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, zArr2, 0, i);
            System.arraycopy(this.d, i, zArr2, i3, this.b - i);
            this.d = zArr2;
        }
        this.d[i] = zBooleanValue;
        this.b++;
        this.modCount++;
    }

    @Override // defpackage.tnu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        fG();
        tpx.b(collection);
        if (!(collection instanceof toa)) {
            return super.addAll(collection);
        }
        toa toaVar = (toa) collection;
        int i = toaVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.d;
        if (i3 > zArr.length) {
            this.d = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(toaVar.d, 0, this.d, this.b, toaVar.b);
        this.b = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.tpw
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final tpj e(int i) {
        if (i >= this.b) {
            return new toa(i == 0 ? c : Arrays.copyOf(this.d, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toa)) {
            return super.equals(obj);
        }
        toa toaVar = (toa) obj;
        if (this.b != toaVar.b) {
            return false;
        }
        boolean[] zArr = toaVar.d;
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tpj
    public final void f(boolean z) {
        fG();
        int i = this.b;
        int length = this.d.length;
        if (i == length) {
            boolean[] zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, zArr, 0, this.b);
            this.d = zArr;
        }
        boolean[] zArr2 = this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        zArr2[i2] = z;
    }

    @Override // defpackage.tpj
    public final boolean g(int i) {
        i(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(g(i));
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iO = 1;
        for (int i = 0; i < this.b; i++) {
            boolean z = this.d[i];
            byte[] bArr = tpx.b;
            iO = (iO * 31) + a.o(z);
        }
        return iO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        fG();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        if (i < this.b - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.b--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        fG();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.d;
        System.arraycopy(zArr, i2, zArr, i, this.b - i2);
        this.b -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fG();
        i(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    private toa(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.b = i;
    }

    @Override // defpackage.tnu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
