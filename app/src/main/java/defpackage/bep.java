package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bep extends ben implements Iterator, ukd {
    public final beo d;
    public int e;
    private Object f;
    private boolean g;

    public bep(beo beoVar, bew[] bewVarArr) {
        super(beoVar.a, bewVarArr);
        this.d = beoVar;
        this.e = beoVar.c;
    }

    public final void b(int i, bev bevVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            bew[] bewVarArr = this.a;
            bew bewVar = bewVarArr[i2];
            Object[] objArr = bevVar.b;
            bewVar.d(objArr, objArr.length, 0);
            while (!a.ao(bewVarArr[i2].a(), obj)) {
                bewVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int iAd = 1 << byi.ad(i, i3);
        if (bevVar.m(iAd)) {
            int iB = bevVar.b(iAd);
            bew bewVar2 = this.a[i2];
            Object[] objArr2 = bevVar.b;
            int iA = bevVar.a();
            bewVar2.d(objArr2, iA + iA, iB);
            this.b = i2;
            return;
        }
        int iC = bevVar.c(iAd);
        bev bevVarI = bevVar.i(iC);
        bew bewVar3 = this.a[i2];
        Object[] objArr3 = bevVar.b;
        int iA2 = bevVar.a();
        bewVar3.d(objArr3, iA2 + iA2, iC);
        b(i, bevVarI, obj, i2 + 1);
    }

    @Override // defpackage.ben, java.util.Iterator
    public final Object next() {
        if (this.d.c != this.e) {
            throw new ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return super.next();
    }

    @Override // defpackage.ben, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.c) {
            Object objA = a();
            beo beoVar = this.d;
            Object obj = this.f;
            ukc.g(beoVar);
            beoVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, beoVar.a, objA, 0);
        } else {
            beo beoVar2 = this.d;
            Object obj2 = this.f;
            ukc.g(beoVar2);
            beoVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.c;
    }
}
