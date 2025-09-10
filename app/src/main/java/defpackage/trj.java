package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trj implements Iterator {
    final /* synthetic */ trl a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public trj(trl trlVar) {
        this.a = trlVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        trl trlVar = this.a;
        if (i >= trlVar.b) {
            return !trlVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        trl trlVar = this.a;
        return i < trlVar.b ? (tri) trlVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        trl trlVar = this.a;
        trlVar.e();
        int i = this.b;
        if (i >= trlVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            trlVar.c(i);
        }
    }
}
