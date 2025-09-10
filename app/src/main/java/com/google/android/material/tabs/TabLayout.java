package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.ar.core.R;
import defpackage.cnj;
import defpackage.cnk;
import defpackage.cnl;
import defpackage.cpt;
import defpackage.dia;
import defpackage.dic;
import defpackage.ejs;
import defpackage.fa;
import defpackage.qpt;
import defpackage.rhn;
import defpackage.rlg;
import defpackage.rnt;
import defpackage.rnx;
import defpackage.roo;
import defpackage.rpd;
import defpackage.rpe;
import defpackage.rpf;
import defpackage.rpg;
import defpackage.rph;
import defpackage.rpi;
import defpackage.rpk;
import defpackage.rpm;
import defpackage.rpn;
import defpackage.rpo;
import defpackage.rpp;
import defpackage.rpt;
import defpackage.rqb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@dic
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    private static final cnj D = new cnl(16);
    public ViewPager A;
    public int B;
    public rnt C;
    private final ArrayList E;
    private rpn F;
    private int G;
    private final int H;
    private final int I;
    private final int J;
    private int K;
    private final ArrayList L;
    private rpi M;
    private ValueAnimator N;
    private dia O;
    private DataSetObserver P;
    private rpo Q;
    private rph R;
    private boolean S;
    private final cnj T;
    public int a;
    final rpm b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final TimeInterpolator z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int q(int i, float f) {
        rpm rpmVar;
        View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (rpmVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < rpmVar.getChildCount() ? rpmVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int r() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.J;
        }
        return 0;
    }

    private static ColorStateList s(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void t(View view) {
        if (!(view instanceof rpg)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        rpg rpgVar = (rpg) view;
        rpn rpnVarD = d();
        CharSequence charSequence = rpgVar.a;
        Drawable drawable = rpgVar.b;
        int i = rpgVar.c;
        if (!TextUtils.isEmpty(rpgVar.getContentDescription())) {
            rpnVarD.c = rpgVar.getContentDescription();
            rpnVarD.b();
        }
        f(rpnVarD);
    }

    private final void u(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            rpm rpmVar = this.b;
            int childCount = rpmVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (rpmVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iQ = q(i, 0.0f);
            if (scrollX != iQ) {
                if (this.N == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.N = valueAnimator;
                    valueAnimator.setInterpolator(this.z);
                    this.N.setDuration(this.s);
                    this.N.addUpdateListener(new roo(this, 5));
                }
                this.N.setIntValues(scrollX, iQ);
                this.N.start();
            }
            int i3 = this.s;
            ValueAnimator valueAnimator2 = rpmVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && rpmVar.b.a != i) {
                rpmVar.a.cancel();
            }
            rpmVar.d(true, i, i3);
            return;
        }
        p(i);
    }

    private final void v(int i) {
        rpm rpmVar = this.b;
        int childCount = rpmVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = rpmVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof rpp) {
                        ((rpp) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void w(LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean x() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    private final void y(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A;
        if (viewPager2 != null) {
            rpo rpoVar = this.Q;
            if (rpoVar != null && (list2 = viewPager2.n) != null) {
                list2.remove(rpoVar);
            }
            rph rphVar = this.R;
            if (rphVar != null && (list = this.A.o) != null) {
                list.remove(rphVar);
            }
        }
        rpi rpiVar = this.M;
        if (rpiVar != null) {
            this.L.remove(rpiVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.A = viewPager;
            if (this.Q == null) {
                this.Q = new rpo(this);
            }
            rpo rpoVar2 = this.Q;
            rpoVar2.b = 0;
            rpoVar2.a = 0;
            viewPager.d(rpoVar2);
            rpt rptVar = new rpt(viewPager, 1);
            this.M = rptVar;
            e(rptVar);
            dia diaVar = viewPager.d;
            if (diaVar != null) {
                l(diaVar, true);
            }
            if (this.R == null) {
                this.R = new rph(this);
            }
            rph rphVar2 = this.R;
            rphVar2.a = true;
            if (viewPager.o == null) {
                viewPager.o = new ArrayList();
            }
            viewPager.o.add(rphVar2);
            p(viewPager.e);
        } else {
            this.A = null;
            l(null, false);
        }
        this.S = z;
    }

    public final int a() {
        rpn rpnVar = this.F;
        if (rpnVar != null) {
            return rpnVar.d;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        t(view);
    }

    public final int b() {
        return this.E.size();
    }

    public final rpn c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (rpn) this.E.get(i);
    }

    public final rpn d() {
        rpn rpnVar = (rpn) D.a();
        if (rpnVar == null) {
            rpnVar = new rpn();
        }
        rpnVar.g = this;
        cnj cnjVar = this.T;
        rpp rppVar = cnjVar != null ? (rpp) cnjVar.a() : null;
        if (rppVar == null) {
            rppVar = new rpp(this, getContext());
        }
        rppVar.a(rpnVar);
        rppVar.setFocusable(true);
        rppVar.setMinimumWidth(r());
        if (TextUtils.isEmpty(rpnVar.c)) {
            rppVar.setContentDescription(rpnVar.b);
        } else {
            rppVar.setContentDescription(rpnVar.c);
        }
        rpnVar.h = rppVar;
        if (rpnVar.i != -1) {
            rpnVar.h.setId(0);
        }
        return rpnVar;
    }

    @Deprecated
    public final void e(rpi rpiVar) {
        ArrayList arrayList = this.L;
        if (arrayList.contains(rpiVar)) {
            return;
        }
        arrayList.add(rpiVar);
    }

    public final void f(rpn rpnVar) {
        g(rpnVar, this.E.isEmpty());
    }

    public final void g(rpn rpnVar, boolean z) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (rpnVar.g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        rpnVar.d = size;
        arrayList.add(size, rpnVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((rpn) arrayList.get(i2)).d == this.a) {
                i = i2;
            }
            ((rpn) arrayList.get(i2)).d = i2;
        }
        this.a = i;
        rpp rppVar = rpnVar.h;
        rppVar.setSelected(false);
        rppVar.setActivated(false);
        rpm rpmVar = this.b;
        int i3 = rpnVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        w(layoutParams);
        rpmVar.addView(rppVar, i3, layoutParams);
        if (z) {
            rpnVar.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        i();
        dia diaVar = this.O;
        if (diaVar != null) {
            int iA = diaVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                rpn rpnVarD = d();
                rpnVarD.d(null);
                g(rpnVarD, false);
            }
            ViewPager viewPager = this.A;
            if (viewPager == null || iA <= 0 || (i = viewPager.e) == a() || i >= b()) {
                return;
            }
            j(c(i));
        }
    }

    public final void i() {
        rpm rpmVar = this.b;
        for (int childCount = rpmVar.getChildCount() - 1; childCount >= 0; childCount--) {
            rpp rppVar = (rpp) rpmVar.getChildAt(childCount);
            rpmVar.removeViewAt(childCount);
            if (rppVar != null) {
                rppVar.a(null);
                rppVar.setSelected(false);
                this.T.b(rppVar);
            }
            requestLayout();
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            rpn rpnVar = (rpn) it.next();
            it.remove();
            rpnVar.g = null;
            rpnVar.h = null;
            rpnVar.a = null;
            rpnVar.i = -1;
            rpnVar.b = null;
            rpnVar.c = null;
            rpnVar.d = -1;
            rpnVar.e = null;
            D.b(rpnVar);
        }
        this.F = null;
    }

    public final void j(rpn rpnVar) {
        k(rpnVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[PHI: r0
      0x0038: PHI (r0v11 rpn) = (r0v9 rpn), (r0v0 rpn) binds: [B:19:0x0032, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.rpn r4, boolean r5) {
        /*
            r3 = this;
            rpn r0 = r3.F
            r1 = -1
            if (r0 != r4) goto L22
            if (r0 == 0) goto L74
            java.util.ArrayList r5 = r3.L
            int r0 = r5.size()
            int r0 = r0 + r1
        Le:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r5.get(r0)
            rpi r1 = (defpackage.rpi) r1
            r1.b()
            int r0 = r0 + (-1)
            goto Le
        L1c:
            int r4 = r4.d
            r3.u(r4)
            return
        L22:
            if (r4 == 0) goto L27
            int r2 = r4.d
            goto L28
        L27:
            r2 = r1
        L28:
            if (r5 == 0) goto L40
            if (r0 == 0) goto L31
            int r5 = r0.d
            if (r5 != r1) goto L38
            goto L32
        L31:
            r0 = 0
        L32:
            if (r2 == r1) goto L38
            r3.p(r2)
            goto L3b
        L38:
            r3.u(r2)
        L3b:
            if (r2 == r1) goto L40
            r3.v(r2)
        L40:
            r3.F = r4
            if (r0 == 0) goto L5d
            com.google.android.material.tabs.TabLayout r5 = r0.g
            if (r5 == 0) goto L5d
            java.util.ArrayList r5 = r3.L
            int r0 = r5.size()
            int r0 = r0 + r1
        L4f:
            if (r0 < 0) goto L5d
            java.lang.Object r2 = r5.get(r0)
            rpi r2 = (defpackage.rpi) r2
            r2.c()
            int r0 = r0 + (-1)
            goto L4f
        L5d:
            if (r4 == 0) goto L74
            java.util.ArrayList r3 = r3.L
            int r5 = r3.size()
            int r5 = r5 + r1
        L66:
            if (r5 < 0) goto L74
            java.lang.Object r0 = r3.get(r5)
            rpi r0 = (defpackage.rpi) r0
            r0.a(r4)
            int r5 = r5 + (-1)
            goto L66
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.k(rpn, boolean):void");
    }

    public final void l(dia diaVar, boolean z) {
        DataSetObserver dataSetObserver;
        dia diaVar2 = this.O;
        if (diaVar2 != null && (dataSetObserver = this.P) != null) {
            diaVar2.a.unregisterObserver(dataSetObserver);
        }
        this.O = diaVar;
        if (z && diaVar != null) {
            if (this.P == null) {
                this.P = new rpk(this);
            }
            diaVar.a.registerObserver(this.P);
        }
        h();
    }

    public final void m(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            rpm rpmVar = this.b;
            if (iRound >= rpmVar.getChildCount()) {
                return;
            }
            if (z2) {
                rpmVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = rpmVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    rpmVar.a.cancel();
                }
                rpmVar.c(rpmVar.getChildAt(i), rpmVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            int iQ = q(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < a() && iQ >= scrollX) || (i > a() && iQ <= scrollX) || i == a();
            if (getLayoutDirection() == 1) {
                z4 = (i < a() && iQ <= scrollX) || (i > a() && iQ >= scrollX) || i == a();
            }
            if (z4 || this.B == 1 || z3) {
                if (i < 0) {
                    iQ = 0;
                }
                scrollTo(iQ, 0);
            }
            if (z) {
                v(iRound);
            }
        }
    }

    public final void n(int i, int i2) {
        ColorStateList colorStateListS = s(i, i2);
        if (this.j != colorStateListS) {
            this.j = colorStateListS;
            ArrayList arrayList = this.E;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((rpn) arrayList.get(i3)).b();
            }
        }
    }

    public final void o(boolean z) {
        int i = 0;
        while (true) {
            rpm rpmVar = this.b;
            if (i >= rpmVar.getChildCount()) {
                return;
            }
            View childAt = rpmVar.getChildAt(i);
            childAt.setMinimumWidth(r());
            w((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rnt.o(this);
        if (this.A == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                y((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            y(null, false);
            this.S = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        rpp rppVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            rpm rpmVar = this.b;
            if (i >= rpmVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = rpmVar.getChildAt(i);
            if ((childAt instanceof rpp) && (drawable = (rppVar = (rpp) childAt).c) != null) {
                drawable.setBounds(rppVar.getLeft(), rppVar.getTop(), rppVar.getRight(), rppVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new cpt(accessibilityNodeInfo).o(ejs.q(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return x() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.E
            android.content.Context r1 = r6.getContext()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L17
            java.lang.Object r5 = r0.get(r4)
            rpn r5 = (defpackage.rpn) r5
            int r4 = r4 + 1
            goto Lc
        L17:
            r0 = 48
            float r0 = defpackage.qpt.H(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L3e
            if (r1 == 0) goto L2f
            goto L51
        L2f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L51
        L3e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L51
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L51
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L51:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L6f
            int r1 = r6.I
            if (r1 <= 0) goto L60
            goto L6d
        L60:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.qpt.H(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L6d:
            r6.q = r1
        L6f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lba
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.u
            if (r0 == 0) goto L92
            if (r0 == r5) goto L86
            r1 = 2
            if (r0 == r1) goto L92
            goto Lba
        L86:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L91
            goto L9c
        L91:
            return
        L92:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Lba
        L9c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = getChildMeasureSpec(r8, r0, r1)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r7.measure(r6, r8)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || x()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i) {
        m(i, 0.0f, true, true, true);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        rnt.n(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        t(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        rnt rpdVar;
        super(rqb.a(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.a = -1;
        this.E = new ArrayList();
        this.i = -1;
        this.G = 0;
        this.q = Integer.MAX_VALUE;
        this.x = -1;
        this.L = new ArrayList();
        this.T = new cnk(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        rpm rpmVar = new rpm(this, context2);
        this.b = rpmVar;
        super.addView(rpmVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayA = rlg.a(context2, attributeSet, rpf.a, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListJ = qpt.J(getBackground());
        if (colorStateListJ != null) {
            rnx rnxVar = new rnx();
            rnxVar.n(colorStateListJ);
            rnxVar.j(context2);
            rnxVar.l(getElevation());
            setBackground(rnxVar);
        }
        Drawable drawableE = rnt.e(context2, typedArrayA, 5);
        Drawable drawableMutate = (drawableE == null ? new GradientDrawable() : drawableE).mutate();
        this.l = drawableMutate;
        qpt.L(drawableMutate, this.G);
        int i2 = this.x;
        rpmVar.b(i2 == -1 ? this.l.getIntrinsicHeight() : i2);
        int color = typedArrayA.getColor(8, 0);
        this.G = color;
        qpt.L(this.l, color);
        o(false);
        rpmVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i3 = typedArrayA.getInt(10, 0);
        if (this.t != i3) {
            this.t = i3;
            rpmVar.postInvalidateOnAnimation();
        }
        int i4 = typedArrayA.getInt(7, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                rpdVar = new rpd();
            } else if (i4 == 2) {
                rpdVar = new rpe();
            } else {
                throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
            }
            this.C = rpdVar;
        } else {
            this.C = new rnt(null);
        }
        this.w = typedArrayA.getBoolean(9, true);
        rpmVar.a();
        rpmVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayA.getDimensionPixelSize(20, this.d);
        this.e = typedArrayA.getDimensionPixelSize(18, this.e);
        this.f = typedArrayA.getDimensionPixelSize(17, this.f);
        this.g = true != rlg.c(context2) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayA.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, fa.w);
        try {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = rnt.d(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.i = typedArrayA.getResourceId(22, resourceId);
            }
            int i5 = this.i;
            if (i5 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i5, fa.w);
                try {
                    this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) this.m);
                    ColorStateList colorStateListD = rnt.d(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListD != null) {
                        this.j = s(this.j.getDefaultColor(), colorStateListD.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListD.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.j = rnt.d(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.j = s(this.j.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            rnt.d(context2, typedArrayA, 3);
            typedArrayA.getInt(4, -1);
            this.k = rnt.d(context2, typedArrayA, 21);
            this.s = typedArrayA.getInt(6, 300);
            this.z = qpt.G(context2, R.attr.motionEasingEmphasizedInterpolator, rhn.b);
            this.H = typedArrayA.getDimensionPixelSize(14, -1);
            this.I = typedArrayA.getDimensionPixelSize(13, -1);
            this.p = typedArrayA.getResourceId(0, 0);
            this.K = typedArrayA.getDimensionPixelSize(1, 0);
            this.u = typedArrayA.getInt(15, 1);
            this.r = typedArrayA.getInt(2, 0);
            this.v = typedArrayA.getBoolean(12, false);
            this.y = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.J = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            int i6 = this.u;
            rpmVar.setPaddingRelative((i6 == 0 || i6 == 2) ? Math.max(0, this.K - this.c) : 0, 0, 0, 0);
            int i7 = this.u;
            if (i7 == 0) {
                int i8 = this.r;
                if (i8 == 0) {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                } else if (i8 == 1) {
                    rpmVar.setGravity(1);
                } else if (i8 == 2) {
                }
                rpmVar.setGravity(8388611);
            } else if (i7 == 1 || i7 == 2) {
                if (this.r == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                rpmVar.setGravity(1);
            }
            o(true);
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }
}
