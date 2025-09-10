package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdd extends rxl {
    final /* synthetic */ Iterator a;
    final /* synthetic */ rwe b;

    public sdd(Iterator it, rwe rweVar) {
        this.a = it;
        this.b = rweVar;
    }

    @Override // defpackage.rxl
    protected final Object a() {
        rwe rweVar;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            rweVar = this.b;
            next = it.next();
        } while (!rweVar.a(next));
        return next;
    }
}
