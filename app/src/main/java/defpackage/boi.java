package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boi implements Iterator, ukd {
    public final Iterator a;
    private final /* synthetic */ int b;

    public boi(beo beoVar, int i) {
        this.b = i;
        bew[] bewVarArr = new bew[8];
        for (int i2 = 0; i2 < 8; i2++) {
            bewVarArr[i2] = new bez(this);
        }
        this.a = new bep(beoVar, bewVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != 0 ? ((ben) this.a).c : this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.b != 0 ? (Map.Entry) ((ben) this.a).next() : (byi) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b != 0) {
            ((ben) this.a).remove();
        } else {
            a.a();
        }
    }

    public boi(boj bojVar, int i) {
        this.b = i;
        this.a = bojVar.j.iterator();
    }
}
