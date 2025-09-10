package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class rvl implements Iterator {
    final CharSequence b;
    final boolean c;
    private Object f;
    public int a = 2;
    int d = 0;
    int e = Integer.MAX_VALUE;

    protected rvl(rwr rwrVar, CharSequence charSequence) {
        this.c = rwrVar.a;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        int iA;
        rnt.L(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.d;
            while (true) {
                int i4 = this.d;
                if (i4 == -1) {
                    this.a = 3;
                    break;
                }
                iB = b(i4);
                if (iB == -1) {
                    iB = this.b.length();
                    this.d = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.d = iA;
                }
                if (iA == i3) {
                    int i5 = iA + 1;
                    this.d = i5;
                    if (i5 > this.b.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i3 < iB) {
                        this.b.charAt(i3);
                    }
                    if (i3 < iB) {
                        this.b.charAt(iB - 1);
                    }
                    if (!this.c || i3 != iB) {
                        break;
                    }
                    i3 = this.d;
                }
            }
            int i6 = this.e;
            if (i6 == 1) {
                CharSequence charSequence = this.b;
                int length = charSequence.length();
                this.d = -1;
                if (length > i3) {
                    charSequence.charAt(length - 1);
                }
                iB = length;
            } else {
                this.e = i6 - 1;
            }
            string = this.b.subSequence(i3, iB).toString();
            this.f = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
