package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.av;
import defpackage.cpt;
import defpackage.e;
import defpackage.ejs;
import defpackage.jq;
import defpackage.kf;
import defpackage.kp;
import defpackage.kq;
import defpackage.kr;
import defpackage.kv;
import defpackage.lb;
import defpackage.lc;
import defpackage.ld;
import defpackage.lp;
import defpackage.lq;
import defpackage.ls;
import defpackage.lt;
import defpackage.lu;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends kq implements lb {
    private int[] J;
    lu[] a;
    public kf b;
    kf c;
    private int i;
    private int j;
    private int k;
    private final jq l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private lt q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    ls h = new ls();
    private int n = 2;
    private final Rect G = new Rect();
    private final lp H = new lp(this);
    private boolean I = true;
    private final Runnable K = new av(this, 20, null);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        kp kpVarAx = ax(context, attributeSet, i, i2);
        int i3 = kpVarAx.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        P(null);
        if (i3 != this.j) {
            this.j = i3;
            kf kfVar = this.b;
            this.b = this.c;
            this.c = kfVar;
            aT();
        }
        int i4 = kpVarAx.b;
        P(null);
        if (i4 != this.i) {
            this.h.a();
            aT();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new lu[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new lu(this, i5);
            }
            aT();
        }
        H(kpVarAx.c);
        this.l = new jq();
        this.b = kf.p(this, this.j);
        this.c = kf.p(this, 1 - this.j);
    }

    private final int N(int i) {
        if (an() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int Q(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        return e.h(ldVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    private final int R(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        return e.i(ldVar, this.b, r(!this.I), l(!this.I), this, this.I, this.e);
    }

    private final int V(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        return e.j(ldVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    private final int W(kv kvVar, jq jqVar, ld ldVar) {
        lu luVar;
        ?? r6;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.m.set(0, this.i, true);
        jq jqVar2 = this.l;
        int i6 = jqVar2.i ? jqVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : jqVar.e == 1 ? jqVar.g + jqVar.b : jqVar.f - jqVar.b;
        int i7 = jqVar.e;
        for (int i8 = 0; i8 < this.i; i8++) {
            if (!this.a[i8].a.isEmpty()) {
                bD(this.a[i8], i7, i6);
            }
        }
        int iF2 = this.e ? this.b.f() : this.b.j();
        boolean z = false;
        while (jqVar.a(ldVar) && (jqVar2.i || !this.m.isEmpty())) {
            View viewB = kvVar.b(jqVar.c);
            jqVar.c += jqVar.d;
            lq lqVar = (lq) viewB.getLayoutParams();
            int iA = lqVar.a();
            int[] iArr = this.h.a;
            int i9 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            int i10 = i9 == -1 ? i5 : i4;
            if (i10 != 0) {
                boolean z2 = lqVar.b;
                if (bE(jqVar.e)) {
                    i3 = this.i - 1;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.i;
                    i3 = i4;
                }
                lu luVar2 = null;
                if (jqVar.e == i5) {
                    int iJ2 = this.b.j();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        lu luVar3 = this.a[i3];
                        int iD = luVar3.d(iJ2);
                        int i12 = iD < i11 ? iD : i11;
                        if (iD < i11) {
                            luVar2 = luVar3;
                        }
                        i3 += i;
                        i11 = i12;
                    }
                } else {
                    int iF3 = this.b.f();
                    int i13 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        lu luVar4 = this.a[i3];
                        int iF4 = luVar4.f(iF3);
                        int i14 = iF4 > i13 ? iF4 : i13;
                        if (iF4 > i13) {
                            luVar2 = luVar4;
                        }
                        i3 += i;
                        i13 = i14;
                    }
                }
                luVar = luVar2;
                ls lsVar = this.h;
                lsVar.b(iA);
                lsVar.a[iA] = luVar.e;
            } else {
                luVar = this.a[i9];
            }
            lqVar.a = luVar;
            if (jqVar.e == 1) {
                aD(viewB);
                r6 = 0;
            } else {
                r6 = 0;
                aE(viewB, 0);
            }
            boolean z3 = lqVar.b;
            if (this.j == 1) {
                bF(viewB, ao(this.k, this.A, r6, lqVar.width, r6), ao(this.D, this.B, aw() + at(), lqVar.height, true));
            } else {
                bF(viewB, ao(this.C, this.A, au() + av(), lqVar.width, true), ao(this.k, this.B, 0, lqVar.height, false));
            }
            if (jqVar.e == 1) {
                boolean z4 = lqVar.b;
                iB = luVar.d(iF2);
                iF = this.b.b(viewB) + iB;
                if (i10 != 0) {
                    boolean z5 = lqVar.b;
                }
            } else {
                boolean z6 = lqVar.b;
                iF = luVar.f(iF2);
                iB = iF - this.b.b(viewB);
                if (i10 != 0) {
                    boolean z7 = lqVar.b;
                }
            }
            boolean z8 = lqVar.b;
            if (jqVar.e == 1) {
                lu luVar5 = lqVar.a;
                lq lqVarN = lu.n(viewB);
                lqVarN.a = luVar5;
                ArrayList arrayList = luVar5.a;
                arrayList.add(viewB);
                luVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    luVar5.b = Integer.MIN_VALUE;
                }
                if (lqVarN.c() || lqVarN.b()) {
                    luVar5.d += luVar5.f.b.b(viewB);
                }
            } else {
                lu luVar6 = lqVar.a;
                lq lqVarN2 = lu.n(viewB);
                lqVarN2.a = luVar6;
                ArrayList arrayList2 = luVar6.a;
                arrayList2.add(0, viewB);
                luVar6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    luVar6.c = Integer.MIN_VALUE;
                }
                if (lqVarN2.c() || lqVarN2.b()) {
                    luVar6.d += luVar6.f.b.b(viewB);
                }
            }
            if (K() && this.j == 1) {
                boolean z9 = lqVar.b;
                iB2 = this.c.f() - (((this.i - 1) - luVar.e) * this.k);
                iJ = iB2 - this.c.b(viewB);
            } else {
                boolean z10 = lqVar.b;
                iJ = this.c.j() + (luVar.e * this.k);
                iB2 = this.c.b(viewB) + iJ;
            }
            if (this.j == 1) {
                bn(viewB, iJ, iB, iB2, iF);
            } else {
                bn(viewB, iB, iJ, iF, iB2);
            }
            boolean z11 = lqVar.b;
            bD(luVar, jqVar2.e, i6);
            bx(kvVar, jqVar2);
            if (jqVar2.h && viewB.hasFocusable()) {
                boolean z12 = lqVar.b;
                this.m.set(luVar.e, false);
                i4 = 0;
                i5 = 1;
                z = true;
            } else {
                i5 = 1;
                z = true;
                i4 = 0;
            }
        }
        if (!z) {
            bx(kvVar, jqVar2);
        }
        int iJ3 = jqVar2.e == -1 ? this.b.j() - ac(this.b.j()) : aa(this.b.f()) - this.b.f();
        if (iJ3 > 0) {
            return Math.min(jqVar.b, iJ3);
        }
        return 0;
    }

    private final int aa(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int ac(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ag(kv kvVar, ld ldVar, boolean z) {
        int iF;
        int i;
        int iAa = aa(Integer.MIN_VALUE);
        if (iAa != Integer.MIN_VALUE && (iF = this.b.f() - iAa) > 0) {
            int i2 = -k(-iF, kvVar, ldVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ah(kv kvVar, ld ldVar, boolean z) {
        int iJ;
        int iAc = ac(Integer.MAX_VALUE);
        if (iAc != Integer.MAX_VALUE && (iJ = iAc - this.b.j()) > 0) {
            int iK = iJ - k(iJ, kvVar, ldVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ai(int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ai(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ak(defpackage.kv r12, defpackage.ld r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ak(kv, ld, boolean):void");
    }

    private final void bA() {
        this.e = (this.j == 1 || !K()) ? this.d : !this.d;
    }

    private final void bB(int i) {
        jq jqVar = this.l;
        jqVar.e = i;
        jqVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bC(int i, ld ldVar) {
        int iK;
        int iK2;
        int i2;
        jq jqVar = this.l;
        boolean z = false;
        jqVar.b = 0;
        jqVar.c = i;
        if (!bb() || (i2 = ldVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.e == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.h) {
            jqVar.g = this.b.e() + iK;
            jqVar.f = -iK2;
        } else {
            jqVar.f = this.b.j() - iK2;
            jqVar.g = this.b.f() + iK;
        }
        jqVar.h = false;
        jqVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        jqVar.i = z;
    }

    private final void bD(lu luVar, int i, int i2) {
        int i3 = luVar.d;
        if (i == -1) {
            if (luVar.e() + i3 <= i2) {
                this.m.set(luVar.e, false);
            }
        } else if (luVar.c() - i3 >= i2) {
            this.m.set(luVar.e, false);
        }
    }

    private final boolean bE(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.e;
        }
        return (z == this.e) == K();
    }

    private final void bF(View view, int i, int i2) {
        Rect rect = this.G;
        aF(view, rect);
        lq lqVar = (lq) view.getLayoutParams();
        int iBG = bG(i, lqVar.leftMargin + rect.left, lqVar.rightMargin + rect.right);
        int iBG2 = bG(i2, lqVar.topMargin + rect.top, lqVar.bottomMargin + rect.bottom);
        if (bd(view, iBG, iBG2, lqVar)) {
            view.measure(iBG, iBG2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int bG(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bG(int, int, int):int");
    }

    private final void bx(kv kvVar, jq jqVar) {
        if (!jqVar.a || jqVar.i) {
            return;
        }
        if (jqVar.b == 0) {
            if (jqVar.e == -1) {
                by(kvVar, jqVar.g);
                return;
            } else {
                bz(kvVar, jqVar.f);
                return;
            }
        }
        int i = 1;
        if (jqVar.e == -1) {
            int i2 = jqVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            by(kvVar, i3 < 0 ? jqVar.g : jqVar.g - Math.min(i3, jqVar.b));
            return;
        }
        int i4 = jqVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - jqVar.g;
        bz(kvVar, i5 < 0 ? jqVar.f : Math.min(i5, jqVar.b) + jqVar.f);
    }

    private final void by(kv kvVar, int i) {
        int iAn = an();
        while (true) {
            iAn--;
            if (iAn < 0) {
                return;
            }
            View viewAz = az(iAn);
            if (this.b.d(viewAz) < i || this.b.m(viewAz) < i) {
                return;
            }
            lq lqVar = (lq) viewAz.getLayoutParams();
            boolean z = lqVar.b;
            if (lqVar.a.a.size() == 1) {
                return;
            }
            lu luVar = lqVar.a;
            ArrayList arrayList = luVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            lq lqVarN = lu.n(view);
            lqVarN.a = null;
            if (lqVarN.c() || lqVarN.b()) {
                luVar.d -= luVar.f.b.b(view);
            }
            if (size == 1) {
                luVar.b = Integer.MIN_VALUE;
            }
            luVar.c = Integer.MIN_VALUE;
            aQ(viewAz, kvVar);
        }
    }

    private final void bz(kv kvVar, int i) {
        while (an() > 0) {
            View viewAz = az(0);
            if (this.b.a(viewAz) > i || this.b.l(viewAz) > i) {
                return;
            }
            lq lqVar = (lq) viewAz.getLayoutParams();
            boolean z = lqVar.b;
            if (lqVar.a.a.size() == 1) {
                return;
            }
            lu luVar = lqVar.a;
            ArrayList arrayList = luVar.a;
            View view = (View) arrayList.remove(0);
            lq lqVarN = lu.n(view);
            lqVarN.a = null;
            if (arrayList.size() == 0) {
                luVar.c = Integer.MIN_VALUE;
            }
            if (lqVarN.c() || lqVarN.b()) {
                luVar.d -= luVar.f.b.b(view);
            }
            luVar.b = Integer.MIN_VALUE;
            aQ(viewAz, kvVar);
        }
    }

    @Override // defpackage.kq
    public final int A(ld ldVar) {
        return Q(ldVar);
    }

    @Override // defpackage.kq
    public final int B(ld ldVar) {
        return R(ldVar);
    }

    @Override // defpackage.kq
    public final int C(ld ldVar) {
        return V(ldVar);
    }

    @Override // defpackage.kq
    public final int D(ld ldVar) {
        return Q(ldVar);
    }

    @Override // defpackage.kq
    public final int E(ld ldVar) {
        return R(ldVar);
    }

    @Override // defpackage.kq
    public final int F(ld ldVar) {
        return V(ldVar);
    }

    final void G(int i, ld ldVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        jq jqVar = this.l;
        jqVar.a = true;
        bC(iC, ldVar);
        bB(i2);
        jqVar.c = iC + jqVar.d;
        jqVar.b = Math.abs(i);
    }

    public final void H(boolean z) {
        P(null);
        lt ltVar = this.q;
        if (ltVar != null && ltVar.h != z) {
            ltVar.h = z;
        }
        this.d = z;
        aT();
    }

    final void I(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean J() {
        int iC;
        if (an() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || v() == null) {
            return false;
        }
        this.h.a();
        this.u = true;
        aT();
        return true;
    }

    final boolean K() {
        return aq() == 1;
    }

    @Override // defpackage.lb
    public final PointF L(int i) {
        int iN = N(i);
        PointF pointF = new PointF();
        if (iN == 0) {
            return null;
        }
        float f = iN;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    @Override // defpackage.kq
    public final Parcelable M() {
        int iF;
        int iJ;
        int[] iArr;
        lt ltVar = this.q;
        if (ltVar != null) {
            return new lt(ltVar);
        }
        lt ltVar2 = new lt();
        ltVar2.h = this.d;
        ltVar2.i = this.o;
        ltVar2.j = this.p;
        ls lsVar = this.h;
        if (lsVar == null || (iArr = lsVar.a) == null) {
            ltVar2.e = 0;
        } else {
            ltVar2.f = iArr;
            ltVar2.e = ltVar2.f.length;
            ltVar2.g = lsVar.b;
        }
        if (an() <= 0) {
            ltVar2.a = -1;
            ltVar2.b = -1;
            ltVar2.c = 0;
            return ltVar2;
        }
        ltVar2.a = this.o ? i() : c();
        View viewL = this.e ? l(true) : r(true);
        ltVar2.b = viewL != null ? bi(viewL) : -1;
        int i = this.i;
        ltVar2.c = i;
        ltVar2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            if (this.o) {
                iF = this.a[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = this.a[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            ltVar2.d[i2] = iF;
        }
        return ltVar2;
    }

    @Override // defpackage.kq
    public final void P(String str) {
        if (this.q == null) {
            super.P(str);
        }
    }

    @Override // defpackage.kq
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (an() > 0) {
            View viewR = r(false);
            View viewL = l(false);
            if (viewR == null || viewL == null) {
                return;
            }
            int iBi = bi(viewR);
            int iBi2 = bi(viewL);
            if (iBi < iBi2) {
                accessibilityEvent.setFromIndex(iBi);
                accessibilityEvent.setToIndex(iBi2);
            } else {
                accessibilityEvent.setFromIndex(iBi2);
                accessibilityEvent.setToIndex(iBi);
            }
        }
    }

    @Override // defpackage.kq
    public final void T(Parcelable parcelable) {
        if (parcelable instanceof lt) {
            lt ltVar = (lt) parcelable;
            this.q = ltVar;
            if (this.f != -1) {
                ltVar.a();
                this.q.b();
            }
            aT();
        }
    }

    @Override // defpackage.kq
    public final void U(int i) {
        lt ltVar = this.q;
        if (ltVar != null && ltVar.a != i) {
            ltVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aT();
    }

    @Override // defpackage.kq
    public final boolean X() {
        return this.j == 0;
    }

    @Override // defpackage.kq
    public final boolean Y() {
        return this.j == 1;
    }

    @Override // defpackage.kq
    public final boolean Z() {
        return this.n != 0;
    }

    @Override // defpackage.kq
    public final int a(kv kvVar, ld ldVar) {
        if (this.j == 1) {
            return Math.min(this.i, ldVar.a());
        }
        return -1;
    }

    @Override // defpackage.kq
    public final void aJ(int i) {
        super.aJ(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.kq
    public final void aK(int i) {
        super.aK(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.kq
    public final void aN(int i) {
        if (i == 0) {
            J();
        }
    }

    @Override // defpackage.kq
    public final boolean ab() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(int r5, int r6, defpackage.ld r7, defpackage.jm r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.an()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.G(r5, r7)
            int[] r5 = r4.J
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.J = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            jq r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f
            lu[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            lu[] r2 = r4.a
            r2 = r2[r5]
            int r3 = r1.g
            int r2 = r2.d(r3)
            int r1 = r1.g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.J
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            jq r5 = r4.l
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.c
            int[] r2 = r4.J
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ae(int, int, ld, jm):void");
    }

    @Override // defpackage.kq
    public final void aj(RecyclerView recyclerView) {
        bq(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.kq
    public final void al(RecyclerView recyclerView, int i) {
        lc lcVar = new lc(recyclerView.getContext());
        lcVar.b = i;
        aZ(lcVar);
    }

    @Override // defpackage.kq
    public final int b(kv kvVar, ld ldVar) {
        if (this.j == 0) {
            return Math.min(this.i, ldVar.a());
        }
        return -1;
    }

    @Override // defpackage.kq
    public final void bo() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (an() == 0) {
            return 0;
        }
        return bi(az(0));
    }

    @Override // defpackage.kq
    public final int d(int i, kv kvVar, ld ldVar) {
        return k(i, kvVar, ldVar);
    }

    @Override // defpackage.kq
    public final int e(int i, kv kvVar, ld ldVar) {
        return k(i, kvVar, ldVar);
    }

    @Override // defpackage.kq
    public final kr f() {
        return this.j == 0 ? new lq(-2, -1) : new lq(-1, -2);
    }

    @Override // defpackage.kq
    public final kr g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new lq((ViewGroup.MarginLayoutParams) layoutParams) : new lq(layoutParams);
    }

    @Override // defpackage.kq
    public final kr h(Context context, AttributeSet attributeSet) {
        return new lq(context, attributeSet);
    }

    final int i() {
        int iAn = an();
        if (iAn == 0) {
            return 0;
        }
        return bi(az(iAn - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r9, int r10, defpackage.kv r11, defpackage.ld r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.j(android.view.View, int, kv, ld):android.view.View");
    }

    final int k(int i, kv kvVar, ld ldVar) {
        if (an() == 0 || i == 0) {
            return 0;
        }
        G(i, ldVar);
        jq jqVar = this.l;
        int iW = W(kvVar, jqVar, ldVar);
        if (jqVar.b >= iW) {
            i = i < 0 ? -iW : iW;
        }
        this.b.n(-i);
        this.o = this.e;
        jqVar.b = 0;
        bx(kvVar, jqVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAn = an() - 1; iAn >= 0; iAn--) {
            View viewAz = az(iAn);
            int iD = this.b.d(viewAz);
            int iA = this.b.a(viewAz);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAz;
                }
                if (view == null) {
                    view = viewAz;
                }
            }
        }
        return view;
    }

    @Override // defpackage.kq
    public final void m(kv kvVar, ld ldVar, cpt cptVar) {
        super.m(kvVar, ldVar, cptVar);
        cptVar.m("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.kq
    public final void n(kv kvVar, ld ldVar, View view, cpt cptVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof lq)) {
            super.aM(view, cptVar);
            return;
        }
        lq lqVar = (lq) layoutParams;
        if (this.j == 0) {
            int iD = lqVar.d();
            boolean z = lqVar.b;
            cptVar.p(ejs.p(iD, 1, -1, -1, false));
        } else {
            int iD2 = lqVar.d();
            boolean z2 = lqVar.b;
            cptVar.p(ejs.p(-1, -1, iD2, 1, false));
        }
    }

    @Override // defpackage.kq
    public final void o(kv kvVar, ld ldVar) {
        ak(kvVar, ldVar, true);
    }

    @Override // defpackage.kq
    public final void p(ld ldVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    @Override // defpackage.kq
    public final void q(Rect rect, int i, int i2) {
        int iAm;
        int iAm2;
        int iAu = au() + av();
        int iAw = aw() + at();
        if (this.j == 1) {
            iAm2 = am(i2, rect.height() + iAw, ar());
            iAm = am(i, (this.k * this.i) + iAu, as());
        } else {
            iAm = am(i, rect.width() + iAu, as());
            iAm2 = am(i2, (this.k * this.i) + iAw, ar());
        }
        aW(iAm, iAm2);
    }

    final View r(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAn = an();
        View view = null;
        for (int i = 0; i < iAn; i++) {
            View viewAz = az(i);
            int iD = this.b.d(viewAz);
            if (this.b.a(viewAz) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAz;
                }
                if (view == null) {
                    view = viewAz;
                }
            }
        }
        return view;
    }

    @Override // defpackage.kq
    public final boolean s(kr krVar) {
        return krVar instanceof lq;
    }

    @Override // defpackage.kq
    public final boolean u() {
        return this.q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View v() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.v():android.view.View");
    }

    @Override // defpackage.kq
    public final void w(int i, int i2) {
        ai(i, i2, 1);
    }

    @Override // defpackage.kq
    public final void x() {
        this.h.a();
        aT();
    }

    @Override // defpackage.kq
    public final void y(int i, int i2) {
        ai(i, i2, 2);
    }

    @Override // defpackage.kq
    public final void z(int i, int i2) {
        ai(i, i2, 4);
    }
}
