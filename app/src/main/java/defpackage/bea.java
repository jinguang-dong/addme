package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bea extends ufm implements List, bdw {
    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bdw
    public bdw d(Collection collection) {
        bed bedVarJ = j();
        bedVarJ.addAll(collection);
        return bedVarJ.c();
    }

    @Override // defpackage.bdw
    public final bdw e(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // defpackage.bdw
    public final bdw f(Collection collection) {
        return g(new asj(collection, 7));
    }

    @Override // defpackage.ufm, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.ufm, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.ufm, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new bdt(this, i, i2);
    }
}
