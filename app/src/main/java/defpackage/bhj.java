package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bhj {
    public final bhc a;
    public int b;
    public Map.Entry c;
    public Map.Entry d;
    private final Iterator e;

    public bhj(bhc bhcVar, Iterator it) {
        this.a = bhcVar;
        this.e = it;
        this.b = bhcVar.a();
        a();
    }

    protected final void a() {
        this.c = this.d;
        Iterator it = this.e;
        this.d = ((ben) it).c ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.d != null;
    }

    public final void remove() {
        bhc bhcVar = this.a;
        if (bhcVar.a() != this.b) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.c;
        if (entry == null) {
            throw new IllegalStateException();
        }
        bhcVar.remove(entry.getKey());
        this.c = null;
        this.b = bhcVar.a();
    }
}
