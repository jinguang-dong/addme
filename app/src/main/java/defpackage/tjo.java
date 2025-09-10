package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tjo implements Iterator {
    tjp a;
    tjp b = null;
    int c;
    final /* synthetic */ tjq d;

    public tjo(tjq tjqVar) {
        this.d = tjqVar;
        this.a = tjqVar.e.d;
        this.c = tjqVar.d;
    }

    public final tjp a() {
        tjq tjqVar = this.d;
        tjp tjpVar = this.a;
        if (tjpVar == tjqVar.e) {
            throw new NoSuchElementException();
        }
        if (tjqVar.d != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = tjpVar.d;
        this.b = tjpVar;
        return tjpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        tjp tjpVar = this.b;
        if (tjpVar == null) {
            throw new IllegalStateException();
        }
        tjq tjqVar = this.d;
        tjqVar.e(tjpVar, true);
        this.b = null;
        this.c = tjqVar.d;
    }
}
