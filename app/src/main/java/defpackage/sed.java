package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface sed extends Collection {
    @Override // java.util.Collection, defpackage.sed
    boolean add(Object obj);

    @Override // java.util.Collection, defpackage.sed
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    int d(Object obj, int i);

    @Override // defpackage.sed
    boolean equals(Object obj);

    Set f();

    int fw(Object obj);

    Set g();

    void h(Object obj, int i);

    @Override // defpackage.sed
    int hashCode();

    boolean i(Object obj, int i);

    @Override // java.util.Collection, java.lang.Iterable, defpackage.sed
    Iterator iterator();

    @Override // java.util.Collection, defpackage.sed
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.sed
    int size();
}
