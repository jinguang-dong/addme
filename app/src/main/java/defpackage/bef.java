package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bef extends bdz implements ListIterator, ukd {
    private final bed c;
    private int d;
    private bei e;
    private int f;

    public bef(bed bedVar, int i) {
        super(i, bedVar.d);
        this.c = bedVar;
        this.d = bedVar.a();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.a()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        bed bedVar = this.c;
        this.b = bedVar.d;
        this.d = bedVar.a();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private final void f() {
        bed bedVar = this.c;
        Object[] objArr = bedVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int iD = bdq.d(bedVar.d);
        int iO = ukc.o(this.a, iD);
        int i = bedVar.a / 5;
        bei beiVar = this.e;
        int i2 = i + 1;
        if (beiVar == null) {
            this.e = new bei(objArr, iO, iD, i2);
            return;
        }
        beiVar.a = iO;
        beiVar.b = iD;
        beiVar.c = i2;
        if (beiVar.d.length < i2) {
            beiVar.d = new Object[i2];
        }
        beiVar.d[0] = objArr;
        ?? r0 = iO == iD ? 1 : 0;
        beiVar.e = r0;
        beiVar.c(iO - r0, 1);
    }

    @Override // defpackage.bdz, java.util.ListIterator
    public final void add(Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.bdz, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        bei beiVar = this.e;
        if (beiVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (beiVar.hasNext()) {
            this.a = i2;
            return beiVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - beiVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        bei beiVar = this.e;
        if (beiVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = beiVar.b;
        if (i <= i3) {
            this.a = i2;
            return beiVar.previous();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i2 - i3];
    }

    @Override // defpackage.bdz, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.bdz, java.util.ListIterator
    public final void set(Object obj) {
        c();
        d();
        bed bedVar = this.c;
        bedVar.set(this.f, obj);
        this.d = bedVar.a();
        f();
    }
}
