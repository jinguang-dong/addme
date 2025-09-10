package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ben implements Iterator, ukd {
    public final bew[] a;
    public int b;
    public boolean c = true;

    public ben(bev bevVar, bew[] bewVarArr) {
        this.a = bewVarArr;
        bew bewVar = bewVarArr[0];
        Object[] objArr = bevVar.b;
        int iA = bevVar.a();
        bewVar.c(objArr, iA + iA);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        bew[] bewVarArr = this.a;
        if (bewVarArr[i].e()) {
            return i;
        }
        if (!bewVarArr[i].f()) {
            return -1;
        }
        bew bewVar = bewVarArr[i];
        bewVar.f();
        Object obj = bewVar.a[bewVar.b];
        obj.getClass();
        bev bevVar = (bev) obj;
        if (i == 6) {
            bew bewVar2 = bewVarArr[7];
            Object[] objArr = bevVar.b;
            bewVar2.c(objArr, objArr.length);
        } else {
            bew bewVar3 = bewVarArr[i + 1];
            Object[] objArr2 = bevVar.b;
            int iA = bevVar.a();
            bewVar3.c(objArr2, iA + iA);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        bew[] bewVarArr = this.a;
        if (bewVarArr[this.b].e()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (bewVarArr[i].f()) {
                    bewVarArr[i].b();
                    iB = b(i);
                } else {
                    iB = -1;
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                bewVarArr[i - 1].b();
            }
            bewVarArr[i].c(bev.a.b, 0);
        }
        this.c = false;
    }

    protected final Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        c();
        Object next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        a.a();
    }
}
