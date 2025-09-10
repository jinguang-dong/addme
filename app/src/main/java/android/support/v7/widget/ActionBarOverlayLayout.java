package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.ar.core.R;
import defpackage.av;
import defpackage.cmh;
import defpackage.cnv;
import defpackage.cnw;
import defpackage.cnx;
import defpackage.coe;
import defpackage.cog;
import defpackage.con;
import defpackage.cpd;
import defpackage.cpm;
import defpackage.cpp;
import defpackage.ez;
import defpackage.fn;
import defpackage.gb;
import defpackage.gl;
import defpackage.gy;
import defpackage.gz;
import defpackage.ha;
import defpackage.hb;
import defpackage.hg;
import defpackage.iw;
import defpackage.md;
import defpackage.mi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements iw, cnv, cnw {
    static final int[] a;
    private static final cpp k;
    private static final Rect l;
    private cpp A;
    private cpp B;
    private OverScroller C;
    private final Runnable D;
    private final Runnable E;
    private final cnx F;
    private final hb G;
    private mi H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public gz h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private Drawable o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private cpp y;
    private cpp z;

    static {
        new Rect();
        a = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
        cpd cpdVar = new cpd();
        cpdVar.c(cmh.b(0, 1, 0, 1));
        k = cpdVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ha haVar = (ha) view.getLayoutParams();
        if (haVar.leftMargin != i) {
            haVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (haVar.topMargin != i2) {
            haVar.topMargin = i2;
            z = true;
        }
        if (haVar.rightMargin != i3) {
            haVar.rightMargin = i3;
            z = true;
        }
        if (haVar.bottomMargin == i4) {
            return z;
        }
        haVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.iw
    public final void a() {
        i();
        this.H.c();
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.iw
    public final void c(int i) {
        i();
        if (i != 109) {
            return;
        }
        this.d = true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ha;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    @Override // defpackage.cnv
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.cnw
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.cnv
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ha();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ha(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // defpackage.cnv
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.H = ((Toolbar) viewFindViewById).x();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.iw
    public final void l(Menu menu, gl glVar) {
        i();
        mi miVar = this.H;
        if (miVar.f == null) {
            miVar.f = new hg(miVar.a.getContext());
        }
        hg hgVar = miVar.f;
        hgVar.e = glVar;
        Toolbar toolbar = miVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.l();
        gb gbVar = toolbar.a.a;
        if (gbVar == menu) {
            return;
        }
        if (gbVar != null) {
            gbVar.m(toolbar.x);
            gbVar.m(toolbar.y);
        }
        if (toolbar.y == null) {
            toolbar.y = new md(toolbar);
        }
        hgVar.o();
        if (menu != null) {
            gb gbVar2 = (gb) menu;
            gbVar2.h(hgVar, toolbar.j);
            gbVar2.h(toolbar.y, toolbar.j);
        } else {
            hgVar.b(toolbar.j, null);
            toolbar.y.b(toolbar.j, null);
            hgVar.i();
            toolbar.y.i();
        }
        toolbar.a.j(toolbar.k);
        toolbar.a.k(hgVar);
        toolbar.x = hgVar;
        toolbar.t();
    }

    @Override // defpackage.iw
    public final void m() {
        i();
        this.H.f();
    }

    @Override // defpackage.iw
    public final void n(Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.iw
    public final void o(CharSequence charSequence) {
        i();
        this.H.i(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        cpp cppVar = k;
        int[] iArr = con.a;
        hb hbVar = this.G;
        Rect rect = this.v;
        cog.d(hbVar, cppVar, rect);
        boolean zEquals = rect.equals(l);
        this.w = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.x = z3;
        gz gzVar = this.h;
        if (gzVar != null) {
            ((ez) gzVar).j = (z2 || z3) ? false : true;
        }
        cpp cppVarO = cpp.o(windowInsets, this);
        cpm cpmVar = cppVarO.b;
        Rect rect2 = this.u;
        cmh cmhVarD = cpmVar.d();
        int i3 = cmhVarD.b;
        int i4 = cmhVarD.c;
        int i5 = cmhVarD.d;
        rect2.set(i3, i4, i5, cmhVarD.e);
        if (this.x) {
            cmh cmhVarF = cppVarO.f(2);
            int i6 = cmhVarF.b;
            int i7 = cmhVarF.d;
            this.c.setPadding(i3 - i6, i4, i5 - i7, 0);
            zW = w(this.c, i6, 0, i7, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i3, i4, i5, 0);
        }
        Rect rect3 = this.r;
        cog.d(this, cppVarO, rect3);
        cpp cppVarM = cppVarO.m(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = cppVarM;
        if (this.z.equals(cppVarM)) {
            z = zW;
        } else {
            this.z = this.y;
        }
        Rect rect4 = this.s;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return cppVarO.j().l().k().e();
        }
        rect4.set(rect3);
        requestLayout();
        return cppVarO.j().l().k().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int[] iArr = con.a;
        coe.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ha haVar = (ha) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = haVar.leftMargin + paddingLeft;
                int i7 = haVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        ha haVar = (ha) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + haVar.leftMargin + haVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + haVar.topMargin + haVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = con.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        rect.set(this.r);
        cpp cppVar = this.y;
        this.A = cppVar;
        if (this.d || z || !this.w) {
            cmh cmhVarB = this.x ? cmh.b(cppVar.b(), Math.max(this.A.d(), measuredHeight), this.A.c(), Math.max(this.A.a(), 0)) : cmh.b(cppVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            cpd cpdVar = new cpd(this.A);
            cpdVar.c(cmhVarB);
            this.A = cpdVar.a();
        } else {
            if (this.x) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.m(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            cpp cppVar2 = this.A;
            this.B = cppVar2;
            con.b(this.n, cppVar2);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        ha haVar2 = (ha) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + haVar2.leftMargin + haVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + haVar2.topMargin + haVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ez ezVar;
        fn fnVar;
        this.F.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        gz gzVar = this.h;
        if (gzVar == null || (fnVar = (ezVar = (ez) gzVar).l) == null) {
            return;
        }
        fnVar.a();
        ezVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        gz gzVar = this.h;
        if (gzVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            ez ezVar = (ez) gzVar;
            ezVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (ezVar.k) {
                    ezVar.k = false;
                    ezVar.x(true);
                }
            } else if (!ezVar.k) {
                ezVar.k = true;
                ezVar.x(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = con.a;
        coe.b(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        gz gzVar = this.h;
        if (gzVar != null) {
            ((ez) gzVar).i = i;
        }
    }

    @Override // defpackage.iw
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.iw
    public final boolean q() {
        i();
        return this.H.k();
    }

    @Override // defpackage.iw
    public final boolean r() {
        hg hgVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (hgVar = actionMenuView.c) == null) {
            return false;
        }
        return hgVar.k != null || hgVar.l();
    }

    @Override // defpackage.iw
    public final boolean s() {
        i();
        return this.H.l();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.cnv
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.iw
    public final boolean u() {
        i();
        return this.H.m();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = true;
        this.x = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        cpp cppVar = cpp.a;
        this.y = cppVar;
        this.z = cppVar;
        this.A = cppVar;
        this.B = cppVar;
        this.j = new gy(this);
        this.D = new av(this, 12, null);
        this.E = new av(this, 13, null);
        v(context);
        this.F = new cnx();
        hb hbVar = new hb(context);
        this.G = hbVar;
        addView(hbVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ha(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.cnv
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
