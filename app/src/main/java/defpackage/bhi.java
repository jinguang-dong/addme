package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bhi extends bhj implements Iterator, ukd {
    public bhi(bhc bhcVar, Iterator it) {
        super(bhcVar, it);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        if (this.c != null) {
            return new bhh(this);
        }
        throw new IllegalStateException();
    }
}
