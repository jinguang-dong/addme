package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.cps;
import defpackage.cpt;
import defpackage.e;
import defpackage.jm;
import defpackage.js;
import defpackage.jt;
import defpackage.ju;
import defpackage.jv;
import defpackage.kf;
import defpackage.ki;
import defpackage.kp;
import defpackage.kq;
import defpackage.kr;
import defpackage.kv;
import defpackage.lb;
import defpackage.lc;
import defpackage.ld;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends kq implements lb {
    private ju a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final jt f;
    private int g;
    private int[] h;
    public int k;
    kf l;
    boolean m;
    int n;
    int o;
    jv p;
    final js q;

    public LinearLayoutManager() {
        this(1);
    }

    private final int bA(int i, kv kvVar, ld ldVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -K(iJ2, kvVar, ldVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final View bB() {
        return N(0, an());
    }

    private final View bC() {
        return N(an() - 1, -1);
    }

    private final View bD() {
        return az(this.m ? 0 : an() - 1);
    }

    private final View bE() {
        return az(this.m ? an() - 1 : 0);
    }

    private final void bF(kv kvVar, ju juVar) {
        if (!juVar.a || juVar.m) {
            return;
        }
        int i = juVar.g;
        int i2 = juVar.i;
        if (juVar.f == -1) {
            int iAn = an();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAn; i3++) {
                        View viewAz = az(i3);
                        if (this.l.d(viewAz) < iE || this.l.m(viewAz) < iE) {
                            bG(kvVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAn - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAz2 = az(i5);
                    if (this.l.d(viewAz2) < iE || this.l.m(viewAz2) < iE) {
                        bG(kvVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAn2 = an();
            if (!this.m) {
                for (int i7 = 0; i7 < iAn2; i7++) {
                    View viewAz3 = az(i7);
                    if (this.l.a(viewAz3) > i6 || this.l.l(viewAz3) > i6) {
                        bG(kvVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAn2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAz4 = az(i9);
                if (this.l.a(viewAz4) > i6 || this.l.l(viewAz4) > i6) {
                    bG(kvVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bG(kv kvVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aR(i, kvVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aR(i2, kvVar);
                }
            }
        }
    }

    private final void bH() {
        this.m = (this.k == 1 || !aa()) ? this.c : !this.c;
    }

    private final void bI(int i, int i2, boolean z, ld ldVar) {
        int iJ;
        this.a.m = ac();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        Q(ldVar, iArr);
        int iMax = Math.max(0, this.h[0]);
        int iMax2 = Math.max(0, this.h[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        ju juVar = this.a;
        juVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        juVar.i = iMax;
        if (i == 1) {
            juVar.h = i3 + this.l.g();
            View viewBD = bD();
            ju juVar2 = this.a;
            juVar2.e = true == this.m ? -1 : 1;
            int iBi = bi(viewBD);
            ju juVar3 = this.a;
            juVar2.d = iBi + juVar3.e;
            juVar3.b = this.l.a(viewBD);
            iJ = this.l.a(viewBD) - this.l.f();
        } else {
            View viewBE = bE();
            this.a.h += this.l.j();
            ju juVar4 = this.a;
            juVar4.e = true != this.m ? -1 : 1;
            int iBi2 = bi(viewBE);
            ju juVar5 = this.a;
            juVar4.d = iBi2 + juVar5.e;
            juVar5.b = this.l.d(viewBE);
            iJ = (-this.l.d(viewBE)) + this.l.j();
        }
        ju juVar6 = this.a;
        juVar6.c = i2;
        if (z) {
            juVar6.c = i2 - iJ;
        }
        juVar6.g = iJ;
    }

    private final void bJ(js jsVar) {
        bK(jsVar.b, jsVar.c);
    }

    private final void bK(int i, int i2) {
        this.a.c = this.l.f() - i2;
        ju juVar = this.a;
        juVar.e = true != this.m ? 1 : -1;
        juVar.d = i;
        juVar.f = 1;
        juVar.b = i2;
        juVar.g = Integer.MIN_VALUE;
    }

    private final void bL(js jsVar) {
        bM(jsVar.b, jsVar.c);
    }

    private final void bM(int i, int i2) {
        this.a.c = i2 - this.l.j();
        ju juVar = this.a;
        juVar.d = i;
        juVar.e = true != this.m ? -1 : 1;
        juVar.f = -1;
        juVar.b = i2;
        juVar.g = Integer.MIN_VALUE;
    }

    private final int bx(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return e.i(ldVar, this.l, ah(!this.e), ag(!this.e), this, this.e, this.m);
    }

    private final int by(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return e.j(ldVar, this.l, ah(!this.e), ag(!this.e), this, this.e);
    }

    private final int bz(int i, kv kvVar, ld ldVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -K(-iF2, kvVar, ldVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int c(ld ldVar) {
        if (an() == 0) {
            return 0;
        }
        R();
        return e.h(ldVar, this.l, ah(!this.e), ag(!this.e), this, this.e);
    }

    @Override // defpackage.kq
    public final int A(ld ldVar) {
        return c(ldVar);
    }

    @Override // defpackage.kq
    public final int B(ld ldVar) {
        return bx(ldVar);
    }

    @Override // defpackage.kq
    public final int C(ld ldVar) {
        return by(ldVar);
    }

    @Override // defpackage.kq
    public int D(ld ldVar) {
        return c(ldVar);
    }

    @Override // defpackage.kq
    public final int E(ld ldVar) {
        return bx(ldVar);
    }

    @Override // defpackage.kq
    public final int F(ld ldVar) {
        return by(ldVar);
    }

    final int G(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && aa()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && aa()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int H(kv kvVar, ju juVar, ld ldVar, boolean z) {
        int i = juVar.c;
        int i2 = juVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                juVar.g = i2 + i;
            }
            bF(kvVar, juVar);
        }
        int i3 = juVar.c + juVar.h;
        jt jtVar = this.f;
        while (true) {
            if ((!juVar.m && i3 <= 0) || !juVar.d(ldVar)) {
                break;
            }
            jtVar.a = 0;
            jtVar.b = false;
            jtVar.c = false;
            jtVar.d = false;
            k(kvVar, ldVar, juVar, jtVar);
            if (!jtVar.b) {
                int i4 = juVar.b;
                int i5 = jtVar.a;
                juVar.b = i4 + (juVar.f * i5);
                if (!jtVar.c || juVar.l != null || !ldVar.g) {
                    juVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = juVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    juVar.g = i7;
                    int i8 = juVar.c;
                    if (i8 < 0) {
                        juVar.g = i7 + i8;
                    }
                    bF(kvVar, juVar);
                }
                if (z && jtVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - juVar.c;
    }

    public final int I() {
        View viewAi = ai(0, an(), false);
        if (viewAi == null) {
            return -1;
        }
        return bi(viewAi);
    }

    public final int J() {
        View viewAi = ai(an() - 1, -1, false);
        if (viewAi == null) {
            return -1;
        }
        return bi(viewAi);
    }

    final int K(int i, kv kvVar, ld ldVar) {
        if (an() != 0 && i != 0) {
            R();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bI(i2, iAbs, true, ldVar);
            ju juVar = this.a;
            int iH = juVar.g + H(kvVar, juVar, ldVar, false);
            if (iH >= 0) {
                if (iAbs > iH) {
                    i = i2 * iH;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.lb
    public final PointF L(int i) {
        if (an() == 0) {
            return null;
        }
        float f = (i < bi(az(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.kq
    public final Parcelable M() {
        jv jvVar = this.p;
        if (jvVar != null) {
            return new jv(jvVar);
        }
        jv jvVar2 = new jv();
        if (an() <= 0) {
            jvVar2.a();
            return jvVar2;
        }
        R();
        boolean z = this.b ^ this.m;
        jvVar2.c = z;
        if (z) {
            View viewBD = bD();
            jvVar2.b = this.l.f() - this.l.a(viewBD);
            jvVar2.a = bi(viewBD);
            return jvVar2;
        }
        View viewBE = bE();
        jvVar2.a = bi(viewBE);
        jvVar2.b = this.l.d(viewBE) - this.l.j();
        return jvVar2;
    }

    final View N(int i, int i2) {
        R();
        if (i2 <= i && i2 >= i) {
            return az(i);
        }
        int iD = this.l.d(az(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.E.E(i, i2, i4, i3) : this.F.E(i, i2, i4, i3);
    }

    @Override // defpackage.kq
    public final View O(int i) {
        int iAn = an();
        if (iAn == 0) {
            return null;
        }
        int iBi = i - bi(az(0));
        if (iBi >= 0 && iBi < iAn) {
            View viewAz = az(iBi);
            if (bi(viewAz) == i) {
                return viewAz;
            }
        }
        return super.O(i);
    }

    @Override // defpackage.kq
    public final void P(String str) {
        if (this.p == null) {
            super.P(str);
        }
    }

    protected void Q(ld ldVar, int[] iArr) {
        int iK = ldVar.c() ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void R() {
        if (this.a == null) {
            this.a = new ju();
        }
    }

    @Override // defpackage.kq
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (an() > 0) {
            accessibilityEvent.setFromIndex(I());
            accessibilityEvent.setToIndex(J());
        }
    }

    @Override // defpackage.kq
    public final void T(Parcelable parcelable) {
        if (parcelable instanceof jv) {
            jv jvVar = (jv) parcelable;
            this.p = jvVar;
            if (this.n != -1) {
                jvVar.a();
            }
            aT();
        }
    }

    @Override // defpackage.kq
    public final void U(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        jv jvVar = this.p;
        if (jvVar != null) {
            jvVar.a();
        }
        aT();
    }

    public final void V(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.bv(i, "invalid orientation:"));
        }
        P(null);
        if (i != this.k || this.l == null) {
            kf kfVarP = kf.p(this, i);
            this.l = kfVarP;
            this.q.a = kfVarP;
            this.k = i;
            aT();
        }
    }

    public final void W(boolean z) {
        P(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aT();
    }

    @Override // defpackage.kq
    public final boolean X() {
        return this.k == 0;
    }

    @Override // defpackage.kq
    public final boolean Y() {
        return this.k == 1;
    }

    @Override // defpackage.kq
    public final boolean Z() {
        return true;
    }

    protected final boolean aa() {
        return aq() == 1;
    }

    @Override // defpackage.kq
    public final boolean ab() {
        return this.c;
    }

    final boolean ac() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.kq
    public final boolean ad() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAn = an();
            for (int i = 0; i < iAn; i++) {
                ViewGroup.LayoutParams layoutParams = az(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kq
    public final void ae(int i, int i2, ld ldVar, jm jmVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (an() == 0 || i == 0) {
            return;
        }
        R();
        bI(i > 0 ? 1 : -1, Math.abs(i), true, ldVar);
        v(ldVar, this.a, jmVar);
    }

    @Override // defpackage.kq
    public final void af(int i, jm jmVar) {
        boolean z;
        int i2;
        jv jvVar = this.p;
        if (jvVar == null || !jvVar.b()) {
            bH();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = jvVar.c;
            i2 = jvVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            jmVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ag(boolean z) {
        return this.m ? ai(0, an(), z) : ai(an() - 1, -1, z);
    }

    final View ah(boolean z) {
        return this.m ? ai(an() - 1, -1, z) : ai(0, an(), z);
    }

    final View ai(int i, int i2, boolean z) {
        R();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        return i3 == 0 ? this.E.E(i, i2, i4, 320) : this.F.E(i, i2, i4, 320);
    }

    public final void ak(int i) {
        this.n = i;
        this.o = 0;
        jv jvVar = this.p;
        if (jvVar != null) {
            jvVar.a();
        }
        aT();
    }

    @Override // defpackage.kq
    public void al(RecyclerView recyclerView, int i) {
        lc lcVar = new lc(recyclerView.getContext());
        lcVar.b = i;
        aZ(lcVar);
    }

    @Override // defpackage.kq
    public int d(int i, kv kvVar, ld ldVar) {
        if (this.k == 1) {
            return 0;
        }
        return K(i, kvVar, ldVar);
    }

    @Override // defpackage.kq
    public int e(int i, kv kvVar, ld ldVar) {
        if (this.k == 0) {
            return 0;
        }
        return K(i, kvVar, ldVar);
    }

    @Override // defpackage.kq
    public kr f() {
        return new kr(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i(defpackage.kv r17, defpackage.ld r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.R()
            int r1 = r0.an()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.an()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            kf r7 = r0.l
            int r7 = r7.j()
            kf r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.az(r1)
            int r13 = bi(r12)
            kf r14 = r0.l
            int r14 = r14.d(r12)
            kf r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            kr r13 = (defpackage.kr) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r2
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r2
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(kv, ld, boolean, boolean):android.view.View");
    }

    @Override // defpackage.kq
    public View j(View view, int i, kv kvVar, ld ldVar) {
        int iG;
        View viewBB;
        bH();
        if (an() == 0 || (iG = G(i)) == Integer.MIN_VALUE) {
            return null;
        }
        R();
        bI(iG, (int) (this.l.k() * 0.33333334f), false, ldVar);
        ju juVar = this.a;
        juVar.g = Integer.MIN_VALUE;
        juVar.a = false;
        H(kvVar, juVar, ldVar, true);
        if (iG == -1) {
            viewBB = this.m ? bC() : bB();
            iG = -1;
        } else {
            viewBB = this.m ? bB() : bC();
        }
        View viewBE = iG == -1 ? bE() : bD();
        if (!viewBE.hasFocusable()) {
            return viewBB;
        }
        if (viewBB == null) {
            return null;
        }
        return viewBE;
    }

    public void k(kv kvVar, ld ldVar, ju juVar, jt jtVar) {
        int iAw;
        int i;
        int iC;
        int i2;
        int iC2;
        View viewA = juVar.a(kvVar);
        if (viewA == null) {
            jtVar.b = true;
            return;
        }
        kr krVar = (kr) viewA.getLayoutParams();
        if (juVar.l == null) {
            if (this.m == (juVar.f == -1)) {
                aD(viewA);
            } else {
                aE(viewA, 0);
            }
        } else {
            if (this.m == (juVar.f == -1)) {
                aB(viewA);
            } else {
                aC(viewA, 0);
            }
        }
        kr krVar2 = (kr) viewA.getLayoutParams();
        Rect rectF = this.s.f(viewA);
        int i3 = rectF.left + rectF.right;
        int i4 = rectF.top + rectF.bottom;
        int iAo = kq.ao(this.C, this.A, au() + av() + krVar2.leftMargin + krVar2.rightMargin + i3, krVar2.width, X());
        int iAo2 = kq.ao(this.D, this.B, aw() + at() + krVar2.topMargin + krVar2.bottomMargin + i4, krVar2.height, Y());
        if (bd(viewA, iAo, iAo2, krVar2)) {
            viewA.measure(iAo, iAo2);
        }
        jtVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (aa()) {
                iC = this.C - av();
                iC2 = iC - this.l.c(viewA);
            } else {
                int iAu = au();
                iC = this.l.c(viewA) + iAu;
                iC2 = iAu;
            }
            if (juVar.f == -1) {
                i2 = juVar.b;
                iAw = i2 - jtVar.a;
            } else {
                iAw = juVar.b;
                i2 = jtVar.a + iAw;
            }
        } else {
            iAw = aw();
            int iC3 = this.l.c(viewA) + iAw;
            if (juVar.f == -1) {
                iC = juVar.b;
                i = iC - jtVar.a;
            } else {
                i = juVar.b;
                iC = jtVar.a + i;
            }
            int i5 = i;
            i2 = iC3;
            iC2 = i5;
        }
        bn(viewA, iC2, iAw, iC, i2);
        if (krVar.c() || krVar.b()) {
            jtVar.c = true;
        }
        jtVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.kq
    public void m(kv kvVar, ld ldVar, cpt cptVar) {
        super.m(kvVar, ldVar, cptVar);
        ki kiVar = this.s.l;
        if (kiVar == null || kiVar.a() <= 0) {
            return;
        }
        cptVar.h(cps.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    @Override // defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(defpackage.kv r17, defpackage.ld r18) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.o(kv, ld):void");
    }

    @Override // defpackage.kq
    public void p(ld ldVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void r(boolean z) {
        P(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aT();
    }

    @Override // defpackage.kq
    public boolean t(int i, Bundle bundle) {
        int iMin;
        if (super.t(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                iMin = Math.min(i2, b(recyclerView.e, recyclerView.O) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                iMin = Math.min(i3, a(recyclerView2.e, recyclerView2.O) - 1);
            }
            if (iMin >= 0) {
                ak(iMin);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kq
    public boolean u() {
        return this.p == null && this.b == this.d;
    }

    public void v(ld ldVar, ju juVar, jm jmVar) {
        int i = juVar.d;
        if (i < 0 || i >= ldVar.a()) {
            return;
        }
        jmVar.a(i, Math.max(0, juVar.g));
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new js();
        this.f = new jt();
        this.g = 2;
        this.h = new int[2];
        V(i);
        W(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new js();
        this.f = new jt();
        this.g = 2;
        this.h = new int[2];
        kp kpVarAx = ax(context, attributeSet, i, i2);
        V(kpVarAx.a);
        W(kpVarAx.c);
        r(kpVarAx.d);
    }

    @Override // defpackage.kq
    public void aj(RecyclerView recyclerView) {
    }

    public void l(kv kvVar, ld ldVar, js jsVar, int i) {
    }
}
