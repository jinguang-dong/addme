package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sca extends sgj {
    final sgj a;
    final /* synthetic */ scd b;

    public sca(scd scdVar) {
        this.b = scdVar;
        this.a = scdVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
