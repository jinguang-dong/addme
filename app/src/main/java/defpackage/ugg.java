package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugg extends ufm {
    public final List a;

    public ugg(List list) {
        this.a = list;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ufm, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= ske.bk(this)) {
            return this.a.get(ske.bk(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new ukv(0, ske.bk(this)) + "].");
    }

    @Override // defpackage.ufm, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ugf(this, 0);
    }

    @Override // defpackage.ufm, java.util.List
    public final ListIterator listIterator() {
        return new ugf(this, 0);
    }

    @Override // defpackage.ufm, java.util.List
    public final ListIterator listIterator(int i) {
        return new ugf(this, i);
    }
}
