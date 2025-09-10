package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufk extends ufj implements ListIterator, ukd {
    final /* synthetic */ ufm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufk(ufm ufmVar, int i) {
        super(ufmVar);
        this.c = ufmVar;
        a.aj(i, ufmVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.i();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        ufm ufmVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return ufmVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.i();
    }
}
