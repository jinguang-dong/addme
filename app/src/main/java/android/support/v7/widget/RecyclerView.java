package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import defpackage.a;
import defpackage.aaa;
import defpackage.byi;
import defpackage.byz;
import defpackage.cno;
import defpackage.cnp;
import defpackage.cnt;
import defpackage.cnu;
import defpackage.coj;
import defpackage.col;
import defpackage.con;
import defpackage.coq;
import defpackage.cqh;
import defpackage.cqj;
import defpackage.cqo;
import defpackage.ea;
import defpackage.ejs;
import defpackage.fc;
import defpackage.hl;
import defpackage.iv;
import defpackage.jd;
import defpackage.jk;
import defpackage.jm;
import defpackage.jo;
import defpackage.ki;
import defpackage.kk;
import defpackage.km;
import defpackage.kn;
import defpackage.kq;
import defpackage.kr;
import defpackage.ks;
import defpackage.kt;
import defpackage.ku;
import defpackage.kv;
import defpackage.kx;
import defpackage.kz;
import defpackage.lc;
import defpackage.ld;
import defpackage.le;
import defpackage.lf;
import defpackage.lg;
import defpackage.li;
import defpackage.ml;
import defpackage.nll;
import defpackage.ovo;
import defpackage.rnu;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements cnt {
    public static final /* synthetic */ int ad = 0;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public kn E;
    public int F;
    public int G;
    public ks H;
    public final int I;
    public float J;
    public float K;
    public final lf L;
    public jo M;
    public jm N;
    public final ld O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public li S;
    public final int[] T;
    final List U;
    boolean V;
    cno W;
    private cnu aA;
    private final int[] aB;
    private final int[] aC;
    private Runnable aD;
    private boolean aE;
    private int aF;
    private int aG;
    private final cnp aH;
    private rnu aI;
    private final rnu aJ;
    private byi aK;
    public ovo aa;
    ejs ab;
    public final byz ac;
    private final float ah;
    private final kx ai;
    private final Rect aj;
    private int ak;
    private boolean al;
    private int am;
    private final AccessibilityManager an;
    private int ao;
    private int ap;
    private int aq;
    private VelocityTracker ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private final int aw;
    private boolean ax;
    private List ay;
    private final int[] az;
    public final kv e;
    kz f;
    public iv g;
    boolean h;
    public final Runnable i;
    public final Rect j;
    public final RectF k;
    public ki l;
    public kq m;
    public final List n;
    public final ArrayList o;
    public final ArrayList p;
    public kt q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    private static final int[] ae = {R.attr.nestedScrollingEnabled};
    private static final float af = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;
    private static final Class[] ag = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final Interpolator c = new cqo(1);
    static final le d = new le();

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void I(View view, Rect rect) {
        kr krVar = (kr) view.getLayoutParams();
        Rect rect2 = krVar.d;
        rect.set((view.getLeft() - rect2.left) - krVar.leftMargin, (view.getTop() - rect2.top) - krVar.topMargin, view.getRight() + rect2.right + krVar.rightMargin, view.getBottom() + rect2.bottom + krVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect == null || cqh.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && cqh.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C.onRelease();
                } else {
                    float fB = cqh.b(this.C, width, height);
                    if (cqh.a(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A.onRelease();
            } else {
                float f3 = -cqh.b(this.A, -width, 1.0f - height);
                if (cqh.a(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final int aD(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || cqh.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && cqh.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D.onRelease();
                } else {
                    float fB = cqh.b(this.D, height, 1.0f - width);
                    if (cqh.a(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B.onRelease();
            } else {
                float f3 = -cqh.b(this.B, -height, width);
                if (cqh.a(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final cnu aE() {
        if (this.aA == null) {
            this.aA = new cnu(this);
        }
        return this.aA;
    }

    private final void aF() {
        aO();
        ae(0);
    }

    private final void aG() {
        View viewK;
        ld ldVar = this.O;
        ldVar.b(1);
        H(ldVar);
        ldVar.i = false;
        ag();
        byz byzVar = this.ac;
        byzVar.A();
        Q();
        aK();
        lg lgVarH = null;
        View focusedChild = (this.ax && hasFocus() && this.l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewK = k(focusedChild)) != null) {
            lgVarH = h(viewK);
        }
        if (lgVarH == null) {
            aN();
        } else {
            ldVar.m = this.l.b ? lgVarH.e : -1L;
            ldVar.l = this.y ? -1 : lgVarH.u() ? lgVarH.d : lgVarH.a();
            View focusedChild2 = lgVarH.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            ldVar.n = id;
        }
        ldVar.h = ldVar.j && this.Q;
        this.Q = false;
        this.P = false;
        ldVar.g = ldVar.k;
        ldVar.e = this.l.a();
        aI(this.az);
        if (ldVar.j) {
            int iA = this.g.a();
            for (int i = 0; i < iA; i++) {
                lg lgVarI = i(this.g.e(i));
                if (!lgVarI.z() && (!lgVarI.s() || this.l.b)) {
                    kn.s(lgVarI);
                    lgVarI.c();
                    byzVar.z(lgVarI, kn.r(lgVarI));
                    if (ldVar.h && lgVarI.x() && !lgVarI.u() && !lgVarI.z() && !lgVarI.s()) {
                        byzVar.x(e(lgVarI), lgVarI);
                    }
                }
            }
        }
        if (ldVar.k) {
            int iC = this.g.c();
            for (int i2 = 0; i2 < iC; i2++) {
                lg lgVarI2 = i(this.g.f(i2));
                if (!lgVarI2.z() && lgVarI2.d == -1) {
                    lgVarI2.d = lgVarI2.c;
                }
            }
            boolean z = ldVar.f;
            ldVar.f = false;
            this.m.o(this.e, ldVar);
            ldVar.f = z;
            for (int i3 = 0; i3 < this.g.a(); i3++) {
                lg lgVarI3 = i(this.g.e(i3));
                if (!lgVarI3.z()) {
                    aaa aaaVar = (aaa) byzVar.a;
                    ml mlVar = (ml) aaaVar.get(lgVarI3);
                    if (mlVar == null || (mlVar.b & 4) == 0) {
                        kn.s(lgVarI3);
                        boolean zP = lgVarI3.p(8192);
                        lgVarI3.c();
                        km kmVarR = kn.r(lgVarI3);
                        if (zP) {
                            W(lgVarI3, kmVarR);
                        } else {
                            ml mlVarA = (ml) aaaVar.get(lgVarI3);
                            if (mlVarA == null) {
                                mlVarA = ml.a();
                                aaaVar.put(lgVarI3, mlVarA);
                            }
                            mlVarA.b |= 2;
                            mlVarA.c = kmVarR;
                        }
                    }
                }
            }
            v();
        } else {
            v();
        }
        R();
        ah(false);
        ldVar.d = 2;
    }

    private final void aH() {
        ag();
        Q();
        ld ldVar = this.O;
        ldVar.b(6);
        this.aa.f();
        ldVar.e = this.l.a();
        ldVar.c = 0;
        kz kzVar = this.f;
        if (kzVar != null) {
            int i = this.l.c;
            Parcelable parcelable = kzVar.a;
            if (parcelable != null) {
                this.m.T(parcelable);
            }
            this.f = null;
        }
        ldVar.g = false;
        this.m.o(this.e, ldVar);
        ldVar.f = false;
        ldVar.j = ldVar.j && this.E != null;
        ldVar.d = 4;
        R();
        ah(false);
    }

    private final void aI(int[] iArr) {
        int iA = this.g.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            lg lgVarI = i(this.g.e(i3));
            if (!lgVarI.z()) {
                int iB = lgVarI.b();
                if (iB < i2) {
                    i2 = iB;
                }
                if (iB > i) {
                    i = iB;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aJ(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aq) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aq = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.au = x;
            this.as = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.av = y;
            this.at = y;
        }
    }

    private final void aK() {
        boolean z;
        if (this.y) {
            this.aa.k();
            if (this.z) {
                this.m.x();
            }
        }
        if (aS()) {
            this.aa.h();
        } else {
            this.aa.f();
        }
        boolean z2 = this.P || this.Q;
        ld ldVar = this.O;
        boolean z3 = this.t && this.E != null && ((z = this.y) || z2 || this.m.u) && (!z || this.l.b);
        ldVar.j = z3;
        ldVar.k = z3 && z2 && !this.y && aS();
    }

    private final void aL() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aM(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.j;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof kr) {
            kr krVar = (kr) layoutParams;
            if (!krVar.e) {
                Rect rect2 = krVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        kq kqVar = this.m;
        boolean z2 = !this.t;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        kqVar.bc(recyclerView, view3, rect, z2, z);
    }

    private final void aN() {
        ld ldVar = this.O;
        ldVar.m = -1L;
        ldVar.l = -1;
        ldVar.n = -1;
    }

    private final void aO() {
        VelocityTracker velocityTracker = this.ar;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ai(0);
        aL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aP(int i) {
        boolean zX = this.m.X();
        int i2 = zX;
        if (this.m.Y()) {
            i2 = (zX ? 1 : 0) | 2;
        }
        ay(i2, i);
    }

    private final void aQ() {
        lc lcVar;
        this.L.d();
        kq kqVar = this.m;
        if (kqVar == null || (lcVar = kqVar.t) == null) {
            return;
        }
        lcVar.f();
    }

    private final boolean aR(MotionEvent motionEvent) {
        ArrayList arrayList = this.p;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kt ktVar = (kt) arrayList.get(i);
            if (ktVar.g(motionEvent) && action != 3) {
                this.q = ktVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aS() {
        return this.E != null && this.m.u();
    }

    private final boolean aT(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = cqh.a(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ah * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = af;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fA;
    }

    private final void aU(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(kq.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ag);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ad((kq) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.bB(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final ejs aV() {
        if (this.ab == null) {
            this.ab = new ejs((View) this, (byte[]) null);
        }
        return this.ab;
    }

    public static final int as(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && cqh.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * cqh.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || cqh.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * cqh.b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static final long at() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    public static lg i(View view) {
        if (view == null) {
            return null;
        }
        return ((kr) view.getLayoutParams()).c;
    }

    public static RecyclerView j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewJ = j(viewGroup.getChildAt(i));
            if (recyclerViewJ != null) {
                return recyclerViewJ;
            }
        }
        return null;
    }

    public static void u(lg lgVar) {
        WeakReference weakReference = lgVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == lgVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            lgVar.b = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0328  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void A() {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.A():void");
    }

    public final void B(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aE().g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void C(int i, int i2) {
        this.ap++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        T(i, i2);
        List list = this.ay;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((kk) this.ay.get(size)).a(this, i, i2);
                }
            }
        }
        this.ap--;
    }

    public final void D() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectCE = this.aK.cE(this);
        this.D = edgeEffectCE;
        if (this.h) {
            edgeEffectCE.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCE.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void E() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectCE = this.aK.cE(this);
        this.A = edgeEffectCE;
        if (this.h) {
            edgeEffectCE.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCE.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void F() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectCE = this.aK.cE(this);
        this.C = edgeEffectCE;
        if (this.h) {
            edgeEffectCE.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCE.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void G() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectCE = this.aK.cE(this);
        this.B = edgeEffectCE;
        if (this.h) {
            edgeEffectCE.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCE.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void H(ld ldVar) {
        if (this.F != 2) {
            ldVar.o = 0;
            ldVar.p = 0;
        } else {
            OverScroller overScroller = this.L.a;
            ldVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            ldVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void J() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void K() {
        if (this.o.size() == 0) {
            return;
        }
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.P("Cannot invalidate item decorations during a scroll or layout");
        }
        M();
        requestLayout();
    }

    public final void L(int i) {
        if (this.m == null) {
            return;
        }
        ae(2);
        this.m.U(i);
        awakenScrollBars();
    }

    final void M() {
        int iC = this.g.c();
        for (int i = 0; i < iC; i++) {
            ((kr) this.g.f(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kr krVar = (kr) ((lg) arrayList.get(i2)).a.getLayoutParams();
            if (krVar != null) {
                krVar.e = true;
            }
        }
    }

    public final void N(int i) {
        int iA = this.g.a();
        for (int i2 = 0; i2 < iA; i2++) {
            this.g.e(i2).offsetLeftAndRight(i);
        }
    }

    public final void O(int i) {
        int iA = this.g.a();
        for (int i2 = 0; i2 < iA; i2++) {
            this.g.e(i2).offsetTopAndBottom(i);
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3;
        int iC = this.g.c();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iC) {
                break;
            }
            lg lgVarI = i(this.g.f(i4));
            if (lgVarI != null && !lgVarI.z()) {
                int i5 = lgVarI.c;
                if (i5 >= i3) {
                    lgVarI.j(-i2, z);
                    this.O.f = true;
                } else if (i5 >= i) {
                    lgVarI.e(8);
                    lgVarI.j(-i2, z);
                    lgVarI.c = i - 1;
                    this.O.f = true;
                }
            }
            i4++;
        }
        kv kvVar = this.e;
        ArrayList arrayList = kvVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            lg lgVar = (lg) arrayList.get(size);
            if (lgVar != null) {
                int i6 = lgVar.c;
                if (i6 >= i3) {
                    lgVar.j(-i2, z);
                } else if (i6 >= i) {
                    lgVar.e(8);
                    kvVar.i(size);
                }
            }
        }
    }

    public final void Q() {
        this.ao++;
    }

    final void R() {
        S(true);
    }

    public final void S(boolean z) {
        int i;
        int i2 = this.ao - 1;
        this.ao = i2;
        if (i2 <= 0) {
            this.ao = 0;
            if (z) {
                int i3 = this.am;
                this.am = 0;
                if (i3 != 0 && ap()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.U;
                for (int size = list.size() - 1; size >= 0; size--) {
                    lg lgVar = (lg) list.get(size);
                    View view = lgVar.a;
                    if (view.getParent() == this && !lgVar.z() && (i = lgVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        lgVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public void T(int i, int i2) {
    }

    public final void U() {
        if (this.R || !this.r) {
            return;
        }
        Runnable runnable = this.aD;
        int[] iArr = con.a;
        postOnAnimation(runnable);
        this.R = true;
    }

    public final void V(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iC = this.g.c();
        for (int i = 0; i < iC; i++) {
            lg lgVarI = i(this.g.f(i));
            if (lgVarI != null && !lgVarI.z()) {
                lgVarI.e(6);
            }
        }
        M();
        kv kvVar = this.e;
        ArrayList arrayList = kvVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lg lgVar = (lg) arrayList.get(i2);
            if (lgVar != null) {
                lgVar.e(6);
                lgVar.d(null);
            }
        }
        ki kiVar = kvVar.f.l;
        if (kiVar == null || !kiVar.b) {
            kvVar.h();
        }
    }

    public final void W(lg lgVar, km kmVar) {
        lgVar.l(0, 8192);
        if (this.O.h && lgVar.x() && !lgVar.u() && !lgVar.z()) {
            this.ac.x(e(lgVar), lgVar);
        }
        this.ac.z(lgVar, kmVar);
    }

    public final void X() {
        kn knVar = this.E;
        if (knVar != null) {
            knVar.c();
        }
        kq kqVar = this.m;
        if (kqVar != null) {
            kv kvVar = this.e;
            kqVar.aO(kvVar);
            this.m.aP(kvVar);
        }
        this.e.d();
    }

    public final void Y(int i, int i2, int[] iArr) {
        lg lgVar;
        ag();
        Q();
        Trace.beginSection("RV Scroll");
        ld ldVar = this.O;
        H(ldVar);
        int iD = i != 0 ? this.m.d(i, this.e, ldVar) : 0;
        int iE = i2 != 0 ? this.m.e(i2, this.e, ldVar) : 0;
        Trace.endSection();
        int iA = this.g.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewE = this.g.e(i3);
            lg lgVarH = h(viewE);
            if (lgVarH != null && (lgVar = lgVarH.i) != null) {
                int left = viewE.getLeft();
                int top = viewE.getTop();
                View view = lgVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R();
        ah(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void Z(int i) {
        if (this.v) {
            return;
        }
        aj();
        kq kqVar = this.m;
        if (kqVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kqVar.U(i);
            awakenScrollBars();
        }
    }

    public final void aA(kk kkVar) {
        List list = this.ay;
        if (list != null) {
            list.remove(kkVar);
        }
    }

    public final void aB(byi byiVar) {
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.P("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(byiVar);
        M();
        requestLayout();
    }

    public final void aC(byi byiVar) {
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.P("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.o;
        arrayList.remove(byiVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        M();
        requestLayout();
    }

    public final void aa(li liVar) {
        this.S = liVar;
        con.i(this, liVar);
    }

    public void ab(ki kiVar) {
        suppressLayout(false);
        ki kiVar2 = this.l;
        if (kiVar2 != null) {
            kiVar2.n(this.ai);
            this.l.l();
        }
        X();
        this.aa.k();
        ki kiVar3 = this.l;
        this.l = kiVar;
        if (kiVar != null) {
            kiVar.m(this.ai);
            kiVar.h(this);
        }
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.bo();
        }
        kv kvVar = this.e;
        ki kiVar4 = this.l;
        kvVar.d();
        kvVar.f(kiVar3, true);
        nll nllVarP = kvVar.p();
        if (kiVar3 != null) {
            nllVarP.a--;
        }
        if (nllVarP.a == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) nllVarP.b;
                if (i >= sparseArray.size()) {
                    break;
                }
                ArrayList arrayList = ((ku) sparseArray.valueAt(i)).a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    col.c(((lg) arrayList.get(i2)).a);
                }
                arrayList.clear();
                i++;
            }
        }
        if (kiVar4 != null) {
            nllVarP.a++;
        }
        kvVar.e();
        this.O.f = true;
        V(false);
        requestLayout();
    }

    public final void ac(kn knVar) {
        kn knVar2 = this.E;
        if (knVar2 != null) {
            knVar2.c();
            this.E.l = null;
        }
        this.E = knVar;
        if (knVar != null) {
            knVar.l = this.aI;
        }
    }

    public final void ad(kq kqVar) {
        if (kqVar == this.m) {
            return;
        }
        aj();
        if (this.m != null) {
            kn knVar = this.E;
            if (knVar != null) {
                knVar.c();
            }
            kq kqVar2 = this.m;
            kv kvVar = this.e;
            kqVar2.aO(kvVar);
            this.m.aP(kvVar);
            kvVar.d();
            if (this.r) {
                this.m.br(this);
            }
            this.m.aY(null);
            this.m = null;
        } else {
            this.e.d();
        }
        iv ivVar = this.g;
        ivVar.a.d();
        List list = ivVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ivVar.e.z((View) list.get(size));
            list.remove(size);
        }
        rnu rnuVar = ivVar.e;
        int iW = rnuVar.w();
        for (int i = 0; i < iW; i++) {
            View viewY = rnuVar.y(i);
            ((RecyclerView) rnuVar.a).z(viewY);
            viewY.clearAnimation();
        }
        ((RecyclerView) rnuVar.a).removeAllViews();
        this.m = kqVar;
        if (kqVar != null) {
            if (kqVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + kqVar + " is already attached to a RecyclerView:" + kqVar.s.l());
            }
            this.m.aY(this);
            if (this.r) {
                this.m.aI(this);
            }
        }
        this.e.n();
        requestLayout();
    }

    public final void ae(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        if (i != 2) {
            aQ();
        }
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.aN(i);
        }
        List list = this.ay;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((kk) this.ay.get(size)).c(this, i);
            }
        }
    }

    public void af(int i) {
        if (this.v) {
            return;
        }
        kq kqVar = this.m;
        if (kqVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kqVar.al(this, i);
        }
    }

    public final void ag() {
        int i = this.ak + 1;
        this.ak = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void ah(boolean z) {
        int i = this.ak;
        if (i <= 0) {
            this.ak = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.m != null && this.l != null) {
                A();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.ak--;
    }

    public final void ai(int i) {
        aE().b(i);
    }

    public final void aj() {
        ae(0);
        aQ();
    }

    public final boolean al(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aE().e(i, i2, iArr, iArr2, i3);
    }

    public boolean am(int i, int i2) {
        return an(i, i2, this.I, this.aw);
    }

    public final boolean an(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        kq kqVar = this.m;
        if (kqVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zX = kqVar.X();
        boolean zY = kqVar.Y();
        if (!zX || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zY || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || cqh.a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && cqh.a(edgeEffect2) != 0.0f) {
                    if (aT(this.C, i, getWidth())) {
                        this.C.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i7 = -i;
                if (aT(this.A, i7, getWidth())) {
                    this.A.onAbsorb(i7);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || cqh.a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 != null && cqh.a(edgeEffect4) != 0.0f) {
                    if (aT(this.D, i2, getHeight())) {
                        this.D.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i8 = -i2;
                if (aT(this.B, i8, getHeight())) {
                    this.B.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            aP(1);
            this.L.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i92 = -i4;
            iMax = Math.max(i92, Math.min(i5, i4));
            iMax2 = Math.max(i92, Math.min(i2, i4));
            aP(1);
            this.L.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zX || zY;
            dispatchNestedFling(f, f2, z);
            ks ksVar = this.H;
            if (ksVar != null && ksVar.g(i, i6)) {
                return true;
            }
            if (z) {
                int i10 = -i4;
                aP(1);
                this.L.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean ao() {
        return !this.t || this.y || this.aa.m();
    }

    public final boolean ap() {
        AccessibilityManager accessibilityManager = this.an;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean aq() {
        return this.ao > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ar(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ar(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void au(lg lgVar, int i) {
        if (!aq()) {
            lgVar.a.setImportantForAccessibility(i);
        } else {
            lgVar.p = i;
            this.U.add(lgVar);
        }
    }

    public final void av() {
        this.s = true;
    }

    public final void aw(int i, int i2) {
        ax(i, i2, false);
    }

    public final void ax(int i, int i2, boolean z) {
        kq kqVar = this.m;
        if (kqVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != kqVar.X()) {
            i = 0;
        }
        if (true != kqVar.Y()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            ay(i3, 1);
        }
        this.L.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void ay(int i, int i2) {
        aE().i(i, i2);
    }

    public final void az(kk kkVar) {
        if (this.ay == null) {
            this.ay = new ArrayList();
        }
        this.ay.add(kkVar);
    }

    public final int b(lg lgVar) {
        int i;
        if (lgVar.p(524) || !lgVar.r()) {
            return -1;
        }
        ovo ovoVar = this.aa;
        int i2 = lgVar.c;
        ArrayList arrayList = (ArrayList) ovoVar.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            hl hlVar = (hl) arrayList.get(i3);
            int i4 = hlVar.a;
            if (i4 != 1) {
                if (i4 == 2 && (i = hlVar.b) <= i2) {
                    int i5 = hlVar.d;
                    if (i + i5 > i2) {
                        return -1;
                    }
                    i2 -= i5;
                }
            } else if (hlVar.b <= i2) {
                i2 += hlVar.d;
            }
        }
        return i2;
    }

    public final int c(View view) {
        lg lgVarI = i(view);
        if (lgVarI != null) {
            return lgVarI.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof kr) && this.m.s((kr) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.X()) {
            return kqVar.A(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.X()) {
            return kqVar.B(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.X()) {
            return kqVar.C(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.Y()) {
            return kqVar.D(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.Y()) {
            return kqVar.E(this.O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        kq kqVar = this.m;
        if (kqVar != null && kqVar.Y()) {
            return kqVar.F(this.O);
        }
        return 0;
    }

    public final int d() {
        return this.o.size();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        kq kqVar = this.m;
        int iA = 0;
        if (kqVar == null) {
            return false;
        }
        if (kqVar.Y()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aw(0, measuredHeight);
                } else {
                    aw(0, -measuredHeight);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAb = kqVar.ab();
                if (keyCode == 122) {
                    if (zAb) {
                        iA = this.l.a();
                    }
                } else if (!zAb) {
                    iA = this.l.a();
                }
                af(iA);
                return true;
            }
        } else if (kqVar.X()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aw(measuredWidth, 0);
                } else {
                    aw(-measuredWidth, 0);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAb2 = kqVar.ab();
                if (keyCode2 == 122) {
                    if (zAb2) {
                        iA = this.l.a();
                    }
                } else if (!zAb2) {
                    iA = this.l.a();
                }
                af(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aE().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aE().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aE().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aE().f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((byi) arrayList.get(i)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long e(lg lgVar) {
        return this.l.b ? lgVar.e : lgVar.c;
    }

    public final Rect f(View view) {
        kr krVar = (kr) view.getLayoutParams();
        if (!krVar.e) {
            return krVar.d;
        }
        ld ldVar = this.O;
        if (ldVar.g && (krVar.b() || krVar.c.s())) {
            return krVar.d;
        }
        Rect rect = krVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((byi) arrayList.get(i)).bG(rect2, view, this, ldVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        krVar.e = false;
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0166, code lost:
    
        if (r16 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0184, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0187, code lost:
    
        if (r16 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018a, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x019a, code lost:
    
        if ((r5 * r13) >= 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final lg g(int i) {
        lg lgVar = null;
        if (this.y) {
            return null;
        }
        int iC = this.g.c();
        for (int i2 = 0; i2 < iC; i2++) {
            lg lgVarI = i(this.g.f(i2));
            if (lgVarI != null && !lgVarI.u() && b(lgVarI) == i) {
                if (!this.g.k(lgVarI.a)) {
                    return lgVarI;
                }
                lgVar = lgVarI;
            }
        }
        return lgVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        kq kqVar = this.m;
        if (kqVar != null) {
            return kqVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        kq kqVar = this.m;
        if (kqVar != null) {
            return kqVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.h;
    }

    public final lg h(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i(view);
        }
        throw new IllegalArgumentException(a.bC(this, view, "View ", " is not a direct child of "));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aE().h(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aE().a;
    }

    public final View k(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final String l() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ao = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        this.e.e();
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.aI(this);
        }
        this.R = false;
        if (b) {
            ThreadLocal threadLocal = jo.a;
            jo joVar = (jo) threadLocal.get();
            this.M = joVar;
            if (joVar == null) {
                this.M = new jo();
                int[] iArr = con.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                jo joVar2 = this.M;
                joVar2.e = (long) (1.0E9f / f);
                threadLocal.set(joVar2);
            }
            this.M.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        jo joVar;
        super.onDetachedFromWindow();
        kn knVar = this.E;
        if (knVar != null) {
            knVar.c();
        }
        aj();
        this.r = false;
        kq kqVar = this.m;
        if (kqVar != null) {
            kqVar.br(this);
        }
        this.U.clear();
        removeCallbacks(this.aD);
        while (ml.a.a() != null) {
        }
        kv kvVar = this.e;
        int i = 0;
        while (true) {
            ArrayList arrayList = kvVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            col.c(((lg) arrayList.get(i)).a);
            i++;
        }
        kvVar.f(kvVar.f.l, false);
        Iterator itA = new coq(this, 1).a();
        while (itA.hasNext()) {
            col.g((View) itA.next()).t();
        }
        if (!b || (joVar = this.M) == null) {
            return;
        }
        joVar.c.remove(this);
        this.M = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((byi) arrayList.get(i)).bH(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.q = null;
        if (aR(motionEvent)) {
            aF();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kt ktVar = (kt) arrayList.get(i);
                if (ktVar != null && ktVar != this.q) {
                    ktVar.g(motionEventObtain);
                }
            }
            return true;
        }
        kq kqVar = this.m;
        if (kqVar == null) {
            return false;
        }
        boolean zX = kqVar.X();
        boolean zY = kqVar.Y();
        if (this.ar == null) {
            this.ar = VelocityTracker.obtain();
        }
        this.ar.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.al) {
                this.al = false;
            }
            this.aq = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.au = x;
            this.as = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.av = y;
            this.at = y;
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || cqh.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                cqh.b(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && cqh.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                cqh.b(this.C, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && cqh.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                cqh.b(this.B, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.D;
            if (edgeEffect4 == null || cqh.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.F == 2) {
                }
                int[] iArr = this.aC;
                iArr[1] = 0;
                iArr[0] = 0;
                aP(0);
            } else {
                cqh.b(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            ae(1);
            ai(1);
            int[] iArr2 = this.aC;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aP(0);
        } else if (actionMasked == 1) {
            this.ar.clear();
            ai(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.aq);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.aq + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.F != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.as;
                int i5 = i2 - this.at;
                if (!zX || Math.abs(i4) <= this.G) {
                    z2 = false;
                } else {
                    this.au = i3;
                    z2 = true;
                }
                if (zY && Math.abs(i5) > this.G) {
                    this.av = i2;
                } else if (z2) {
                }
                ae(1);
            }
        } else if (actionMasked == 3) {
            aF();
        } else if (actionMasked == 5) {
            this.aq = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.au = x3;
            this.as = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.av = y3;
            this.at = y3;
        } else if (actionMasked == 6) {
            aJ(motionEvent);
        }
        return this.F == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        A();
        Trace.endSection();
        this.t = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        kq kqVar = this.m;
        if (kqVar == null) {
            y(i, i2);
            return;
        }
        boolean z = false;
        if (kqVar.Z()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            kq kqVar2 = this.m;
            ld ldVar = this.O;
            kqVar2.bp(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aE = z;
            if (z || this.l == null) {
                return;
            }
            if (ldVar.d == 1) {
                aG();
            }
            this.m.aV(i, i2);
            ldVar.i = true;
            aH();
            this.m.aX(i, i2);
            if (this.m.ad()) {
                this.m.aV(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                ldVar.i = true;
                aH();
                this.m.aX(i, i2);
            }
            this.aF = getMeasuredWidth();
            this.aG = getMeasuredHeight();
            return;
        }
        if (this.s) {
            kqVar.bp(i, i2);
            return;
        }
        if (this.w) {
            ag();
            Q();
            aK();
            R();
            ld ldVar2 = this.O;
            if (ldVar2.k) {
                ldVar2.g = true;
            } else {
                this.aa.f();
                ldVar2.g = false;
            }
            this.w = false;
            ah(false);
        } else if (this.O.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        ki kiVar = this.l;
        if (kiVar != null) {
            this.O.e = kiVar.a();
        } else {
            this.O.e = 0;
        }
        ag();
        kq kqVar3 = this.m;
        ld ldVar3 = this.O;
        kqVar3.bp(i, i2);
        ah(false);
        ldVar3.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (aq()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kz kzVar = (kz) parcelable;
        this.f = kzVar;
        super.onRestoreInstanceState(kzVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        kz kzVar = new kz(super.onSaveInstanceState());
        kz kzVar2 = this.f;
        if (kzVar2 != null) {
            kzVar.a = kzVar2.a;
            return kzVar;
        }
        kq kqVar = this.m;
        if (kqVar != null) {
            kzVar.a = kqVar.M();
            return kzVar;
        }
        kzVar.a = null;
        return kzVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        J();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void r(lg lgVar) {
        View view = lgVar.a;
        ViewParent parent = view.getParent();
        this.e.m(h(view));
        if (lgVar.w()) {
            this.g.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.g.g(view, -1, true);
            return;
        }
        iv ivVar = this.g;
        int iX = ivVar.e.x(view);
        if (iX < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        ivVar.a.e(iX);
        ivVar.j(view);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        lg lgVarI = i(view);
        if (lgVarI != null) {
            if (lgVarI.w()) {
                lgVarI.i();
            } else if (!lgVarI.z()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + lgVarI + l());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.bb() && !aq() && view2 != null) {
            aM(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.bc(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kt) arrayList.get(i)).h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ak != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(kt ktVar) {
        this.p.add(ktVar);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        kq kqVar = this.m;
        if (kqVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zX = kqVar.X();
        boolean zY = kqVar.Y();
        if (!zX) {
            if (!zY) {
                return;
            } else {
                zY = true;
            }
        }
        ar(true != zX ? 0 : i, true != zY ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!aq()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.am |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.h) {
            J();
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aE().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aE().i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aE().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            t("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.al = true;
                aj();
                return;
            }
            this.v = false;
            if (this.u && this.m != null && this.l != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(String str) {
        if (aq()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(l()));
        }
        if (this.ap > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(l())));
        }
    }

    final void v() {
        int iC = this.g.c();
        for (int i = 0; i < iC; i++) {
            lg lgVarI = i(this.g.f(i));
            if (!lgVarI.z()) {
                lgVarI.f();
            }
        }
        kv kvVar = this.e;
        ArrayList arrayList = kvVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((lg) arrayList.get(i2)).f();
        }
        ArrayList arrayList2 = kvVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((lg) arrayList2.get(i3)).f();
        }
        ArrayList arrayList3 = kvVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((lg) kvVar.b.get(i4)).f();
            }
        }
    }

    public final void w(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void x() {
        if (!this.t || this.y) {
            Trace.beginSection("RV FullInvalidate");
            A();
            Trace.endSection();
            return;
        }
        if (this.aa.m()) {
            if (!this.aa.l(4) || this.aa.l(11)) {
                if (this.aa.m()) {
                    Trace.beginSection("RV FullInvalidate");
                    A();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            ag();
            Q();
            this.aa.h();
            if (!this.u) {
                int iA = this.g.a();
                int i = 0;
                while (true) {
                    if (i < iA) {
                        lg lgVarI = i(this.g.e(i));
                        if (lgVarI != null && !lgVarI.z() && lgVarI.x()) {
                            A();
                            break;
                        }
                        i++;
                    } else {
                        this.aa.e();
                        break;
                    }
                }
            }
            ah(true);
            R();
            Trace.endSection();
        }
    }

    public final void y(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = con.a;
        setMeasuredDimension(kq.am(i, paddingLeft, getMinimumWidth()), kq.am(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void z(View view) {
        i(view);
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        TypedArray typedArray;
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.ai = new kx(recyclerView);
        recyclerView.e = new kv(recyclerView);
        recyclerView.ac = new byz((short[]) null, (byte[]) null);
        recyclerView.i = new ea(recyclerView, 2);
        recyclerView.j = new Rect();
        recyclerView.aj = new Rect();
        recyclerView.k = new RectF();
        recyclerView.n = new ArrayList();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.ak = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.ao = 0;
        recyclerView.ap = 0;
        recyclerView.aK = d;
        recyclerView.E = new jd();
        recyclerView.F = 0;
        recyclerView.aq = -1;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.K = Float.MIN_VALUE;
        recyclerView.ax = true;
        recyclerView.L = new lf(recyclerView);
        recyclerView.N = b ? new jm() : null;
        recyclerView.O = new ld();
        recyclerView.P = false;
        recyclerView.Q = false;
        recyclerView.aI = new rnu(recyclerView);
        recyclerView.R = false;
        recyclerView.az = new int[2];
        recyclerView.aB = new int[2];
        recyclerView.aC = new int[2];
        recyclerView.T = new int[2];
        recyclerView.U = new ArrayList();
        recyclerView.aD = new ea(recyclerView, 3);
        recyclerView.aF = 0;
        recyclerView.aG = 0;
        recyclerView.aJ = new rnu(recyclerView);
        cqj cqjVar = new cqj(recyclerView, 1);
        recyclerView.aH = cqjVar;
        recyclerView.W = new cno(recyclerView.getContext(), cqjVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.G = viewConfiguration.getScaledTouchSlop();
        recyclerView.J = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.K = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.I = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.aw = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ah = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.l = recyclerView.aI;
        recyclerView.aa = new ovo(new rnu(recyclerView));
        recyclerView.g = new iv(new rnu(recyclerView));
        int[] iArr = con.a;
        if (coj.a(recyclerView) == 0) {
            coj.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.an = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.aa(new li(recyclerView));
        int[] iArr2 = fc.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        col.b(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                typedArray = typedArrayObtainStyledAttributes;
                new jk(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.ar.core.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.ar.core.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.ar.core.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException(mPfBwqXsnpXI.hGwCWpmQ.concat(recyclerView.l()));
            }
        } else {
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        recyclerView.V = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aU(context, string, attributeSet, i);
        int[] iArr3 = ae;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        col.b(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.ar.core.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        kq kqVar = this.m;
        if (kqVar != null) {
            return kqVar.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }
}
