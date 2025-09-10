package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;
import defpackage.aaa;
import defpackage.bur;
import defpackage.cla;
import defpackage.clb;
import defpackage.clc;
import defpackage.cld;
import defpackage.cle;
import defpackage.clf;
import defpackage.clg;
import defpackage.clh;
import defpackage.cnj;
import defpackage.cnl;
import defpackage.cnv;
import defpackage.cnw;
import defpackage.cnx;
import defpackage.cny;
import defpackage.coe;
import defpackage.cog;
import defpackage.col;
import defpackage.con;
import defpackage.cpp;
import defpackage.eod;
import defpackage.gno;
import defpackage.nwd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements cnv, cnw {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final cnj j;
    public cpp e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final gno h;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private boolean u;
    private Drawable v;
    private cny w;
    private final cnx x;
    private nwd y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new bur(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new cnl(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        t(this, view, 2, 1);
        int[] iArr = this.o;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    private final boolean B(clc clcVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? clcVar.j(this, view, motionEvent) : clcVar.g(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventE = null;
        boolean zB = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            clf clfVar = (clf) view.getLayoutParams();
            clc clcVar = clfVar.a;
            if (!zB || actionMasked == 0) {
                if (!zB && clcVar != null && (zB = B(clcVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            clc clcVar2 = ((clf) view2.getLayoutParams()).a;
                            if (clcVar2 != null) {
                                if (motionEventE == null) {
                                    motionEventE = E(motionEvent);
                                }
                                B(clcVar2, view2, motionEventE, i2);
                            }
                        }
                    }
                }
                if (clfVar.a == null) {
                    clfVar.m = false;
                }
                boolean z = clfVar.m;
            } else if (clcVar != null) {
                if (motionEventE == null) {
                    motionEventE = E(motionEvent);
                }
                B(clcVar, view, motionEventE, i2);
            }
        }
        list.clear();
        if (motionEventE != null) {
            motionEventE.recycle();
        }
        return zB;
    }

    private static final void D(int i2, Rect rect, Rect rect2, clf clfVar, int i3, int i4) {
        int i5 = clfVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int iS = s(clfVar.d);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & ScriptIntrinsicBLAS.TRANSPOSE;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(iS, i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & ScriptIntrinsicBLAS.TRANSPOSE;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void F(View view, int i2) {
        clf clfVar = (clf) view.getLayoutParams();
        int i3 = clfVar.i;
        if (i3 != i2) {
            int[] iArr = con.a;
            view.offsetLeftAndRight(i2 - i3);
            clfVar.i = i2;
        }
    }

    private static final void G(View view, int i2) {
        clf clfVar = (clf) view.getLayoutParams();
        int i3 = clfVar.j;
        if (i3 != i2) {
            int[] iArr = con.a;
            view.offsetTopAndBottom(i2 - i3);
            clfVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final clf l(View view) {
        clf clfVar = (clf) view.getLayoutParams();
        if (!clfVar.b) {
            if (view instanceof clb) {
                clc clcVarA = ((clb) view).a();
                if (clcVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                clfVar.b(clcVarA);
                clfVar.b = true;
                return clfVar;
            }
            cld cldVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cldVar = (cld) superclass.getAnnotation(cld.class);
                if (cldVar != null) {
                    break;
                }
            }
            if (cldVar != null) {
                try {
                    clfVar.b((clc) cldVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cldVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            clfVar.b = true;
        }
        return clfVar;
    }

    private final int n() {
        return p() - getHeight();
    }

    private final int o() {
        return -p();
    }

    private final int p() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            clf clfVar = (clf) childAt.getLayoutParams();
            height += childAt.getHeight() + clfVar.topMargin + clfVar.bottomMargin;
        }
        return height;
    }

    private final int q(int i2) {
        int[] iArr = this.r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int r() {
        return (int) (getHeight() * 0.2f);
    }

    private static int s(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & ScriptIntrinsicBLAS.TRANSPOSE) == 0 ? i2 | 48 : i2;
    }

    private static int u(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect v() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void w(clf clfVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + clfVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - clfVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + clfVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - clfVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void y() {
        View view = this.s;
        if (view != null) {
            clc clcVar = ((clf) view.getLayoutParams()).a;
            if (clcVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                clcVar.j(this, this.s, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((clf) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void z() {
        int[] iArr = con.a;
        if (!getFitsSystemWindows()) {
            cog.i(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new eod(this, 1);
        }
        cog.i(this, this.w);
        setSystemUiVisibility(1280);
    }

    public final List a(View view) {
        aaa aaaVar = (aaa) this.h.d;
        int i2 = aaaVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) aaaVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aaaVar.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList arrayListK = this.h.k(view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListK.size(); i2++) {
            View view2 = (View) arrayListK.get(i2);
            clc clcVar = ((clf) view2.getLayoutParams()).a;
            if (clcVar != null) {
                clcVar.l(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            clh.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof clf) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.cnv
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        clc clcVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                clf clfVar = (clf) childAt.getLayoutParams();
                if (clfVar.d(i4) && (clcVar = clfVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    clcVar.p(this, childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? A(-getHeight()) : A(-r());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? A(getHeight()) : A(r());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? A(o()) : A(n());
            }
            if (keyCode == 92) {
                return A(-getHeight());
            }
            if (keyCode == 93) {
                return A(getHeight());
            }
            if (keyCode == 122) {
                return A(o());
            }
            if (keyCode == 123) {
                return A(n());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        clc clcVar = ((clf) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.cnv
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.cnw
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        clc clcVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                clf clfVar = (clf) childAt.getLayoutParams();
                if (clfVar.d(i6) && (clcVar = clfVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    clcVar.q(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.cnv
    public final void g(View view, View view2, int i2, int i3) {
        this.x.b(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            clf clfVar = (clf) getChildAt(i4).getLayoutParams();
            if (clfVar.d(i3)) {
                clc clcVar = clfVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new clf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new clf(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.cnv
    public final void h(View view, int i2) {
        this.x.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            clf clfVar = (clf) childAt.getLayoutParams();
            if (clfVar.d(i2)) {
                clc clcVar = clfVar.a;
                if (clcVar != null) {
                    clcVar.f(this, childAt, view, i2);
                }
                clfVar.c(i2, false);
                clfVar.a();
            }
        }
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r22) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) {
        Rect rectV;
        Rect rectV2;
        clf clfVar = (clf) view.getLayoutParams();
        View view2 = clfVar.k;
        if (view2 == null && clfVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectV = v();
            rectV2 = v();
            try {
                clh.a(this, view2, rectV);
                clf clfVar2 = (clf) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                D(i2, rectV, rectV2, clfVar2, measuredWidth, measuredHeight);
                w(clfVar2, rectV2, measuredWidth, measuredHeight);
                view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
                return;
            } finally {
                x(rectV);
                x(rectV2);
            }
        }
        int i3 = clfVar.e;
        if (i3 < 0) {
            clf clfVar3 = (clf) view.getLayoutParams();
            rectV = v();
            rectV.set(getPaddingLeft() + clfVar3.leftMargin, getPaddingTop() + clfVar3.topMargin, (getWidth() - getPaddingRight()) - clfVar3.rightMargin, (getHeight() - getPaddingBottom()) - clfVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = con.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectV.left += this.e.b();
                    rectV.top += this.e.d();
                    rectV.right -= this.e.c();
                    rectV.bottom -= this.e.a();
                }
            }
            rectV2 = v();
            Gravity.apply(s(clfVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectV, rectV2, i2);
            view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
            return;
        }
        clf clfVar4 = (clf) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(u(clfVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & ScriptIntrinsicBLAS.TRANSPOSE;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iQ = q(i3) - measuredWidth2;
        if (i4 == 1) {
            iQ += measuredWidth2 / 2;
        } else if (i4 == 5) {
            iQ += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + clfVar4.leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth2) - clfVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + clfVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - clfVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public boolean k(View view, int i2, int i3) {
        Rect rectV = v();
        clh.a(this, view, rectV);
        try {
            return rectV.contains(i2, i3);
        } finally {
            x(rectV);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        if (this.u) {
            if (this.y == null) {
                this.y = new nwd(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.y);
        }
        if (this.e == null) {
            int[] iArr = con.a;
            if (getFitsSystemWindows()) {
                coe.b(this);
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        if (this.u && this.y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.y);
        }
        View view = this.t;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.v == null) {
            return;
        }
        cpp cppVar = this.e;
        int iD = cppVar != null ? cppVar.d() : 0;
        if (iD > 0) {
            this.v.setBounds(0, 0, getWidth(), iD);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y();
            actionMasked = 0;
        }
        boolean zC = C(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.s = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        clc clcVar;
        int layoutDirection = getLayoutDirection();
        List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((clcVar = ((clf) view.getLayoutParams()).a) == null || !clcVar.h(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Type inference failed for: r11v9, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [cnj, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                clf clfVar = (clf) childAt.getLayoutParams();
                if (clfVar.n) {
                    clc clcVar = clfVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        clc clcVar;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                clf clfVar = (clf) childAt.getLayoutParams();
                if (clfVar.n && (clcVar = clfVar.a) != null) {
                    zO |= clcVar.o(view);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof clg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        clg clgVar = (clg) parcelable;
        super.onRestoreInstanceState(clgVar.d);
        SparseArray sparseArray = clgVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            clc clcVar = l(childAt).a;
            if (id != -1 && clcVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                clcVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        clg clgVar = new clg(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            clc clcVar = ((clf) childAt.getLayoutParams()).a;
            if (id != -1 && clcVar != null && (parcelableS = clcVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        clgVar.a = sparseArray;
        return clgVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            clc clcVar = ((clf) view.getLayoutParams()).a;
            zC = clcVar != null ? clcVar.j(this, this.s, motionEvent) : false;
        } else {
            zC = C(motionEvent, 1);
            if (actionMasked != 0 && zC) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            zC |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventE = E(motionEvent);
            super.onTouchEvent(motionEventE);
            motionEventE.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.s = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        clc clcVar = ((clf) view.getLayoutParams()).a;
        if (clcVar == null || !clcVar.i(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                clc clcVar = ((clf) childAt.getLayoutParams()).a;
                if (clcVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    clcVar.g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        y();
        this.p = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.v;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.v.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.cnv
    public boolean t(View view, View view2, int i2, int i3) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        boolean z = false;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                clf clfVar = (clf) childAt.getLayoutParams();
                clc clcVar = clfVar.a;
                if (clcVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    boolean zT = clcVar.t(coordinatorLayout, childAt, view3, i4, i5);
                    z |= zT;
                    clfVar.c(i5, zT);
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    clfVar.c(i5, false);
                }
            } else {
                coordinatorLayout = this;
                view3 = view;
                i4 = i2;
                i5 = i3;
            }
            i6++;
            this = coordinatorLayout;
            view = view3;
            i2 = i4;
            i3 = i5;
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof clf ? new clf((clf) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new clf((ViewGroup.MarginLayoutParams) layoutParams) : new clf(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.h = new gno();
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.x = new cnx();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cla.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cla.a, i2, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i2 == 0) {
            int[] iArr = cla.a;
            int[] iArr2 = con.a;
            coordinatorLayout = this;
            context2 = context;
            col.b(coordinatorLayout, context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            int[] iArr3 = cla.a;
            int[] iArr4 = con.a;
            col.b(coordinatorLayout, context2, iArr3, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r11[i3] * f);
            }
        }
        coordinatorLayout.v = typedArray.getDrawable(1);
        typedArray.recycle();
        coordinatorLayout.z();
        super.setOnHierarchyChangeListener(new cle(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }
}
