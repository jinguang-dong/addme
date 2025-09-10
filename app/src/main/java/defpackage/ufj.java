package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ufj implements Iterator, ukd {
    public int a;
    final /* synthetic */ ufm b;

    public ufj(ufm ufmVar) {
        this.b = ufmVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ufm ufmVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return ufmVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
