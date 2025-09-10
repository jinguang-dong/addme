package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rxy extends rxw implements ListIterator {
    final /* synthetic */ rxz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxy(rxz rxzVar) {
        super(rxzVar);
        this.d = rxzVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        rxz rxzVar = this.d;
        boolean zIsEmpty = rxzVar.isEmpty();
        b().add(obj);
        rxzVar.f.b++;
        if (zIsEmpty) {
            rxzVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxy(rxz rxzVar, int i) {
        super(rxzVar, rxzVar.d().listIterator(i));
        this.d = rxzVar;
    }
}
