package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scy extends sac {
    final /* synthetic */ Iterable a;
    final /* synthetic */ rwe b;

    public scy(Iterable iterable, rwe rweVar) {
        this.a = iterable;
        this.b = rweVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new sdd(it, this.b);
    }
}
