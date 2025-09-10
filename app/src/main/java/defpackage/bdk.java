package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdk extends byi {
    public bdf[] a;
    public int b;
    public int[] c;
    public int d;
    public Object[] e;
    public int f;

    public bdk() {
        super((char[]) null);
        this.a = new bdf[16];
        this.c = new int[16];
        this.e = new Object[16];
    }

    private static final int bQ(int i, int i2) {
        return ukc.n(i + ukc.o(i, 1024), i2);
    }

    public final void g() {
        this.b = 0;
        this.d = 0;
        rnt.af(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void h(bdf bdfVar) {
        int i = this.b;
        bdf[] bdfVarArr = this.a;
        if (i == bdfVarArr.length) {
            bdf[] bdfVarArr2 = new bdf[ukc.o(i, 1024) + i];
            System.arraycopy(bdfVarArr, 0, bdfVarArr2, 0, i);
            this.a = bdfVarArr2;
        }
        int i2 = this.d;
        int i3 = bdfVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[bQ(length, i4)];
            rnt.aw(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = bdfVar.c;
        int i7 = i5 + i6;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            Object[] objArr2 = new Object[bQ(length2, i7)];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        bdf[] bdfVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        bdfVarArr3[i8] = bdfVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final void k(axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        if (j()) {
            bdi bdiVar = new bdi(this);
            while (true) {
                bdf bdfVarB = bdiVar.b();
                axq axqVarB = bdfVarB.b(bdiVar);
                axr axrVar2 = axrVar;
                baz bazVar2 = bazVar;
                bfn bfnVar2 = bfnVar;
                bdg bdgVar2 = bdgVar;
                try {
                    bdfVarB.a(bdiVar, axrVar2, bazVar2, bfnVar2, bdgVar2);
                    int i = bdiVar.a;
                    bdk bdkVar = bdiVar.d;
                    if (i < bdkVar.b) {
                        bdf bdfVarB2 = bdiVar.b();
                        bdiVar.b += bdfVarB2.b;
                        bdiVar.c += bdfVarB2.c;
                        int i2 = bdiVar.a + 1;
                        bdiVar.a = i2;
                        if (i2 >= bdkVar.b) {
                            break;
                        }
                        axrVar = axrVar2;
                        bazVar = bazVar2;
                        bfnVar = bfnVar2;
                        bdgVar = bdgVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        g();
    }
}
