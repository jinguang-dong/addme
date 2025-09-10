package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gdz implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gdz(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            Collection.EL.stream(((ged) this.b).g.values()).forEach(new geb(this.a, 3));
            return null;
        }
        if (i == 1) {
            Collection.EL.stream(((ged) this.b).f.values()).forEach(new geb(this.a, 1));
            return null;
        }
        Iterator it = ((ozk) this.b).d.values().iterator();
        while (it.hasNext()) {
            ((oyi) it.next()).m(this.a);
        }
        return null;
    }
}
