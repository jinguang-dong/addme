package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class toc extends tod {
    final /* synthetic */ toj a;
    private int b = 0;
    private final int c;

    public toc(toj tojVar) {
        this.a = tojVar;
        this.c = tojVar.d();
    }

    @Override // defpackage.tof
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
