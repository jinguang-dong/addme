package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kq {
    public int A;
    public int B;
    public int C;
    public int D;
    public final byz E;
    public final byz F;
    private final mk L;
    private final mk M;
    iv r;
    public RecyclerView s;
    public lc t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public kq() {
        ko koVar = new ko(this, 1);
        this.L = koVar;
        ko koVar2 = new ko(this, 0);
        this.M = koVar2;
        this.E = new byz((mk) koVar);
        this.F = new byz((mk) koVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static int am(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int ao(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.ao(int, int, int, int, boolean):int");
    }

    public static kp ax(Context context, AttributeSet attributeSet, int i, int i2) {
        kp kpVar = new kp();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc.a, i, i2);
        kpVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        kpVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        kpVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        kpVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return kpVar;
    }

    private final void bN(View view, int i, boolean z) {
        lg lgVarI = RecyclerView.i(view);
        if (z || lgVarI.u()) {
            this.s.ac.w(lgVarI);
        } else {
            this.s.ac.B(lgVarI);
        }
        kr krVar = (kr) view.getLayoutParams();
        if (lgVarI.A() || lgVarI.v()) {
            if (lgVarI.v()) {
                lgVarI.o();
            } else {
                lgVarI.h();
            }
            this.r.h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.s) {
            int iD = this.r.d(view);
            if (i == -1) {
                i = this.r.a();
            }
            if (iD == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.l());
            }
            if (iD != i) {
                kq kqVar = this.s.m;
                View viewAz = kqVar.az(iD);
                if (viewAz == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iD + kqVar.s.toString());
                }
                kqVar.aH(iD);
                kr krVar2 = (kr) viewAz.getLayoutParams();
                lg lgVarI2 = RecyclerView.i(viewAz);
                if (lgVarI2.u()) {
                    kqVar.s.ac.w(lgVarI2);
                } else {
                    kqVar.s.ac.B(lgVarI2);
                }
                kqVar.r.h(viewAz, i, krVar2, lgVarI2.u());
            }
        } else {
            this.r.g(view, i, false);
            krVar.e = true;
            lc lcVar = this.t;
            if (lcVar != null && lcVar.f && lc.n(view) == lcVar.b) {
                lcVar.g = view;
            }
        }
        if (krVar.f) {
            lgVarI.a.invalidate();
            krVar.f = false;
        }
    }

    public static boolean ba(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int be(View view) {
        return ((kr) view.getLayoutParams()).d.bottom;
    }

    public static final int bf(View view) {
        Rect rect = ((kr) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bg(View view) {
        Rect rect = ((kr) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bh(View view) {
        return ((kr) view.getLayoutParams()).d.left;
    }

    public static final int bi(View view) {
        return ((kr) view.getLayoutParams()).a();
    }

    public static final int bj(View view) {
        return ((kr) view.getLayoutParams()).d.right;
    }

    public static final int bl(View view) {
        return ((kr) view.getLayoutParams()).d.top;
    }

    public static final void bn(View view, int i, int i2, int i3, int i4) {
        kr krVar = (kr) view.getLayoutParams();
        Rect rect = krVar.d;
        view.layout(i + rect.left + krVar.leftMargin, i2 + rect.top + krVar.topMargin, (i3 - rect.right) - krVar.rightMargin, (i4 - rect.bottom) - krVar.bottomMargin);
    }

    public static final int bs(View view) {
        return view.getBottom() + be(view);
    }

    public static final int bt(View view) {
        return view.getLeft() - bh(view);
    }

    public static final int bu(View view) {
        return view.getRight() + bj(view);
    }

    public static final int bv(View view) {
        return view.getTop() - bl(view);
    }

    public int A(ld ldVar) {
        throw null;
    }

    public int B(ld ldVar) {
        throw null;
    }

    public int C(ld ldVar) {
        throw null;
    }

    public int D(ld ldVar) {
        throw null;
    }

    public int E(ld ldVar) {
        throw null;
    }

    public int F(ld ldVar) {
        throw null;
    }

    public Parcelable M() {
        throw null;
    }

    public View O(int i) {
        int iAn = an();
        for (int i2 = 0; i2 < iAn; i2++) {
            View viewAz = az(i2);
            lg lgVarI = RecyclerView.i(viewAz);
            if (lgVarI != null && lgVarI.b() == i && !lgVarI.z() && (this.s.O.g || !lgVarI.u())) {
                return viewAz;
            }
        }
        return null;
    }

    public void P(String str) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.t(str);
        }
    }

    public void S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.s;
        kv kvVar = recyclerView.e;
        ld ldVar = recyclerView.O;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        ki kiVar = this.s.l;
        if (kiVar != null) {
            accessibilityEvent.setItemCount(kiVar.a());
        }
    }

    public void U(int i) {
        throw null;
    }

    public boolean X() {
        throw null;
    }

    public boolean Y() {
        throw null;
    }

    public boolean Z() {
        throw null;
    }

    public int a(kv kvVar, ld ldVar) {
        ki kiVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (kiVar = recyclerView.l) == null || !X()) {
            return 1;
        }
        return kiVar.a();
    }

    public final View aA() {
        View focusedChild;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aB(View view) {
        aC(view, -1);
    }

    public final void aC(View view, int i) {
        bN(view, i, true);
    }

    public final void aD(View view) {
        aE(view, -1);
    }

    public final void aE(View view, int i) {
        bN(view, i, false);
    }

    public final void aF(View view, Rect rect) {
        RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.f(view));
        }
    }

    public final void aG(kv kvVar) {
        int iAn = an();
        while (true) {
            iAn--;
            if (iAn < 0) {
                return;
            }
            View viewAz = az(iAn);
            lg lgVarI = RecyclerView.i(viewAz);
            if (!lgVarI.z()) {
                if (!lgVarI.s() || lgVarI.u() || this.s.l.b) {
                    aH(iAn);
                    kvVar.l(viewAz);
                    this.s.ac.B(lgVarI);
                } else {
                    aS(iAn);
                    kvVar.k(lgVarI);
                }
            }
        }
    }

    public final void aH(int i) {
        az(i);
        this.r.i(i);
    }

    public final void aI(RecyclerView recyclerView) {
        this.v = true;
        aL(recyclerView);
    }

    public void aJ(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.N(i);
        }
    }

    public void aK(int i) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.O(i);
        }
    }

    public final void aM(View view, cpt cptVar) {
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI == null || lgVarI.u() || this.r.k(lgVarI.a)) {
            return;
        }
        RecyclerView recyclerView = this.s;
        n(recyclerView.e, recyclerView.O, view, cptVar);
    }

    public final void aO(kv kvVar) {
        int iAn = an();
        while (true) {
            iAn--;
            if (iAn < 0) {
                return;
            }
            if (!RecyclerView.i(az(iAn)).z()) {
                aR(iAn, kvVar);
            }
        }
    }

    public final void aP(kv kvVar) {
        ArrayList arrayList = kvVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((lg) arrayList.get(i)).a;
            lg lgVarI = RecyclerView.i(view);
            if (!lgVarI.z()) {
                lgVarI.m(false);
                if (lgVarI.w()) {
                    this.s.removeDetachedView(view, false);
                }
                kn knVar = this.s.E;
                if (knVar != null) {
                    knVar.b(lgVarI);
                }
                lgVarI.m(true);
                kvVar.g(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = kvVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aQ(View view, kv kvVar) {
        iv ivVar = this.r;
        int i = ivVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            ivVar.c = 1;
            ivVar.d = view;
            rnu rnuVar = ivVar.e;
            int iX = rnuVar.x(view);
            if (iX >= 0) {
                if (ivVar.a.g(iX)) {
                    ivVar.l(view);
                }
                rnuVar.A(iX);
            }
            ivVar.c = 0;
            ivVar.d = null;
            kvVar.j(view);
        } catch (Throwable th) {
            ivVar.c = 0;
            ivVar.d = null;
            throw th;
        }
    }

    public final void aR(int i, kv kvVar) {
        View viewAz = az(i);
        aS(i);
        kvVar.j(viewAz);
    }

    public final void aS(int i) {
        if (az(i) != null) {
            iv ivVar = this.r;
            int i2 = ivVar.c;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iB = ivVar.b(i);
                rnu rnuVar = ivVar.e;
                View viewY = rnuVar.y(iB);
                if (viewY == null) {
                    return;
                }
                ivVar.c = 1;
                ivVar.d = viewY;
                if (ivVar.a.g(iB)) {
                    ivVar.l(viewY);
                }
                rnuVar.A(iB);
            } finally {
                ivVar.c = 0;
                ivVar.d = null;
            }
        }
    }

    public final void aT() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aU(RecyclerView recyclerView) {
        aV(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aV(int i, int i2) {
        this.C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.C = 0;
        }
        this.D = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public final void aW(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void aX(int i, int i2) {
        int iAn = an();
        if (iAn == 0) {
            this.s.y(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAn; i7++) {
            View viewAz = az(i7);
            Rect rect = this.s.j;
            RecyclerView.I(viewAz, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.j.set(i4, i5, i3, i6);
        q(this.s.j, i, i2);
    }

    public final void aY(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.g;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void aZ(lc lcVar) {
        lc lcVar2 = this.t;
        if (lcVar2 != null && lcVar != lcVar2 && lcVar2.f) {
            lcVar2.f();
        }
        this.t = lcVar;
        RecyclerView recyclerView = this.s;
        recyclerView.L.d();
        if (lcVar.h) {
            Log.w("RecyclerView", "An instance of " + lcVar.getClass().getSimpleName() + " was started more than once. Each instance of" + lcVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        lcVar.c = recyclerView;
        lcVar.d = this;
        int i = lcVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = lcVar.c;
        recyclerView2.O.a = i;
        lcVar.f = true;
        lcVar.e = true;
        lcVar.g = recyclerView2.m.O(lcVar.b);
        lcVar.c.L.b();
        lcVar.h = true;
    }

    public boolean ab() {
        throw null;
    }

    public boolean ad() {
        return false;
    }

    public void al(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int an() {
        iv ivVar = this.r;
        if (ivVar != null) {
            return ivVar.a();
        }
        return 0;
    }

    public final int ap() {
        RecyclerView recyclerView = this.s;
        ki kiVar = recyclerView != null ? recyclerView.l : null;
        if (kiVar != null) {
            return kiVar.a();
        }
        return 0;
    }

    public final int aq() {
        return this.s.getLayoutDirection();
    }

    public final int ar() {
        RecyclerView recyclerView = this.s;
        int[] iArr = con.a;
        return recyclerView.getMinimumHeight();
    }

    public final int as() {
        RecyclerView recyclerView = this.s;
        int[] iArr = con.a;
        return recyclerView.getMinimumWidth();
    }

    public final int at() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int au() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int av() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aw() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View ay(View view) {
        View viewK;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewK = recyclerView.k(view)) == null || this.r.k(viewK)) {
            return null;
        }
        return viewK;
    }

    public final View az(int i) {
        iv ivVar = this.r;
        if (ivVar != null) {
            return ivVar.e(i);
        }
        return null;
    }

    public int b(kv kvVar, ld ldVar) {
        ki kiVar;
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || (kiVar = recyclerView.l) == null || !Y()) {
            return 1;
        }
        return kiVar.a();
    }

    public final boolean bb() {
        lc lcVar = this.t;
        return lcVar != null && lcVar.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bc(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.au()
            int r1 = r8.aw()
            int r2 = r8.C
            int r3 = r8.av()
            int r2 = r2 - r3
            int r3 = r8.D
            int r4 = r8.at()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.aq()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.au()
            int r1 = r8.aw()
            int r3 = r8.C
            int r4 = r8.av()
            int r3 = r3 - r4
            int r4 = r8.D
            int r5 = r8.at()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r8 = r8.s
            android.graphics.Rect r8 = r8.j
            android.support.v7.widget.RecyclerView.I(r11, r8)
            int r11 = r8.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r8.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r8.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r8 = r8.bottom
            int r8 = r8 - r2
            if (r8 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.aw(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.bc(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bd(View view, int i, int i2, kr krVar) {
        return (!view.isLayoutRequested() && this.w && ba(view.getWidth(), i, krVar.width) && ba(view.getHeight(), i2, krVar.height)) ? false : true;
    }

    public int bk() {
        return 0;
    }

    public final void bm(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((kr) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.s.k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void bp(int i, int i2) {
        this.s.y(i, i2);
    }

    public final void bq(Runnable runnable) {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void br(RecyclerView recyclerView) {
        this.v = false;
        aj(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[PHI: r0
      0x0087: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:25:0x007a, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bw(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.bw(int, android.os.Bundle):boolean");
    }

    public int d(int i, kv kvVar, ld ldVar) {
        throw null;
    }

    public int e(int i, kv kvVar, ld ldVar) {
        throw null;
    }

    public abstract kr f();

    public kr g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kr ? new kr((kr) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new kr((ViewGroup.MarginLayoutParams) layoutParams) : new kr(layoutParams);
    }

    public kr h(Context context, AttributeSet attributeSet) {
        return new kr(context, attributeSet);
    }

    public View j(View view, int i, kv kvVar, ld ldVar) {
        throw null;
    }

    public void m(kv kvVar, ld ldVar, cpt cptVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            cptVar.g(8192);
            cptVar.x(true);
            cptVar.I();
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            cptVar.g(4096);
            cptVar.x(true);
            cptVar.I();
        }
        cptVar.o(ejs.q(b(kvVar, ldVar), a(kvVar, ldVar), bk()));
    }

    public void n(kv kvVar, ld ldVar, View view, cpt cptVar) {
        cptVar.p(ejs.p(Y() ? bi(view) : 0, 1, X() ? bi(view) : 0, 1, false));
    }

    public void o(kv kvVar, ld ldVar) {
        throw null;
    }

    public void q(Rect rect, int i, int i2) {
        aW(am(i, rect.width() + au() + av(), as()), am(i2, rect.height() + aw() + at(), ar()));
    }

    public boolean s(kr krVar) {
        return krVar != null;
    }

    public boolean t(int i, Bundle bundle) {
        RecyclerView recyclerView = this.s;
        kv kvVar = recyclerView.e;
        ld ldVar = recyclerView.O;
        return bw(i, bundle);
    }

    public boolean u() {
        throw null;
    }

    public void bo() {
    }

    public void x() {
    }

    public void T(Parcelable parcelable) {
    }

    public void aL(RecyclerView recyclerView) {
    }

    public void aN(int i) {
    }

    public void aj(RecyclerView recyclerView) {
    }

    public void p(ld ldVar) {
    }

    public void af(int i, jm jmVar) {
    }

    public void w(int i, int i2) {
    }

    public void y(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void ae(int i, int i2, ld ldVar, jm jmVar) {
    }
}
