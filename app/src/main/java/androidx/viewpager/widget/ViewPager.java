package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import defpackage.bur;
import defpackage.cog;
import defpackage.con;
import defpackage.cqh;
import defpackage.cqo;
import defpackage.dia;
import defpackage.dib;
import defpackage.dic;
import defpackage.did;
import defpackage.die;
import defpackage.dif;
import defpackage.dig;
import defpackage.dih;
import defpackage.dii;
import defpackage.ea;
import defpackage.kri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator p = new bur(4);
    private static final Interpolator q = new cqo(2);
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private final boolean F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private final Runnable S;
    private int T;
    public int b;
    public final ArrayList c;
    public dia d;
    public int e;
    public int f;
    public Parcelable g;
    public ClassLoader h;
    public dih i;
    public boolean j;
    public EdgeEffect k;
    public EdgeEffect l;
    public boolean m;
    public List n;
    public List o;
    private final did r;
    private final Rect s;
    private Scroller t;
    private boolean u;
    private float v;
    private float w;
    private boolean x;
    private boolean y;
    private final int z;

    public ViewPager(Context context) {
        super(context);
        this.c = new ArrayList();
        this.r = new did();
        this.s = new Rect();
        this.f = -1;
        this.g = null;
        this.h = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.z = 1;
        this.F = true;
        this.K = -1;
        this.m = true;
        this.S = new ea(this, 15);
        this.T = 0;
        p(context);
    }

    private final boolean A(int i) {
        if (this.c.size() == 0) {
            if (this.m) {
                return false;
            }
            this.Q = false;
            r(0, 0.0f);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        did didVarU = u();
        float fS = s();
        int i2 = didVarU.b;
        float f = (i / fS) - didVarU.e;
        float f2 = didVarU.d;
        this.Q = false;
        r(i2, f / (f2 + (0.0f / fS)));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean B(float f, float f2) {
        boolean z;
        float f3 = this.G - f;
        this.G = f;
        float width = f3 / getWidth();
        float height = f2 / getHeight();
        float fB = (cqh.a(this.k) != 0.0f ? -cqh.b(this.k, -width, 1.0f - height) : cqh.a(this.l) != 0.0f ? cqh.b(this.l, width, height) : 0.0f) * getWidth();
        float f4 = f3 - fB;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = fB != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float fS = s();
        float f5 = this.v * fS;
        float f6 = this.w * fS;
        ArrayList arrayList = this.c;
        did didVar = (did) arrayList.get(0);
        did didVar2 = (did) arrayList.get(arrayList.size() - 1);
        if (didVar.b != 0) {
            f5 = didVar.e * fS;
            z = false;
        } else {
            z = true;
        }
        if (didVar2.b != this.d.a() - 1) {
            f6 = didVar2.e * fS;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                cqh.b(this.k, (f5 - scrollX) / fS, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                cqh.b(this.l, (scrollX - f6) / fS, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else {
            z3 = z4;
        }
        int i = (int) scrollX;
        this.G += scrollX - i;
        scrollTo(i, getScrollY());
        A(i);
        return z3;
    }

    private final boolean C() {
        this.K = -1;
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        this.k.onRelease();
        this.l.onRelease();
        return (this.k.isFinished() && this.l.isFinished()) ? false : true;
    }

    private final void D() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int s() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect t(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.did u() {
        /*
            r14 = this;
            int r0 = r14.s()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r14.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L16
            float r0 = (float) r0
            float r0 = r1 / r0
            goto L17
        L16:
            r0 = r1
        L17:
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r3
            r10 = r4
            r9 = r5
            r7 = r6
            r6 = r1
        L20:
            java.util.ArrayList r11 = r14.c
            int r12 = r11.size()
            if (r8 >= r12) goto L68
            java.lang.Object r12 = r11.get(r8)
            did r12 = (defpackage.did) r12
            if (r9 != 0) goto L43
            int r13 = r12.b
            int r10 = r10 + r5
            if (r13 == r10) goto L43
            did r12 = r14.r
            float r1 = r1 + r6
            float r1 = r1 + r0
            r12.e = r1
            r12.b = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.d = r1
            int r8 = r8 + (-1)
        L43:
            r6 = r12
            float r1 = r6.e
            float r10 = r6.d
            float r10 = r10 + r1
            float r10 = r10 + r0
            if (r9 != 0) goto L50
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L68
        L50:
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 < 0) goto L67
            int r7 = r11.size()
            int r7 = r7 + r4
            if (r8 != r7) goto L5c
            goto L67
        L5c:
            int r10 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r7
            r7 = r6
            r6 = r9
            r9 = r3
            goto L20
        L67:
            return r6
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.u():did");
    }

    private final void v(boolean z) {
        boolean z2 = this.T == 2;
        if (z2) {
            z(false);
            if (!this.t.isFinished()) {
                this.t.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.t.getCurrX();
                int currY = this.t.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.j = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            did didVar = (did) arrayList.get(i);
            if (didVar.c) {
                didVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            if (!z) {
                this.S.run();
                return;
            }
            Runnable runnable = this.S;
            int[] iArr = con.a;
            postOnAnimation(runnable);
        }
    }

    private final void w(int i) {
        List list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                dig digVar = (dig) this.n.get(i2);
                if (digVar != null) {
                    digVar.b(i);
                }
            }
        }
    }

    private final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(i);
            this.K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void y(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int i3;
        int iAbs;
        did didVarC = c(i);
        int iS = didVarC != null ? (int) (s() * Math.max(this.v, Math.min(didVarC.e, this.w))) : 0;
        if (!z) {
            if (z2) {
                w(i);
            }
            v(false);
            scrollTo(iS, 0);
            A(iS);
            return;
        }
        if (getChildCount() == 0) {
            z(false);
        } else {
            Scroller scroller = this.t;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.u ? this.t.getCurrX() : this.t.getStartX();
                this.t.abortAnimation();
                z(false);
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iS - i4;
            int i6 = -scrollY;
            if (i5 != 0) {
                i3 = i5;
            } else if (i6 == 0) {
                v(false);
                f();
                k(0);
            } else {
                i3 = 0;
            }
            z(true);
            k(2);
            int iS2 = s();
            int i7 = iS2 / 2;
            float f = iS2;
            float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i3) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = Math.abs(i2);
            if (iAbs2 > 0) {
                float f2 = i7;
                iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
            } else {
                iAbs = (int) (((Math.abs(i3) / (f + 0.0f)) + 1.0f) * 100.0f);
            }
            int iMin = Math.min(iAbs, 600);
            this.u = false;
            this.t.startScroll(i4, scrollY, i3, i6, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            w(i);
        }
    }

    private final void z(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    final did a(int i, int i2) {
        did didVar = new did();
        didVar.b = i;
        dia diaVar = this.d;
        didVar.a = i == 0 ? ((kri) diaVar).b.r : ((kri) diaVar).b.s;
        didVar.d = 1.0f;
        if (i2 >= 0) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, didVar);
                return didVar;
            }
        }
        this.c.add(didVar);
        return didVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        did didVarB;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (didVarB = b(childAt)) != null && didVarB.b == this.e) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        did didVarB;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (didVarB = b(childAt)) != null && didVarB.b == this.e) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new die();
        }
        die dieVar = (die) layoutParams;
        boolean z = dieVar.a | (view.getClass().getAnnotation(dic.class) != null);
        dieVar.a = z;
        if (!this.x) {
            super.addView(view, i, layoutParams);
        } else {
            if (dieVar != null && z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dieVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    final did b(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return null;
            }
            did didVar = (did) arrayList.get(i);
            if (view == didVar.a) {
                return didVar;
            }
            i++;
        }
    }

    final did c(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 >= arrayList.size()) {
                return null;
            }
            did didVar = (did) arrayList.get(i2);
            if (didVar.b == i) {
                return didVar;
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.d == null) {
            return false;
        }
        int iS = s();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) iS) * this.v)) : i > 0 && scrollX < ((int) (((float) iS) * this.w));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof die) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.u = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            v(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.t.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(dig digVar) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(digVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.l(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r5 = r5.l(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.o()
            goto L5b
        L41:
            r6 = 66
            boolean r5 = r5.l(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r5 = r5.n()
            goto L5b
        L53:
            r6 = 17
            boolean r5 = r5.l(r6)
            goto L5b
        L5a:
            r5 = r2
        L5b:
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        did didVarB;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (didVarB = b(childAt)) != null && didVarB.b == this.e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        dia diaVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (diaVar = this.d) == null || diaVar.a() <= 1)) {
            this.k.finish();
            this.l.finish();
            return;
        }
        if (this.k.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.v * width);
            this.k.setSize(height, width);
            zDraw = this.k.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.l.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.w + 1.0f)) * width2);
            this.l.setSize(height2, width2);
            zDraw |= this.l.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() {
        int iA = this.d.a();
        this.b = iA;
        int i = this.z;
        ArrayList arrayList = this.c;
        boolean z = arrayList.size() < (i + i) + 1 && arrayList.size() < iA;
        int i2 = this.e;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            did didVar = (did) arrayList.get(i3);
            int i4 = ((kri) this.d).b.r == didVar.a ? 0 : 1;
            int i5 = didVar.b;
            if (i5 != i4) {
                if (i5 == this.e) {
                    i2 = i4;
                }
                didVar.b = i4;
                z = true;
            }
        }
        Collections.sort(arrayList, p);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                die dieVar = (die) getChildAt(i6).getLayoutParams();
                if (!dieVar.a) {
                    dieVar.c = 0.0f;
                }
            }
            i(i2, false, true);
            requestLayout();
        }
    }

    public final void f() {
        g(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x016f A[PHI: r4
      0x016f: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:97:0x0166, B:94:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new die();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new die(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public final void h(int i) {
        this.j = false;
        i(i, !this.m, false);
    }

    public final void i(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        j(i, z, z2, 0);
    }

    final void j(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        dia diaVar = this.d;
        if (diaVar == null || diaVar.a() <= 0) {
            z(false);
            return;
        }
        if (!z2 && this.e == i && this.c.size() != 0) {
            z(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.d.a()) {
            i = this.d.a() - 1;
        }
        int i3 = this.z;
        int i4 = this.e;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.c;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((did) arrayList.get(i5)).c = true;
                i5++;
            }
        }
        boolean z3 = this.e != i;
        if (!this.m) {
            g(i);
            y(i, z, i2, z3);
        } else {
            this.e = i;
            if (z3) {
                w(i);
            }
            requestLayout();
        }
    }

    public final void k(int i) {
        if (this.T == i) {
            return;
        }
        this.T = i;
        List list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                dig digVar = (dig) this.n.get(i2);
                if (digVar != null) {
                    digVar.a(i);
                }
            }
        }
    }

    public final boolean l(int i) throws Resources.NotFoundException {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zN = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zN = n();
            } else if (i == 66 || i == 2) {
                zN = o();
            }
        } else if (i == 17) {
            Rect rect = this.s;
            zN = (viewFindFocus == null || t(rect, viewFindNextFocus).left < t(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : n();
        } else if (i == 66) {
            Rect rect2 = this.s;
            zN = (viewFindFocus == null || t(rect2, viewFindNextFocus).left > t(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : o();
        }
        if (zN) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zN;
    }

    protected final boolean m(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    final boolean n() throws Resources.NotFoundException {
        int i = this.e;
        if (i <= 0) {
            return false;
        }
        q(i - 1);
        return true;
    }

    final boolean o() throws Resources.NotFoundException {
        if (this.d == null || this.e >= r0.a() - 1) {
            return false;
        }
        q(this.e + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            C();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.I = x;
            this.G = x;
            float y = motionEvent.getY();
            this.J = y;
            this.H = y;
            this.K = motionEvent.getPointerId(0);
            this.B = false;
            this.u = true;
            this.t.computeScrollOffset();
            if (this.T == 2 && Math.abs(this.t.getFinalX() - this.t.getCurrX()) > this.P) {
                this.t.abortAnimation();
                this.j = false;
                f();
                this.A = true;
                D();
                k(1);
            } else if (cqh.a(this.k) == 0.0f && cqh.a(this.l) == 0.0f) {
                v(false);
                this.A = false;
            } else {
                this.A = true;
                k(1);
                if (cqh.a(this.k) != 0.0f) {
                    cqh.b(this.k, 0.0f, 1.0f - (this.H / getHeight()));
                }
                if (cqh.a(this.l) != 0.0f) {
                    cqh.b(this.l, 0.0f, this.H / getHeight());
                }
            }
        } else {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
            if (action == 2) {
                int i = this.K;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.G;
                    float fAbs = Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.J);
                    if (f != 0.0f) {
                        float f2 = this.G;
                        if ((this.F || ((f2 >= this.D || f <= 0.0f) && (f2 <= getWidth() - this.D || f >= 0.0f))) && m(this, false, (int) f, (int) x2, (int) y2)) {
                            this.G = x2;
                            this.H = y2;
                            this.B = true;
                            return false;
                        }
                    }
                    float f3 = this.E;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.A = true;
                        D();
                        k(1);
                        this.G = f > 0.0f ? this.I + this.E : this.I - this.E;
                        this.H = y2;
                        z(true);
                    } else if (fAbs2 > f3) {
                        this.B = true;
                    }
                    if (this.A && B(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                x(motionEvent);
            }
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        die dieVar;
        die dieVar2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (dieVar2 = (die) childAt.getLayoutParams()) != null && dieVar2.a) {
                int i8 = dieVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & ScriptIntrinsicBLAS.TRANSPOSE;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (dieVar2.width != -2) {
                    i4 = dieVar2.width != -1 ? dieVar2.width : paddingLeft;
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (dieVar2.height != -2) {
                    i5 = dieVar2.height != -1 ? dieVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.x = true;
        f();
        this.x = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((dieVar = (die) childAt2.getLayoutParams()) == null || !dieVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dieVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        did didVarB;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (didVarB = b(childAt)) != null && didVarB.b == this.e && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof dii)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dii diiVar = (dii) parcelable;
        super.onRestoreInstanceState(diiVar.d);
        if (this.d != null) {
            Parcelable parcelable2 = diiVar.b;
            ClassLoader classLoader = diiVar.e;
            i(diiVar.a, false, true);
        } else {
            this.f = diiVar.a;
            this.g = diiVar.b;
            this.h = diiVar.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dii diiVar = new dii(super.onSaveInstanceState());
        diiVar.a = this.e;
        if (this.d != null) {
            diiVar.b = null;
        }
        return diiVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.c.isEmpty()) {
                if (!this.t.isFinished()) {
                    this.t.setFinalX(this.e * s());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            did didVarC = c(this.e);
            int iMin = (int) ((didVarC != null ? Math.min(didVarC.e, this.w) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                v(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    final void p(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.t = new Scroller(context, q);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.k = new EdgeEffect(context);
        this.l = new EdgeEffect(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (f + f);
        this.C = (int) (f * 16.0f);
        con.i(this, new dif(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        cog.i(this, new dib(this));
    }

    public final void q(int i) throws Resources.NotFoundException {
        this.j = false;
        i(i, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void r(int r13, float r14) {
        /*
            r12 = this;
            int r0 = r12.R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            die r9 = (defpackage.die) r9
            boolean r10 = r9.a
            if (r10 == 0) goto L67
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            java.util.List r0 = r12.n
            if (r0 == 0) goto L84
            int r0 = r0.size()
        L72:
            if (r1 >= r0) goto L84
            java.util.List r3 = r12.n
            java.lang.Object r3 = r3.get(r1)
            dig r3 = (defpackage.dig) r3
            if (r3 == 0) goto L81
            r3.c(r13, r14)
        L81:
            int r1 = r1 + 1
            goto L72
        L84:
            r12.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int, float):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new die();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.r = new did();
        this.s = new Rect();
        this.f = -1;
        this.g = null;
        this.h = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.z = 1;
        this.F = true;
        this.K = -1;
        this.m = true;
        this.S = new ea(this, 15);
        this.T = 0;
        p(context);
    }
}
