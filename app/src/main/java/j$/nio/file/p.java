package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class p implements Iterator {
    public int a = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.o b;

    public p(j$.desugar.sun.nio.fs.o oVar) {
        this.b = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        j$.desugar.sun.nio.fs.o oVar = this.b;
        if (i >= oVar.c.size()) {
            throw new NoSuchElementException();
        }
        j$.desugar.sun.nio.fs.o name = oVar.getName(this.a);
        this.a++;
        return name;
    }
}
