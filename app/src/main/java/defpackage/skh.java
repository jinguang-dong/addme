package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skh implements Iterator {
    final /* synthetic */ ski a;
    private int b = 0;

    public skh(ski skiVar) {
        this.a = skiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        ski skiVar = this.a;
        if (i >= skiVar.size()) {
            throw new NoSuchElementException();
        }
        skj skjVar = skiVar.b;
        Object obj = skjVar.b[skiVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
