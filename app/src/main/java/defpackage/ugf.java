package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugf implements ListIterator, ukd {
    final /* synthetic */ ugg a;
    private final ListIterator b;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.i();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ske.bu(this.a, this.b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ske.bu(this.a, this.b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.a();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.i();
    }

    public ugf(ugg uggVar, int i) {
        this.a = uggVar;
        List list = uggVar.a;
        if (i >= 0 && i <= uggVar.a()) {
            this.b = list.listIterator(uggVar.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException(cdVQ.uDRC + i + " must be in range [" + new ukv(0, uggVar.a()) + "].");
    }
}
