package defpackage;

import j$.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfb extends ufs implements Set, Collection, bdv, ukd {
    public static final bfb a;
    public final Object b;
    public final Object c;
    public final bem d;

    static {
        bfe bfeVar = bfe.a;
        a = new bfb(bfeVar, bfeVar, bem.a);
    }

    public bfb(Object obj, Object obj2, bem bemVar) {
        this.b = obj;
        this.c = obj2;
        this.d = bemVar;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.d.b();
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.ufs, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new bfc(this.b, this.d);
    }
}
