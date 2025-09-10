package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import defpackage.fbu;
import defpackage.fcx;
import defpackage.fcy;
import defpackage.fdi;
import defpackage.gzi;
import defpackage.gzj;
import defpackage.hnk;
import defpackage.hnp;
import defpackage.hnq;
import defpackage.hns;
import defpackage.hnu;
import defpackage.hnv;
import defpackage.hnw;
import defpackage.hny;
import defpackage.hob;
import defpackage.hoc;
import defpackage.mwq;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.nlt;
import defpackage.nlu;
import defpackage.ovx;
import defpackage.owq;
import defpackage.rwc;
import defpackage.scn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FocusIndicatorView extends ConstraintLayout implements mxl {
    final nlu A;
    public nlu B;
    public final nlu C;
    public nlu D;
    public final nlu E;
    final nlu F;
    public final nlu G;
    final nlu H;
    final nlu I;
    public final nlu J;
    public final nlu K;
    public final nlu L;
    public final nlu M;
    public Animator N;
    public AmbientMode.AmbientController O;
    private final PointF P;
    private final int[] Q;
    private volatile mxm R;
    private final Animator.AnimatorListener S;
    private final hnk T;
    public boolean i;
    public final owq j;
    public final owq k;
    public final AtomicBoolean l;
    public final FocusIndicatorRingView m;
    public final EyesFocusIndicatorRectView n;
    public final FocusIndicatorAccessoryView o;
    public final rwc p;
    public final hnq q;
    final hns r;
    public final nlu s;
    public final nlu t;
    public final nlu u;
    public final nlu v;
    final nlu w;
    final nlu x;
    final nlu y;
    final nlu z;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new PointF(0.0f, 0.0f);
        this.j = new ovx(false);
        this.k = new ovx(false);
        this.l = new AtomicBoolean(false);
        this.Q = new int[2];
        this.R = mxm.PORTRAIT;
        this.S = new hnv(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.focus_indicator_view_contents, this);
        hnk hnkVarZ = z(context);
        this.T = hnkVarZ;
        this.m = hny.c(hnkVarZ.a);
        hnw hnwVar = hnkVarZ.a;
        Object obj = hnwVar.d;
        obj.getClass();
        this.n = (EyesFocusIndicatorRectView) obj;
        Object obj2 = hnwVar.e;
        obj2.getClass();
        this.o = (FocusIndicatorAccessoryView) obj2;
        this.p = hnwVar.a();
        this.q = hob.c(hnkVarZ.a);
        this.r = hoc.c(hnkVarZ.a);
        nlu nluVar = (nlu) hnkVarZ.l.a();
        this.s = nluVar;
        nlu nluVar2 = (nlu) hnkVarZ.m.a();
        this.t = nluVar2;
        nlu nluVar3 = (nlu) hnkVarZ.n.a();
        this.u = nluVar3;
        nlu nluVar4 = (nlu) hnkVarZ.o.a();
        this.v = nluVar4;
        nlu nluVar5 = (nlu) hnkVarZ.p.a();
        this.w = nluVar5;
        nlu nluVar6 = (nlu) hnkVarZ.q.a();
        this.x = nluVar6;
        nlu nluVar7 = (nlu) hnkVarZ.r.a();
        this.y = nluVar7;
        nlu nluVar8 = (nlu) hnkVarZ.s.a();
        this.z = nluVar8;
        nlu nluVar9 = (nlu) hnkVarZ.t.a();
        this.A = nluVar9;
        this.B = (nlu) hnkVarZ.u.a();
        nlu nluVar10 = (nlu) hnkVarZ.v.a();
        this.C = nluVar10;
        this.D = (nlu) hnkVarZ.w.a();
        nlu nluVar11 = (nlu) hnkVarZ.x.a();
        this.E = nluVar11;
        nlu nluVar12 = (nlu) hnkVarZ.y.a();
        this.F = nluVar12;
        nlu nluVar13 = (nlu) hnkVarZ.z.a();
        this.G = nluVar13;
        nlu nluVar14 = (nlu) hnkVarZ.A.a();
        this.H = nluVar14;
        nlu nluVar15 = (nlu) hnkVarZ.B.a();
        this.I = nluVar15;
        nlu nluVar16 = (nlu) hnkVarZ.C.a();
        this.J = nluVar16;
        nlu nluVar17 = (nlu) hnkVarZ.D.a();
        this.K = nluVar17;
        nlu nluVar18 = (nlu) hnkVarZ.E.a();
        this.L = nluVar18;
        nlu nluVar19 = (nlu) hnkVarZ.F.a();
        this.M = nluVar19;
        A(nluVar);
        A(nluVar2);
        A(nluVar3);
        A(nluVar5);
        A(nluVar8);
        A(nluVar9);
        A(nluVar11);
        A(nluVar13);
        A(nluVar14);
        A(nluVar15);
        A(nluVar16);
        A(nluVar18);
        A(nluVar12);
        A(nluVar10);
        A(nluVar6);
        A(nluVar4);
        A(nluVar17);
        A(nluVar19);
        A(nluVar7);
        if (context instanceof fdi) {
            fdi fdiVar = (fdi) context;
            fdiVar.b();
            gzi gziVar = gzj.a;
            this.i = fdiVar.b().p(gzj.f);
        }
    }

    private final void A(nlu nluVar) {
        if (nluVar != null) {
            nluVar.b(this.S);
        }
    }

    private final hnk z(Context context) {
        return new hnk(new hnw(context, this));
    }

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        requestLayout();
    }

    public final PointF g(PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        int i = this.R.e;
        Matrix matrix = new Matrix();
        matrix.setRotate(i, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        return new PointF(fArr[0] * getWidth(), fArr[1] * getHeight());
    }

    public final nlt h() {
        k();
        rwc rwcVar = this.p;
        if (rwcVar.h()) {
            ((FocusIndicatorAccessoryView) rwcVar.c()).c(true);
        }
        nlt nltVarA = this.I.a();
        nltVarA.b(new fbu(this, 13));
        return nltVarA;
    }

    public final nlt i() {
        Animator animator = this.N;
        if (animator != null && animator.isRunning()) {
            return nlu.a;
        }
        int i = 1;
        scn scnVarL = scn.L(hnp.SHAPE, hnp.COLOR, hnp.THICKNESS, hnp.CORNER_RADIUS, hnp.BOUNDARY_CORNER_RADIUS, hnp.BOUNDARY_DIAMETER, hnp.BOUNDARY_THICKNESS, hnp.b);
        this.q.c(scnVarL);
        nlt nltVarA = ((Boolean) ((ovx) this.k).d).booleanValue() ? this.y.a() : this.x.a();
        nltVarA.b(new hnu(this, scnVarL, i));
        return nltVarA;
    }

    public final nlt j() {
        Animator animator = this.N;
        return (animator == null || !animator.isRunning()) ? this.w.a() : nlu.a;
    }

    public final void k() {
        Animator animator = this.N;
        if (animator != null && animator.isRunning()) {
            this.N.cancel();
            this.N = null;
        }
        FocusIndicatorAccessoryView focusIndicatorAccessoryView = this.o;
        if (focusIndicatorAccessoryView != null && focusIndicatorAccessoryView.a.isStarted()) {
            focusIndicatorAccessoryView.a();
        }
        rwc rwcVar = this.p;
        if (rwcVar != null && rwcVar.h() && ((FocusIndicatorAccessoryView) rwcVar.c()).a.isRunning()) {
            ((FocusIndicatorAccessoryView) rwcVar.c()).a();
        }
    }

    public final void l() {
        k();
        o();
        n();
        m();
        p();
        this.l.set(false);
    }

    public final void m() {
        this.n.setVisibility(8);
    }

    public final void n() throws Resources.NotFoundException {
        this.o.c(false);
        s(false);
    }

    public final void o() {
        this.r.d(0.0f);
        this.q.m(0.0f);
        this.m.invalidate();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        FocusIndicatorAccessoryView focusIndicatorAccessoryView = this.o;
        FocusIndicatorRingView focusIndicatorRingView = this.m;
        focusIndicatorAccessoryView.b = focusIndicatorRingView;
        rwc rwcVar = this.p;
        if (rwcVar.h()) {
            ((FocusIndicatorAccessoryView) rwcVar.c()).b = focusIndicatorRingView;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.focusindicator.FocusIndicatorView.onLayout(boolean, int, int, int, int):void");
    }

    public final void p() throws Resources.NotFoundException {
        rwc rwcVar = this.p;
        if (rwcVar.h()) {
            ((FocusIndicatorAccessoryView) rwcVar.c()).c(false);
        }
    }

    public final void q(rwc rwcVar, int i) {
        if (rwcVar.h()) {
            this.m.b(g((PointF) rwcVar.c()));
            x(i);
        } else {
            this.m.b(new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
        }
    }

    public final void r() {
        this.m.b(new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
    }

    public final void s(boolean z) {
        owq owqVar = this.j;
        if (((Boolean) ((ovx) owqVar).d).booleanValue() == z) {
            return;
        }
        owqVar.a(Boolean.valueOf(z));
        AmbientMode.AmbientController ambientController = this.O;
        if (ambientController != null) {
            Object obj = ambientController.a;
            if (z) {
                owq owqVar2 = ((fcy) obj).a;
                ovx ovxVar = (ovx) owqVar2;
                fcx fcxVar = (fcx) ovxVar.d;
                fcx fcxVar2 = fcx.AF_LOCKED;
                if (fcxVar.equals(fcxVar2) || ((fcx) ovxVar.d).equals(fcx.AE_AF_LOCKED)) {
                    return;
                }
                owqVar2.a(fcxVar2);
                return;
            }
            owq owqVar3 = ((fcy) obj).a;
            ovx ovxVar2 = (ovx) owqVar3;
            if (((fcx) ovxVar2.d).equals(fcx.UNLOCKED)) {
                return;
            }
            fcx fcxVar3 = (fcx) ovxVar2.d;
            fcx fcxVar4 = fcx.AF_UNLOCKED;
            if (fcxVar3.equals(fcxVar4)) {
                return;
            }
            owqVar3.a(fcxVar4);
        }
    }

    public final void t(float f) {
        if (u()) {
            rwc rwcVar = this.p;
            if (rwcVar.h()) {
                ((FocusIndicatorAccessoryView) rwcVar.c()).d(f);
            }
            this.q.m(f);
            this.m.invalidate();
        }
    }

    public final boolean u() {
        return this.l.get();
    }

    public final void v() {
        k();
        this.H.a();
    }

    public final nlt w(rwc rwcVar) {
        Animator animator = this.N;
        if (animator != null && animator.isRunning()) {
            return nlu.a;
        }
        o();
        m();
        q(rwcVar, 360);
        return this.v.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d A[PHI: r3
      0x001d: PHI (r3v3 float) = (r3v0 float), (r3v1 float) binds: [B:3:0x001b, B:6:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(float r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.heightPixels
            float r2 = (float) r2
            r3 = 1151909888(0x44a8c000, float:1350.0)
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 <= 0) goto L1f
        L1d:
            r6 = r3
            goto L26
        L1f:
            r3 = 1135869952(0x43b40000, float:360.0)
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 >= 0) goto L26
            goto L1d
        L26:
            float r3 = java.lang.Math.max(r2, r1)
            float r1 = java.lang.Math.min(r2, r1)
            float r2 = r3 / r1
            mxm r4 = r5.R
            int r4 = r4.e
            if (r4 != 0) goto L3b
            float r6 = r6 * r1
            r1 = 1151860736(0x44a80000, float:1344.0)
        L39:
            float r6 = r6 / r1
            goto L4a
        L3b:
            r1 = 1074161254(0x40066666, float:2.1)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L45
            r1 = 2992(0xbb0, float:4.193E-42)
            goto L47
        L45:
            r1 = 2772(0xad4, float:3.884E-42)
        L47:
            float r6 = r6 * r3
            float r1 = (float) r1
            goto L39
        L4a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r2 = 0
            float r6 = android.util.TypedValue.applyDimension(r2, r6, r0)
            hnq r0 = r5.q
            r0.l(r6)
            boolean r2 = r5.i
            if (r2 == 0) goto L84
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131167538(0x7f070932, float:1.7949352E38)
            float r6 = r6.getDimension(r1)
            r0.l(r6)
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131167533(0x7f07092d, float:1.7949342E38)
            float r5 = r5.getDimension(r6)
            r0.k(r5)
            return
        L84:
            float r6 = r6 / r1
            r0.k(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.focusindicator.FocusIndicatorView.x(float):void");
    }

    public final void y(mwq mwqVar) {
        mwqVar.h(getContext().getString(R.string.focused_accessibility));
    }

    /* JADX WARN: Multi-variable type inference failed */
    FocusIndicatorView(Context context, FocusIndicatorRingView focusIndicatorRingView, EyesFocusIndicatorRectView eyesFocusIndicatorRectView, FocusIndicatorAccessoryView focusIndicatorAccessoryView, rwc rwcVar, hnq hnqVar, hns hnsVar, nlu nluVar, nlu nluVar2, nlu nluVar3, nlu nluVar4, nlu nluVar5, nlu nluVar6, nlu nluVar7, nlu nluVar8, nlu nluVar9, nlu nluVar10, nlu nluVar11, nlu nluVar12, nlu nluVar13, nlu nluVar14, nlu nluVar15, nlu nluVar16, nlu nluVar17, nlu nluVar18, nlu nluVar19) {
        super(context);
        this.P = new PointF(0.0f, 0.0f);
        this.j = new ovx(false);
        this.k = new ovx(false);
        this.l = new AtomicBoolean(false);
        this.Q = new int[2];
        this.R = mxm.PORTRAIT;
        this.S = new hnv(this);
        this.T = z(context);
        this.m = focusIndicatorRingView;
        this.n = eyesFocusIndicatorRectView;
        this.o = focusIndicatorAccessoryView;
        this.p = rwcVar;
        this.q = hnqVar;
        this.r = hnsVar;
        A(nluVar);
        this.s = nluVar;
        A(nluVar2);
        this.t = nluVar2;
        A(nluVar3);
        this.u = nluVar3;
        A(nluVar4);
        this.w = nluVar4;
        A(nluVar5);
        this.z = nluVar5;
        A(nluVar6);
        this.A = nluVar6;
        A(nluVar7);
        this.E = nluVar7;
        A(nluVar13);
        this.F = nluVar13;
        A(nluVar17);
        this.C = nluVar17;
        A(nluVar14);
        this.K = nluVar14;
        A(nluVar15);
        this.x = nluVar15;
        A(nluVar16);
        this.y = nluVar16;
        A(nluVar18);
        this.v = nluVar18;
        A(nluVar8);
        this.G = nluVar8;
        A(nluVar9);
        this.H = nluVar9;
        A(nluVar10);
        this.I = nluVar10;
        A(nluVar11);
        this.J = nluVar11;
        A(nluVar12);
        this.L = nluVar12;
        A(nluVar19);
        this.M = nluVar19;
        if (context instanceof fdi) {
            fdi fdiVar = (fdi) context;
            fdiVar.b();
            gzi gziVar = gzj.a;
            this.i = fdiVar.b().p(gzj.f);
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
