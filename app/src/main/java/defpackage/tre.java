package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tre implements Iterator {
    private final ArrayDeque a;
    private tog b;

    public tre(toj tojVar) {
        if (!(tojVar instanceof trf)) {
            this.a = null;
            this.b = (tog) tojVar;
            return;
        }
        trf trfVar = (trf) tojVar;
        ArrayDeque arrayDeque = new ArrayDeque(trfVar.g);
        this.a = arrayDeque;
        arrayDeque.push(trfVar);
        this.b = b(trfVar.e);
    }

    private final tog b(toj tojVar) {
        while (tojVar instanceof trf) {
            trf trfVar = (trf) tojVar;
            this.a.push(trfVar);
            int[] iArr = trf.a;
            tojVar = trfVar.e;
        }
        return (tog) tojVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tog next() {
        tog togVarB;
        tog togVar = this.b;
        if (togVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            togVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            trf trfVar = (trf) arrayDeque.pop();
            int[] iArr = trf.a;
            togVarB = b(trfVar.f);
        } while (togVarB.t());
        this.b = togVarB;
        return togVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
