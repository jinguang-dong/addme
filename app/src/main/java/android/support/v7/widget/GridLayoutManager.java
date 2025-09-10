package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.cps;
import defpackage.cpt;
import defpackage.ebn;
import defpackage.ejs;
import defpackage.jm;
import defpackage.jp;
import defpackage.js;
import defpackage.jt;
import defpackage.ju;
import defpackage.ki;
import defpackage.kq;
import defpackage.kr;
import defpackage.kv;
import defpackage.ld;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final Rect g;
    int h;
    int i;
    final ebn j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        ebn ebnVar = new ebn((char[]) null, (byte[]) null);
        this.j = ebnVar;
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        int i3 = ax(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 <= 0) {
            throw new IllegalArgumentException(a.bv(i3, "Span count should be at least 1. Provided "));
        }
        this.b = i3;
        ebnVar.s();
        aT();
    }

    private final int bA(kv kvVar, ld ldVar, int i) {
        if (!ldVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = kvVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        Log.w("GridLayoutManager", a.bv(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bB(kv kvVar, ld ldVar, int i) {
        if (!ldVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (kvVar.a(i) == -1) {
            Log.w("GridLayoutManager", a.bv(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final Set bC(int i) {
        return bE(bx(i), i);
    }

    private final Set bD(int i) {
        return bE(by(i), i);
    }

    private final Set bE(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int iBB = bB(recyclerView.e, recyclerView.O, i2);
        for (int i3 = i; i3 < i + iBB; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bF(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bG() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bH(View view, int i, boolean z) {
        int iAo;
        int iAo2;
        jp jpVar = (jp) view.getLayoutParams();
        Rect rect = jpVar.d;
        int i2 = rect.top + rect.bottom + jpVar.topMargin + jpVar.bottomMargin;
        int i3 = rect.left + rect.right + jpVar.leftMargin + jpVar.rightMargin;
        int iC = c(jpVar.a, jpVar.b);
        if (this.k == 1) {
            iAo2 = ao(iC, i, i3, jpVar.width, false);
            iAo = ao(this.l.k(), this.B, i2, jpVar.height, true);
        } else {
            int iAo3 = ao(iC, i, i2, jpVar.height, false);
            int iAo4 = ao(this.l.k(), this.A, i3, jpVar.width, true);
            iAo = iAo3;
            iAo2 = iAo4;
        }
        bI(view, iAo2, iAo, z);
    }

    private final void bI(View view, int i, int i2, boolean z) {
        boolean zBd;
        kr krVar = (kr) view.getLayoutParams();
        if (z) {
            zBd = true;
            if (this.w && kq.ba(view.getMeasuredWidth(), i, krVar.width) && kq.ba(view.getMeasuredHeight(), i2, krVar.height)) {
                zBd = false;
            }
        } else {
            zBd = bd(view, i, i2, krVar);
        }
        if (zBd) {
            view.measure(i, i2);
        }
    }

    private final void bJ() {
        int iAt;
        int iAw;
        if (this.k == 1) {
            iAt = this.C - av();
            iAw = au();
        } else {
            iAt = this.D - at();
            iAw = aw();
        }
        bF(iAt - iAw);
    }

    private final int bx(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return bz(recyclerView.e, recyclerView.O, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bA(recyclerView2.e, recyclerView2.O, i);
    }

    private final int by(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return bz(recyclerView.e, recyclerView.O, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bA(recyclerView2.e, recyclerView2.O, i);
    }

    private final int bz(kv kvVar, ld ldVar, int i) {
        if (ldVar.g) {
            int iA = kvVar.a(i);
            if (iA == -1) {
                Log.w("GridLayoutManager", a.bv(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
            i = iA;
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    @Override // defpackage.kq
    public final int a(kv kvVar, ld ldVar) {
        if (this.k == 1) {
            return Math.min(this.b, ap());
        }
        if (ldVar.a() <= 0) {
            return 0;
        }
        return bz(kvVar, ldVar, ldVar.a() - 1) + 1;
    }

    @Override // defpackage.kq
    public final int b(kv kvVar, ld ldVar) {
        if (this.k == 0) {
            return Math.min(this.b, ap());
        }
        if (ldVar.a() <= 0) {
            return 0;
        }
        return bz(kvVar, ldVar, ldVar.a() - 1) + 1;
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !aa()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int d(int i, kv kvVar, ld ldVar) {
        bJ();
        bG();
        return super.d(i, kvVar, ldVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int e(int i, kv kvVar, ld ldVar) {
        bJ();
        bG();
        return super.e(i, kvVar, ldVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final kr f() {
        return this.k == 0 ? new jp(-2, -1) : new jp(-1, -2);
    }

    @Override // defpackage.kq
    public final kr g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new jp((ViewGroup.MarginLayoutParams) layoutParams) : new jp(layoutParams);
    }

    @Override // defpackage.kq
    public final kr h(Context context, AttributeSet attributeSet) {
        return new jp(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(kv kvVar, ld ldVar, boolean z, boolean z2) {
        int i;
        int iAn;
        int i2;
        int iAn2 = an();
        if (z2) {
            i = -1;
            iAn = an() - 1;
            i2 = -1;
        } else {
            i = iAn2;
            iAn = 0;
            i2 = 1;
        }
        int iA = ldVar.a();
        R();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAn != i) {
            View viewAz = az(iAn);
            int iBi = bi(viewAz);
            if (iBi >= 0 && iBi < iA && bA(kvVar, ldVar, iBi) == 0) {
                if (((kr) viewAz.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewAz;
                    }
                } else {
                    if (this.l.d(viewAz) < iF && this.l.a(viewAz) >= iJ) {
                        return viewAz;
                    }
                    if (view == null) {
                        view = viewAz;
                    }
                }
            }
            iAn += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.kv r25, defpackage.ld r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, kv, ld):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(kv kvVar, ld ldVar, ju juVar, jt jtVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int iAu;
        int i4;
        int iAo;
        int iAo2;
        boolean z;
        View viewA;
        int i5 = this.l.i();
        int i6 = an() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bJ();
        }
        int i7 = juVar.e;
        int iBA = this.b;
        if (i7 != 1) {
            iBA = bA(kvVar, ldVar, juVar.d) + bB(kvVar, ldVar, juVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && juVar.d(ldVar) && iBA > 0) {
            int i9 = juVar.d;
            int iBB = bB(kvVar, ldVar, i9);
            if (iBB > this.b) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBB + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBA -= iBB;
            if (iBA < 0 || (viewA = juVar.a(kvVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            jtVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            View view = this.d[i];
            jp jpVar = (jp) view.getLayoutParams();
            int iBB2 = bB(kvVar, ldVar, bi(view));
            jpVar.b = iBB2;
            jpVar.a = i10;
            i10 += iBB2;
            i += i3;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.d[i12];
            if (juVar.l != null) {
                z = false;
                if (i7 == 1) {
                    aB(view2);
                } else {
                    aC(view2, 0);
                }
            } else if (i7 == 1) {
                aD(view2);
                z = false;
            } else {
                z = false;
                aE(view2, 0);
            }
            aF(view2, this.g);
            bH(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((jp) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bF(Math.max(Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.d[i13];
                bH(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                jp jpVar2 = (jp) view4.getLayoutParams();
                Rect rect = jpVar2.d;
                int i15 = rect.top + rect.bottom + jpVar2.topMargin + jpVar2.bottomMargin;
                int i16 = rect.left + rect.right + jpVar2.leftMargin + jpVar2.rightMargin;
                int iC3 = c(jpVar2.a, jpVar2.b);
                if (this.k == 1) {
                    iAo2 = ao(iC3, 1073741824, i16, jpVar2.width, false);
                    iAo = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAo = ao(iC3, 1073741824, i15, jpVar2.height, false);
                    iAo2 = iMakeMeasureSpec;
                }
                bI(view4, iAo2, iAo, true);
            }
        }
        jtVar.a = i11;
        if (this.k == 1) {
            if (juVar.f == -1) {
                int i17 = juVar.b;
                i4 = i17 - i11;
                iC2 = i17;
            } else {
                i4 = juVar.b;
                iC2 = i4 + i11;
            }
            iAu = 0;
            iC = 0;
        } else {
            if (juVar.f == -1) {
                int i18 = juVar.b;
                iAu = i18 - i11;
                iC2 = 0;
                iC = i18;
            } else {
                int i19 = juVar.b;
                iC = i19 + i11;
                iC2 = 0;
                iAu = i19;
            }
            i4 = iC2;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.d[i20];
            jp jpVar3 = (jp) view5.getLayoutParams();
            if (this.k != 1) {
                int iAw = aw() + this.c[jpVar3.a];
                i4 = iAw;
                iC2 = this.l.c(view5) + iAw;
            } else if (aa()) {
                int iAu2 = au() + this.c[this.b - jpVar3.a];
                iC = iAu2;
                iAu = iAu2 - this.l.c(view5);
            } else {
                iAu = au() + this.c[jpVar3.a];
                iC = this.l.c(view5) + iAu;
            }
            bn(view5, iAu, i4, iC, iC2);
            if (jpVar3.c() || jpVar3.b()) {
                jtVar.c = true;
            }
            jtVar.d = view5.hasFocusable() | jtVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(kv kvVar, ld ldVar, js jsVar, int i) {
        bJ();
        if (ldVar.a() > 0 && !ldVar.g) {
            int iBA = bA(kvVar, ldVar, jsVar.b);
            if (i == 1) {
                while (iBA > 0) {
                    int i2 = jsVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    jsVar.b = i3;
                    iBA = bA(kvVar, ldVar, i3);
                }
            } else {
                int iA = ldVar.a() - 1;
                int i4 = jsVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBA2 = bA(kvVar, ldVar, i5);
                    if (iBA2 <= iBA) {
                        break;
                    }
                    i4 = i5;
                    iBA = iBA2;
                }
                jsVar.b = i4;
            }
        }
        bG();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void m(kv kvVar, ld ldVar, cpt cptVar) {
        super.m(kvVar, ldVar, cptVar);
        cptVar.m(GridView.class.getName());
        ki kiVar = this.s.l;
        if (kiVar == null || kiVar.a() <= 1) {
            return;
        }
        cptVar.h(cps.M);
    }

    @Override // defpackage.kq
    public final void n(kv kvVar, ld ldVar, View view, cpt cptVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof jp)) {
            super.aM(view, cptVar);
            return;
        }
        jp jpVar = (jp) layoutParams;
        int iBz = bz(kvVar, ldVar, jpVar.a());
        if (this.k == 0) {
            cptVar.p(ejs.p(jpVar.a, jpVar.b, iBz, 1, false));
        } else {
            cptVar.p(ejs.p(iBz, 1, jpVar.a, jpVar.b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void o(kv kvVar, ld ldVar) {
        if (ldVar.g) {
            int iAn = an();
            for (int i = 0; i < iAn; i++) {
                jp jpVar = (jp) az(i).getLayoutParams();
                int iA = jpVar.a();
                this.e.put(iA, jpVar.b);
                this.f.put(iA, jpVar.a);
            }
        }
        super.o(kvVar, ldVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void p(ld ldVar) {
        View viewO;
        super.p(ldVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (viewO = O(i)) == null) {
            return;
        }
        viewO.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    @Override // defpackage.kq
    public final void q(Rect rect, int i, int i2) {
        int iAm;
        int iAm2;
        if (this.c == null) {
            super.q(rect, i, i2);
        }
        int iAu = au() + av();
        int iAw = aw() + at();
        if (this.k == 1) {
            iAm2 = am(i2, rect.height() + iAw, ar());
            iAm = am(i, this.c[r7.length - 1] + iAu, as());
        } else {
            iAm = am(i, rect.width() + iAu, as());
            iAm2 = am(i2, this.c[r5.length - 1] + iAw, ar());
        }
        aW(iAm, iAm2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void r(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r(false);
    }

    @Override // defpackage.kq
    public final boolean s(kr krVar) {
        return krVar instanceof jp;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[EDGE_INSN: B:195:0x0259->B:153:0x0259 BREAK  A[LOOP:2: B:117:0x019c->B:126:0x01c6, LOOP_LABEL: LOOP:2: B:117:0x019c->B:126:0x01c6], EDGE_INSN: B:201:0x0259->B:153:0x0259 BREAK  A[LOOP:5: B:135:0x01fe->B:146:0x022d, LOOP_LABEL: LOOP:5: B:135:0x01fe->B:146:0x022d]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0268  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.t(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final boolean u() {
        return this.p == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void v(ld ldVar, ju juVar, jm jmVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && juVar.d(ldVar) && i > 0; i2++) {
            jmVar.a(juVar.d, Math.max(0, juVar.g));
            i--;
            juVar.d += juVar.e;
        }
    }

    @Override // defpackage.kq
    public final void w(int i, int i2) {
        ebn ebnVar = this.j;
        ebnVar.s();
        ebnVar.r();
    }

    @Override // defpackage.kq
    public final void x() {
        ebn ebnVar = this.j;
        ebnVar.s();
        ebnVar.r();
    }

    @Override // defpackage.kq
    public final void y(int i, int i2) {
        ebn ebnVar = this.j;
        ebnVar.s();
        ebnVar.r();
    }

    @Override // defpackage.kq
    public final void z(int i, int i2) {
        ebn ebnVar = this.j;
        ebnVar.s();
        ebnVar.r();
    }
}
