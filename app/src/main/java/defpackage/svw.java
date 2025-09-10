package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class svw extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final float[] a;
    public final int b;
    public final int c;

    public svw(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && ske.ak(this.a, ((Float) obj).floatValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svw)) {
            return super.equals(obj);
        }
        svw svwVar = (svw) obj;
        int size = size();
        if (svwVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != svwVar.a[svwVar.b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        rnt.S(i, size());
        return Float.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = this.b; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.a[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float[] fArr = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.b;
        int iAk = ske.ak(fArr, fFloatValue, i, this.c);
        if (iAk >= 0) {
            return iAk - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.a;
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (fArr[i2] == fFloatValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        rnt.S(i, size());
        int i2 = this.b;
        float[] fArr = this.a;
        int i3 = i2 + i;
        float f2 = fArr[i3];
        f.getClass();
        fArr[i3] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        rnt.K(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        float[] fArr = this.a;
        int i3 = this.b;
        return new svw(fArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        float[] fArr = this.a;
        int i = this.b;
        sb.append(fArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(fArr[i]);
        }
    }
}
