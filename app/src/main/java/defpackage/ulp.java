package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulp implements Iterator, ukd {
    final /* synthetic */ ulq a;
    private int b = -1;
    private int c;
    private int d;
    private ukv e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public ulp(ulq ulqVar) {
        this.a = ulqVar;
        int iP = ukc.p(0, 0, ulqVar.a.length());
        this.c = iP;
        this.d = iP;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    private final void a() {
        Object objA;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        ulq ulqVar = this.a;
        ?? r3 = ulqVar.a;
        if (i <= r3.length() && (objA = ulqVar.b.a(r3, Integer.valueOf(this.d))) != null) {
            uev uevVar = (uev) objA;
            int iIntValue = ((Number) uevVar.a).intValue();
            int iIntValue2 = ((Number) uevVar.b).intValue();
            this.e = ukc.u(this.c, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.c = i2;
            this.d = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.e = new ukv(this.c, ujp.m(r3));
            this.d = -1;
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        ukv ukvVar = this.e;
        ukvVar.getClass();
        this.e = null;
        this.b = -1;
        return ukvVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
