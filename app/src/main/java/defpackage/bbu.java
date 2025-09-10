package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu {
    public bbt a;
    public boolean b;
    public int d;
    public int g;
    private final ayg i;
    private int j;
    public final lwm h = new lwm(null);
    public boolean c = true;
    private final ArrayList k = new ArrayList();
    private int l = -1;
    public int e = -1;
    public int f = -1;

    public bbu(ayg aygVar, bbt bbtVar) {
        this.i = aygVar;
        this.a = bbtVar;
    }

    public final bav a() {
        return this.i.o;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.h();
            this.b = false;
        }
    }

    public final void c(bbt bbtVar, bfi bfiVar) {
        bbt bbtVar2 = this.a;
        if (bbtVar.j()) {
            bdk bdkVar = bbtVar2.a;
            bdkVar.h(bby.a);
            bdj.b(bdkVar, 0, bbtVar, 1, bfiVar);
        }
    }

    public final void d(Object obj) {
        i();
        this.k.add(obj);
    }

    public final void e(int i) {
        this.d += i - a().f;
    }

    public final void f() {
        i();
        ArrayList arrayList = this.k;
        if (bbn.b(arrayList)) {
            bbn.a(arrayList);
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            bdk bdkVar = this.a.a;
            bdkVar.h(bdd.a);
            bdkVar.c[bdkVar.d - bdkVar.a[bdkVar.b - 1].b] = i;
            this.j = 0;
        }
        ArrayList arrayList = this.k;
        if (bbn.b(arrayList)) {
            bbt bbtVar = this.a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            if (size != 0) {
                bdk bdkVar2 = bbtVar.a;
                bdkVar2.h(bcd.a);
                bdj.a(bdkVar2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.g;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                bdk bdkVar = this.a.a;
                bdkVar.h(bct.a);
                int i3 = bdkVar.d - bdkVar.a[bdkVar.b - 1].b;
                int[] iArr = bdkVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.l = -1;
            } else {
                int i4 = this.f;
                int i5 = this.e;
                g();
                bdk bdkVar2 = this.a.a;
                bdkVar2.h(bco.a);
                int i6 = bdkVar2.d - bdkVar2.a[bdkVar2.b - 1].b;
                int[] iArr2 = bdkVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.e = -1;
                this.f = -1;
            }
            this.g = 0;
        }
    }

    public final void j(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.d;
        if (i2 < 0) {
            ayi.i("Tried to seek backward");
        }
        if (i2 > 0) {
            bdk bdkVar = this.a.a;
            bdkVar.h(bbw.a);
            bdkVar.c[bdkVar.d - bdkVar.a[bdkVar.b - 1].b] = i2;
            this.d = i;
        }
    }

    public final void k() {
        if (a().c > 0) {
            bav bavVarA = a();
            int i = bavVarA.h;
            lwm lwmVar = this.h;
            if (lwmVar.b(-2) != i) {
                if (!this.b && this.c) {
                    j(false);
                    this.a.a.h(bcj.a);
                    this.b = true;
                }
                if (i > 0) {
                    axq axqVarG = bavVarA.g(i);
                    lwmVar.e(i);
                    j(false);
                    bdk bdkVar = this.a.a;
                    bdkVar.h(bci.a);
                    bdj.a(bdkVar, 0, axqVarG);
                    this.b = true;
                }
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                ayi.i(a.bv(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.g += i2;
                return;
            }
            i();
            this.l = i;
            this.g = i2;
        }
    }

    public final void m() {
        this.a.a.h(bcw.a);
    }
}
