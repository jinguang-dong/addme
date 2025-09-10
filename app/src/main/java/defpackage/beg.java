package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class beg extends bdz {
    private final Object c;

    public beg(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.bdz, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        this.a--;
        return this.c;
    }
}
