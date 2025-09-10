package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beb extends bdz {
    private final Object[] c;

    public beb(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // defpackage.bdz, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        int i = this.a - 1;
        this.a = i;
        return objArr[i];
    }
}
