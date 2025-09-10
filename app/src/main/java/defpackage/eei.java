package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eei implements Iterator {
    public final eeu a;
    public String b = null;
    private Iterator c;

    public eei(eek eekVar) {
        this.c = null;
        eeu eeuVar = new eeu();
        this.a = eeuVar;
        een eenVar = eekVar.a;
        if (eeuVar.h(256)) {
            this.c = new eeh(this, eenVar);
        } else {
            this.c = new eeg(this, eenVar, null, 1);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
