package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zk implements Iterator, ukd {
    public int a = -1;
    final /* synthetic */ Object b;
    private final Iterator c;
    private final /* synthetic */ int d;

    public zk(zi ziVar, int i) {
        this.d = i;
        this.b = ziVar;
        this.c = ujp.K(new zh(ziVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Iterator it = this.c;
        return i != 0 ? it.hasNext() : it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        Iterator it = this.c;
        return i != 0 ? it.next() : it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d != 0) {
            int i = this.a;
            if (i != -1) {
                ((zi) this.b).a.e(i);
                this.a = -1;
                return;
            }
            return;
        }
        int i2 = this.a;
        if (i2 != -1) {
            ((zl) this.b).a.i(i2);
            this.a = -1;
        }
    }

    public zk(zl zlVar, int i) {
        this.d = i;
        this.b = zlVar;
        this.c = ujp.K(new zj(zlVar, this, null));
    }
}
