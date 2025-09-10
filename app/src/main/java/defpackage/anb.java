package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anb {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final aoe e;
    public final long f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public boolean k;
    public int l = Integer.MIN_VALUE;
    public int m;
    public final int[] n;
    private final List o;
    private final cib p;
    private final int q;
    private final int r;
    private final long s;
    private int t;
    private final bic u;
    private final bid v;

    public anb(int i, List list, boolean z, bic bicVar, bid bidVar, cib cibVar, int i2, int i3, int i4, long j, Object obj, aoe aoeVar, long j2) {
        this.a = i;
        this.o = list;
        this.b = z;
        this.u = bicVar;
        this.v = bidVar;
        this.p = cibVar;
        this.q = i2;
        this.c = i3;
        this.r = i4;
        this.s = j;
        this.d = obj;
        this.e = aoeVar;
        this.f = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            bte bteVar = (bte) list.get(i6);
            boolean z2 = this.b;
            i5 += z2 ? bteVar.b : bteVar.a;
            iMax = Math.max(iMax, !z2 ? bteVar.b : bteVar.a);
        }
        this.h = i5;
        this.i = ukc.n(i5 + this.r, 0);
        this.j = iMax;
        int size2 = this.o.size();
        this.n = new int[size2 + size2];
    }

    private final int g(long j) {
        return this.b ? chy.b(j) : chy.a(j);
    }

    public final int a() {
        return this.o.size();
    }

    public final long b(int i) {
        return (r4[r5 + 1] & 4294967295L) | (this.n[i + i] << 32);
    }

    public final Object c(int i) {
        return ((bte) this.o.get(i)).g();
    }

    public final void d(btd btdVar, boolean z) {
        int i;
        if (this.l == Integer.MIN_VALUE) {
            akg.b("position() should be called first");
        }
        int iA = a();
        int i2 = 0;
        while (i2 < iA) {
            bte bteVar = (bte) this.o.get(i2);
            int i3 = this.t;
            boolean z2 = this.b;
            int i4 = i3 - (z2 ? bteVar.b : bteVar.a);
            int i5 = this.m;
            long jB = b(i2);
            aoa aoaVarB = this.e.b(this.d, i2);
            bmz bmzVar = null;
            if (aoaVarB != null) {
                if (z) {
                    aoaVarB.i = jB;
                    i = i2;
                } else {
                    long j = aoaVarB.i;
                    i = i2;
                    if (true != a.q(j, 9223372034707292159L)) {
                        jB = j;
                    }
                    long jD = chy.d(jB, ((chy) aoaVarB.h.a()).a);
                    if (((g(jB) <= i4 && g(jD) <= i4) || (g(jB) >= i5 && g(jD) >= i5)) && aoaVarB.e()) {
                        ukc.C(aoaVarB.a, null, 0, new vf(aoaVarB, (uhb) null, 14, (byte[]) null), 3);
                    }
                    jB = jD;
                }
                bmzVar = aoaVarB.e;
            } else {
                i = i2;
            }
            long jD2 = chy.d(jB, this.s);
            if (!z && aoaVarB != null) {
                aoaVarB.d = jD2;
            }
            if (z2) {
                if (bmzVar != null) {
                    btdVar.x(bteVar, jD2, bmzVar);
                } else {
                    btd.y(btdVar, bteVar, jD2, null, 6);
                }
            } else if (bmzVar == null) {
                uiq uiqVar = btf.a;
                if (btdVar.n() == cib.a || btdVar.l() == 0) {
                    btdVar.p(bteVar);
                    bteVar.df(chy.d(jD2, bteVar.e), uiqVar);
                } else {
                    int iL = btdVar.l() - bteVar.a;
                    int iA2 = chy.a(jD2);
                    btdVar.p(bteVar);
                    bteVar.df(chy.d((chy.b(jD2) & 4294967295L) | ((iL - iA2) << 32), bteVar.e), uiqVar);
                }
            } else if (btdVar.n() == cib.a || btdVar.l() == 0) {
                btdVar.p(bteVar);
                bteVar.w(chy.d(jD2, bteVar.e), bmzVar);
            } else {
                int iL2 = btdVar.l() - bteVar.a;
                int iA3 = chy.a(jD2);
                btdVar.p(bteVar);
                bteVar.w(chy.d((chy.b(jD2) & 4294967295L) | ((iL2 - iA3) << 32), bteVar.e), bmzVar);
            }
            i2 = i + 1;
        }
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        this.g = i;
        boolean z = this.b;
        this.l = true != z ? i2 : i3;
        List list = this.o;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            bte bteVar = (bte) list.get(i5);
            int i6 = i5 + i5;
            if (z) {
                int[] iArr = this.n;
                bic bicVar = this.u;
                if (bicVar == null) {
                    akg.a("null horizontalAlignment when isVertical == true");
                    throw new uer();
                }
                iArr[i6] = bicVar.a(bteVar.a, i2, this.p);
                iArr[i6 + 1] = i;
                i4 = bteVar.b;
            } else {
                int i7 = i6 + 1;
                int[] iArr2 = this.n;
                iArr2[i6] = i;
                bid bidVar = this.v;
                if (bidVar == null) {
                    akg.a("null verticalAlignment when isVertical == false");
                    throw new uer();
                }
                iArr2[i7] = bidVar.a(bteVar.b, i3);
                i4 = bteVar.a;
            }
            i += i4;
        }
        this.t = -this.q;
        this.m = this.l + this.c;
    }

    public final void f() {
        this.k = true;
    }
}
