package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.clf;
import defpackage.con;
import defpackage.cps;
import defpackage.cqq;
import defpackage.cqr;
import defpackage.cvn;
import defpackage.na;
import defpackage.ng;
import defpackage.rhn;
import defpackage.riu;
import defpackage.riv;
import defpackage.rix;
import defpackage.riy;
import defpackage.riz;
import defpackage.rjb;
import defpackage.rjc;
import defpackage.rjj;
import defpackage.rln;
import defpackage.rlo;
import defpackage.rls;
import defpackage.rnt;
import defpackage.rnx;
import defpackage.roc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetBehavior extends clc implements rlo {
    public int A;
    public WeakReference B;
    public WeakReference C;
    public final ArrayList D;
    public int E;
    public boolean F;
    final SparseIntArray G;
    rln H;
    private int I;
    private float J;
    private boolean K;
    private int L;
    private int M;
    private ColorStateList N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private roc S;
    private boolean T;
    private final rjc U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private VelocityTracker ad;
    private int ae;
    private Map af;
    private final cqq ag;
    public int b;
    public int c;
    public rnx d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    int o;
    public int p;
    public int q;
    float r;
    public int s;
    float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public cqr y;
    int z;

    public BottomSheetBehavior() {
        this.I = 0;
        this.a = true;
        this.O = -1;
        this.e = -1;
        this.U = new rjc(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.G = new SparseIntArray();
        this.ag = new rix(this);
    }

    private final int aA() {
        int iMin;
        int i;
        int i2;
        if (this.K) {
            iMin = Math.min(Math.max(this.L, this.A - ((this.z * 9) / 16)), this.ac);
            i = this.m;
        } else {
            if (!this.P && !this.g && (i2 = this.f) > 0) {
                return Math.max(this.c, i2 + this.M);
            }
            iMin = this.c;
            i = this.m;
        }
        return iMin + i;
    }

    private final int aB(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.q : this.A : this.s : a();
    }

    private final void aC() {
        int iAA = aA();
        if (this.a) {
            this.s = Math.max(this.A - iAA, this.p);
        } else {
            this.s = this.A - iAA;
        }
    }

    private final void aD() {
        this.q = (int) (this.A * (1.0f - this.r));
    }

    private final void aE(View view, cps cpsVar, int i) {
        con.k(view, cpsVar, new riy(this, i));
    }

    private final void aF() {
        this.E = -1;
        this.ae = -1;
        VelocityTracker velocityTracker = this.ad;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ad = null;
        }
    }

    private final void aG() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        con.h(view, ImageMetadata.LENS_APERTURE);
        con.h(view, 262144);
        con.h(view, ImageMetadata.SHADING_MODE);
        SparseIntArray sparseIntArray = this.G;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            con.h(view, i);
            sparseIntArray.delete(0);
        }
        if (!this.a && this.x != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            riy riyVar = new riy(this, 6);
            List listD = con.d(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listD.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        i3 = con.a[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listD.size(); i5++) {
                            z &= ((cps) listD.get(i5)).a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                    }
                    iA = i3;
                } else {
                    if (TextUtils.equals(string, ((cps) listD.get(i2)).b())) {
                        iA = ((cps) listD.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                con.e(view, new cps(null, iA, string, riyVar, null));
            }
            sparseIntArray.put(0, iA);
        }
        if (this.u && this.x != 5) {
            aE(view, cps.u, 5);
        }
        int i6 = this.x;
        if (i6 == 3) {
            aE(view, cps.t, true == this.a ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            aE(view, cps.s, true == this.a ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            aE(view, cps.t, 4);
            aE(view, cps.s, 3);
        }
    }

    private final void aH(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.x == 3 && (this.R || aJ());
        if (this.T == z2 || this.d == null) {
            return;
        }
        this.T = z2;
        if (!z || (valueAnimator = this.V) == null) {
            ValueAnimator valueAnimator2 = this.V;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V.cancel();
            }
            this.d.o(this.T ? az() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.V.reverse();
        } else {
            this.V.setFloatValues(this.d.a.l, z2 ? az() : 1.0f);
            this.V.start();
        }
    }

    private final void aI(boolean z) {
        WeakReference weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.af != null) {
                    return;
                } else {
                    this.af = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.B.get() && z) {
                    this.af.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.af = null;
        }
    }

    private final boolean aJ() {
        WeakReference weakReference = this.B;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.B.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean aK() {
        if (this.y != null) {
            return this.w || this.x == 1;
        }
        return false;
    }

    private static final float aL(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private static final int aM(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private final float az() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.d == null || (weakReference = this.B) == null || weakReference.get() == null) {
            return 0.0f;
        }
        View view = (View) this.B.get();
        if (!aJ() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(aL(this.d.c(), rootWindowInsets.getRoundedCorner(0)), aL(this.d.d(), rootWindowInsets.getRoundedCorner(1)));
    }

    public static BottomSheetBehavior c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof clf)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        clc clcVar = ((clf) layoutParams).a;
        if (clcVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) clcVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final int a() {
        if (this.a) {
            return this.p;
        }
        return Math.max(this.o, this.Q ? 0 : this.n);
    }

    public final void ak(riz rizVar) {
        ArrayList arrayList = this.D;
        if (arrayList.contains(rizVar)) {
            return;
        }
        arrayList.add(rizVar);
    }

    @Override // defpackage.rlo
    public final void al() {
        rln rlnVar = this.H;
        if (rlnVar == null) {
            return;
        }
        if (rlnVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        na naVar = rlnVar.f;
        rlnVar.f = null;
        if (naVar != null) {
            Animator animatorA = rlnVar.a();
            animatorA.setDuration(rlnVar.e);
            animatorA.start();
        }
    }

    public final void am(int i) {
        float fA;
        View view = (View) this.B.get();
        if (view != null) {
            ArrayList arrayList = this.D;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.s;
            if (i > i2 || i2 == a()) {
                int i3 = this.s;
                fA = (i3 - i) / (this.A - i3);
            } else {
                int i4 = this.s;
                fA = (i4 - i) / (i4 - a());
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((riz) arrayList.get(i5)).a(view, fA);
            }
        }
    }

    @Override // defpackage.rlo
    public final void an() {
        rln rlnVar = this.H;
        if (rlnVar == null) {
            return;
        }
        na naVar = rlnVar.f;
        rlnVar.f = null;
        if (naVar == null) {
            ar(true == this.u ? 5 : 4);
            return;
        }
        if (!this.u) {
            Animator animatorA = rlnVar.a();
            animatorA.setDuration(rhn.b(rlnVar.c, rlnVar.d, naVar.a));
            animatorA.start();
            ar(4);
            return;
        }
        riu riuVar = new riu(this);
        View view = rlnVar.b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new cvn());
        objectAnimatorOfFloat.setDuration(rhn.b(rlnVar.c, rlnVar.d, naVar.a));
        objectAnimatorOfFloat.addListener(new rls(rlnVar));
        objectAnimatorOfFloat.addListener(riuVar);
        objectAnimatorOfFloat.start();
    }

    public final void ao(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.o = i;
        aH(this.x, true);
    }

    public final void ap(boolean z) throws Resources.NotFoundException {
        if (this.u != z) {
            this.u = z;
            if (!z && this.x == 5) {
                ar(4);
            }
            aG();
        }
    }

    public final void aq(int i) {
        if (i == -1) {
            if (this.K) {
                return;
            } else {
                this.K = true;
            }
        } else {
            if (!this.K && this.c == i) {
                return;
            }
            this.K = false;
            this.c = Math.max(0, i);
        }
        ay();
    }

    public final void ar(int i) {
        if (!this.u && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && aB(6) <= this.p) ? 3 : i;
        WeakReference weakReference = this.B;
        if (weakReference == null || weakReference.get() == null) {
            as(i);
            return;
        }
        View view = (View) this.B.get();
        ng ngVar = new ng(this, view, i2, 19);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(ngVar);
        } else {
            ngVar.run();
        }
    }

    public final void as(int i) throws Resources.NotFoundException {
        View view;
        if (this.x == i) {
            return;
        }
        this.x = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.u && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            aI(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            aI(false);
            i = i2;
        }
        aH(i, true);
        while (true) {
            ArrayList arrayList = this.D;
            if (i3 >= arrayList.size()) {
                aG();
                return;
            } else {
                ((riz) arrayList.get(i3)).b(view, i);
                i3++;
            }
        }
    }

    @Override // defpackage.rlo
    public final void at(na naVar) {
        rln rlnVar = this.H;
        if (rlnVar == null) {
            return;
        }
        rlnVar.f = naVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void au(android.view.View r3, int r4, boolean r5) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.aB(r4)
            cqr r1 = r2.y
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.as(r3)
            r3 = 1
            r2.aH(r4, r3)
            rjc r2 = r2.U
            r2.a(r4)
            return
        L3f:
            r2.as(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.au(android.view.View, int, boolean):void");
    }

    @Override // defpackage.rlo
    public final void av(na naVar) {
        rln rlnVar = this.H;
        if (rlnVar == null) {
            return;
        }
        if (rlnVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        na naVar2 = rlnVar.f;
        rlnVar.f = naVar;
        if (naVar2 != null) {
            rlnVar.b(naVar.a);
        }
    }

    public final boolean aw() {
        return this.u;
    }

    public final boolean ax(View view, float f) {
        if (this.v) {
            return true;
        }
        if (view.getTop() < this.s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ab)) - ((float) this.s)) / ((float) aA()) > 0.5f;
    }

    public final void ay() {
        View view;
        if (this.B != null) {
            aC();
            if (this.x != 4 || (view = (View) this.B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    final View b(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewB = b(viewGroup.getChildAt(i));
                if (viewB != null) {
                    return viewB;
                }
            }
        }
        return null;
    }

    @Override // defpackage.clc
    public final void d(clf clfVar) {
        this.B = null;
        this.y = null;
        this.H = null;
    }

    @Override // defpackage.clc
    public final void e() {
        this.B = null;
        this.y = null;
        this.H = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.clc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.a()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.as(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.C
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.aa
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.Z
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.q
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.u
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ad
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.J
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ad
            int r6 = r2.E
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.ax(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.Z
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.p
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.q
            if (r3 >= r1) goto L84
            int r6 = r2.s
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.q
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.au(r4, r0, r3)
            r2.aa = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.clc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        cqr cqrVar;
        if (!view.isShown() || !this.w) {
            this.Y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            aF();
            actionMasked = 0;
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.ae = y;
            if (this.x != 2) {
                WeakReference weakReference = this.C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.k(view2, x, y)) {
                    this.E = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.F = true;
                }
            }
            this.Y = this.E == -1 && !coordinatorLayout.k(view, x, this.ae);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
            this.E = -1;
            if (this.Y) {
                this.Y = false;
                return false;
            }
        }
        if (!this.Y && (cqrVar = this.y) != null && cqrVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.C;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.Y && this.x != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.y != null && (i = this.ae) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.y.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    @Override // defpackage.clc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.clc
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.x == 1 && actionMasked == 0) {
            return true;
        }
        if (aK()) {
            this.y.e(motionEvent);
        }
        if (actionMasked == 0) {
            aF();
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (aK() && actionMasked == 2 && !this.Y) {
            float fAbs = Math.abs(this.ae - motionEvent.getY());
            cqr cqrVar = this.y;
            if (fAbs > cqrVar.b) {
                cqrVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Y;
    }

    @Override // defpackage.clc
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(aM(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.O, marginLayoutParams.width), aM(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.e, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.clc
    public final boolean o(View view) {
        WeakReference weakReference = this.C;
        return (weakReference == null || view != weakReference.get() || this.x == 3 || this.X) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r2 == false) goto L36;
     */
    @Override // defpackage.clc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, int r8, int[] r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            r5 = 1
            if (r10 != r5) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r10 = r4.C
            if (r10 == 0) goto L10
            java.lang.Object r10 = r10.get()
            android.view.View r10 = (android.view.View) r10
            goto L11
        L10:
            r10 = 0
        L11:
            if (r7 != r10) goto La2
            int r0 = r6.getTop()
            int r1 = r0 - r8
            if (r8 <= 0) goto L53
            boolean r2 = r4.aa
            if (r2 != 0) goto L2b
            boolean r2 = r4.W
            if (r2 != 0) goto L2b
            if (r7 != r10) goto L2b
            boolean r7 = r7.canScrollVertically(r5)
            if (r7 != 0) goto L67
        L2b:
            int r7 = r4.a()
            if (r1 >= r7) goto L43
            int r7 = r4.a()
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.con.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 3
            r4.as(r7)
            goto L94
        L43:
            boolean r7 = r4.w
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.con.a
            r6.offsetTopAndBottom(r7)
            r4.as(r5)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r2 = -1
            boolean r2 = r7.canScrollVertically(r2)
            boolean r3 = r4.aa
            if (r3 != 0) goto L6a
            boolean r3 = r4.W
            if (r3 != 0) goto L6a
            if (r7 != r10) goto L6a
            if (r2 != 0) goto L67
            goto L6c
        L67:
            r4.X = r5
            return
        L6a:
            if (r2 != 0) goto L94
        L6c:
            int r7 = r4.s
            if (r1 <= r7) goto L85
            boolean r10 = r4.aw()
            if (r10 == 0) goto L77
            goto L85
        L77:
            int r0 = r0 - r7
            r9[r5] = r0
            int[] r7 = defpackage.con.a
            int r7 = -r0
            r6.offsetTopAndBottom(r7)
            r7 = 4
            r4.as(r7)
            goto L94
        L85:
            boolean r7 = r4.w
            if (r7 == 0) goto La2
            r9[r5] = r8
            int r7 = -r8
            int[] r9 = defpackage.con.a
            r6.offsetTopAndBottom(r7)
            r4.as(r5)
        L94:
            int r6 = r6.getTop()
            r4.am(r6)
            r4.Z = r8
            r4.aa = r5
            r5 = 0
            r4.X = r5
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.clc
    public final void r(View view, Parcelable parcelable) {
        rjb rjbVar = (rjb) parcelable;
        int i = this.I;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = rjbVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = rjbVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.u = rjbVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.v = rjbVar.g;
            }
        }
        int i3 = rjbVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.x = i2;
    }

    @Override // defpackage.clc
    public final Parcelable s(View view) {
        return new rjb(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.clc
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        return (i & 2) != 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.I = 0;
        this.a = true;
        this.O = -1;
        this.e = -1;
        this.U = new rjc(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.G = new SparseIntArray();
        this.ag = new rix(this);
        this.M = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rjj.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.N = rnt.d(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.S = new roc(roc.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            rnx rnxVar = new rnx(this.S);
            this.d = rnxVar;
            rnxVar.j(context);
            ColorStateList colorStateList = this.N;
            if (colorStateList != null) {
                this.d.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.d.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(az(), 1.0f);
        this.V = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.V.addUpdateListener(new riv(this));
        this.t = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            aq(typedValuePeekValue.data);
        } else {
            aq(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        ap(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.P = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.a != z) {
            this.a = z;
            if (this.B != null) {
                aC();
            }
            as((this.a && this.x == 6) ? 3 : this.x);
            aH(this.x, true);
            aG();
        }
        this.v = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.W = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.I = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.r = f;
            if (this.B != null) {
                aD();
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                ao(typedValuePeekValue2.data);
            } else {
                ao(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
            }
            this.b = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.g = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.h = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.i = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.Q = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.j = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.k = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.l = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.R = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.J = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.clc
    public final void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
