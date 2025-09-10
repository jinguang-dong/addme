package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufz implements Iterator, ukd {
    private final float[] a;
    private int b;

    public ufz() {
        throw null;
    }

    public final float a() {
        try {
            float[] fArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }

    public ufz(float[] fArr) {
        this.a = fArr;
    }
}
