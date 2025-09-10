package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovr implements ovq {
    @Override // defpackage.ovq
    public final void a(paq paqVar) {
        paqVar.close();
    }

    @Override // defpackage.ovq
    public final void b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((paq) it.next()).close();
        }
    }
}
