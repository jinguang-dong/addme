package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ugm extends ugo implements Iterator, ukd {
    public ugm(ugq ugqVar) {
        super(ugqVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        ugq ugqVar = this.a;
        int i = this.b;
        if (i >= ugqVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        ugn ugnVar = new ugn(ugqVar, i);
        b();
        return ugnVar;
    }
}
