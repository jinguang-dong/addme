package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfh extends rxl {
    final Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    public sfh(Set set, Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override // defpackage.rxl
    protected final Object a() {
        Set set;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it.next();
        } while (set.contains(next));
        return next;
    }
}
