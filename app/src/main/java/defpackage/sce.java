package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sce extends sgj {
    final Iterator a;
    Object b = null;
    Iterator c = sdf.a;
    final /* synthetic */ sci d;

    public sce(sci sciVar) {
        this.d = sciVar;
        this.a = sciVar.map.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((sbe) entry.getValue()).listIterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new sbf(obj, this.c.next());
    }
}
