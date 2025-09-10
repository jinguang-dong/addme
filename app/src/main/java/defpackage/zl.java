package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zl extends zy implements Set, ukh {
    public final zw a;

    public zl(zw zwVar) {
        super(zwVar);
        this.a = zwVar;
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.j(obj);
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.k(collection);
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zk(this, 0);
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        zw zwVar = this.a;
        int i = zwVar.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zwVar.e(it.next());
        }
        return i != zwVar.d;
    }

    @Override // defpackage.zy, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        zw zwVar = this.a;
        Object[] objArr = zwVar.b;
        int i2 = zwVar.d;
        long[] jArr = zwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!ske.bR(collection, objArr[i6])) {
                                zwVar.i(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != zwVar.d;
    }
}
