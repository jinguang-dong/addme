package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uku extends ugd {
    public boolean a;
    private final int b;
    private final int c;
    private int d;

    public uku(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.a = z;
        this.d = true != z ? i2 : i;
    }

    @Override // defpackage.ugd
    public final int a() {
        int i = this.d;
        if (i != this.c) {
            this.d = this.b + i;
            return i;
        }
        if (!this.a) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}
