package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.R;
import defpackage.clb;
import defpackage.clc;
import defpackage.clf;
import defpackage.cnt;
import defpackage.cog;
import defpackage.col;
import defpackage.con;
import defpackage.cpp;
import defpackage.cqn;
import defpackage.eod;
import defpackage.qpt;
import defpackage.rhn;
import defpackage.rht;
import defpackage.rhu;
import defpackage.rhv;
import defpackage.rhw;
import defpackage.rhx;
import defpackage.ria;
import defpackage.ric;
import defpackage.rid;
import defpackage.rie;
import defpackage.rig;
import defpackage.rih;
import defpackage.rkf;
import defpackage.rla;
import defpackage.rlg;
import defpackage.rnt;
import defpackage.rnx;
import defpackage.rpl;
import defpackage.rqb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements clb {
    public boolean a;
    public int b;
    public cpp c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g;
    public final LinkedHashSet h;
    public Drawable i;
    public Integer j;
    public final float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private WeakReference r;
    private final boolean s;
    private ValueAnimator t;
    private ValueAnimator.AnimatorUpdateListener u;
    private final long v;
    private final TimeInterpolator w;
    private int[] x;
    private Behavior y;

    /* compiled from: PG */
    public class BaseBehavior extends ric {
        public int a;
        public rkf b;
        private int d;
        private ValueAnimator e;
        private rhw f;
        private WeakReference g;

        public BaseBehavior() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void aA(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                rhx r0 = (defpackage.rhx) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5b
                int r1 = r5.getMinimumHeight()
                r3 = 1
                if (r10 <= 0) goto L49
                r10 = r0 & 12
                if (r10 == 0) goto L49
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.e()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L49:
                r10 = r0 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.e()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L5b:
                r3 = r2
            L5c:
                boolean r9 = r8.f
                if (r9 == 0) goto L68
                android.view.View r9 = az(r7)
                boolean r3 = r8.m(r9)
            L68:
                boolean r9 = r8.l(r3)
                if (r11 != 0) goto La4
                if (r9 == 0) goto Lcb
                gno r7 = r7.h
                java.util.ArrayList r7 = r7.k(r8)
                if (r7 != 0) goto L79
                goto L7e
            L79:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r7)
            L7e:
                if (r4 != 0) goto L82
                java.util.List r4 = java.util.Collections.EMPTY_LIST
            L82:
                int r7 = r4.size()
            L86:
                if (r2 >= r7) goto Lcb
                java.lang.Object r9 = r4.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                clf r9 = (defpackage.clf) r9
                clc r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r7 = r9.d
                if (r7 == 0) goto Lcb
                goto La4
            La1:
                int r2 = r2 + 1
                goto L86
            La4:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb1
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb1:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lbe
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lbe:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lcb
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lcb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.aA(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static final View ap(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((clf) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void av(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int[] iArr = con.a;
            if (col.a(coordinatorLayout) != null) {
                return;
            }
            con.i(coordinatorLayout, new rhv(this, appBarLayout, coordinatorLayout));
        }

        private final void aw(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iC = c() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                rhx rhxVar = (rhx) childAt.getLayoutParams();
                if (ax(rhxVar.a, 32)) {
                    top -= rhxVar.topMargin;
                    bottom += rhxVar.bottomMargin;
                }
                int i2 = -iC;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                rhx rhxVar2 = (rhx) childAt2.getLayoutParams();
                int i3 = rhxVar2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (ax(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (ax(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iC < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (ax(i3, 32)) {
                        iE2 += rhxVar2.topMargin;
                        minimumHeight -= rhxVar2.bottomMargin;
                    }
                    if (iC < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    ay(coordinatorLayout, appBarLayout, clc.D(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean ax(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void ay(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float fAbs = Math.abs(c() - i);
            float fAbs2 = Math.abs(0.0f);
            int iRound = fAbs2 > 0.0f ? Math.round((fAbs / fAbs2) * 1000.0f) * 3 : (int) (((fAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iC = c();
            if (iC == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.e.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(rhn.e);
                this.e.addUpdateListener(new rpl(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration(Math.min(iRound, 600));
            this.e.setIntValues(iC, i);
            this.e.start();
        }

        private static final View az(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof cnt) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.ric
        public final /* bridge */ /* synthetic */ int a(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
        @Override // defpackage.ric
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ int ak(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.ak(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        final rhw al(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iAt = at();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iAt;
                if (childAt.getTop() + iAt <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = cqn.c;
                    }
                    rhw rhwVar = new rhw(parcelable);
                    boolean z = iAt == 0;
                    rhwVar.b = z;
                    rhwVar.a = !z && (-iAt) >= appBarLayout.f();
                    rhwVar.e = i;
                    rhwVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    rhwVar.f = bottom / childAt.getHeight();
                    return rhwVar;
                }
            }
            return null;
        }

        @Override // defpackage.ric
        public final /* bridge */ /* synthetic */ void am(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            aw(coordinatorLayout, appBarLayout);
            if (appBarLayout.f) {
                appBarLayout.l(appBarLayout.m(az(coordinatorLayout)));
            }
        }

        final void an(rhw rhwVar, boolean z) {
            if (this.f == null || z) {
                this.f = rhwVar;
            }
        }

        @Override // defpackage.ric
        public final /* bridge */ /* synthetic */ boolean ao(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.b != null) {
                return appBarLayout.getResources().getConfiguration().orientation == 2;
            }
            WeakReference weakReference = this.g;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void aq(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L25
                if (r12 >= 0) goto Lf
                int r0 = r10.f()
                int r0 = -r0
                int r1 = r10.b()
                int r1 = r1 + r0
                goto L15
            Lf:
                int r0 = r10.f()
                int r0 = -r0
                r1 = 0
            L15:
                r6 = r0
                r7 = r1
                if (r6 == r7) goto L25
                r0 = 1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r12
                int r8 = r2.ar(r3, r4, r5, r6, r7)
                r13[r0] = r8
                goto L26
            L25:
                r4 = r10
            L26:
                boolean r8 = r4.f
                if (r8 == 0) goto L31
                boolean r8 = r4.m(r11)
                r4.l(r8)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.aq(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        @Override // defpackage.ric
        public final /* synthetic */ int b(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ric
        public final int c() {
            return at() + this.a;
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ void f(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i == 1) {
                aw(coordinatorLayout, appBarLayout);
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view2));
                }
            }
            this.g = new WeakReference(view2);
        }

        @Override // defpackage.rif, defpackage.clc
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            rhw rhwVar = this.f;
            if (rhwVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            ay(coordinatorLayout, appBarLayout, i4);
                        } else {
                            as(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            ay(coordinatorLayout, appBarLayout, 0);
                        } else {
                            as(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (rhwVar.a) {
                as(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (rhwVar.b) {
                as(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(rhwVar.e);
                as(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f.g ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * this.f.f)));
            }
            appBarLayout.b = 0;
            this.f = null;
            au(clc.D(at(), -appBarLayout.f(), 0));
            aA(coordinatorLayout, appBarLayout, at(), 0, true);
            appBarLayout.h(at());
            av(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((clf) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            aq(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                i4 = i3;
                iArr[1] = ar(coordinatorLayout, appBarLayout, i4, -appBarLayout.c(), 0);
            } else {
                i4 = i3;
            }
            if (i4 == 0) {
                av(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ void r(View view, Parcelable parcelable) {
            if (!(parcelable instanceof rhw)) {
                this.f = null;
            } else {
                an((rhw) parcelable, true);
                Parcelable parcelable2 = this.f.d;
            }
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            rhw rhwVarAl = al(absSavedState, (AppBarLayout) view);
            return rhwVarAl == null ? absSavedState : rhwVarAl;
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.f || appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            this.g = null;
            this.d = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends rid {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout ak(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.rid
        public final float a(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iF = appBarLayout.f();
            int iB = appBarLayout.b();
            clc clcVar = ((clf) appBarLayout.getLayoutParams()).a;
            int iC = clcVar instanceof BaseBehavior ? ((BaseBehavior) clcVar).c() : 0;
            if ((iB == 0 || iF + iC > iB) && (i = iF - iB) != 0) {
                return (iC / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.rid
        public final int b(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.rid
        public final /* bridge */ /* synthetic */ View c(List list) {
            return ak(list);
        }

        @Override // defpackage.rif, defpackage.clc
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.h(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.clc
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutAk = ak(coordinatorLayout.a(view));
            if (appBarLayoutAk != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutAk.j(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.clc
        public final boolean k(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.clc
        public void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            clc clcVar = ((clf) view2.getLayoutParams()).a;
            if (clcVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) clcVar).a) + this.c) - al(view2);
                int[] iArr = con.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f) {
                    appBarLayout.l(appBarLayout.m(view));
                }
            }
        }

        @Override // defpackage.clc
        public final void m(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                con.i(coordinatorLayout, null);
            }
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            cpp cppVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewC = c(coordinatorLayout.a(view));
            if (viewC == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (viewC.getFitsSystemWindows() && (cppVar = coordinatorLayout.e) != null) {
                size += cppVar.d() + cppVar.a();
            }
            int iB = size + b(viewC);
            int measuredHeight = viewC.getMeasuredHeight();
            if (an()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iB -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iB, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rie.f);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final rhx n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new rhx((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new rhx((ViewGroup.MarginLayoutParams) layoutParams) : new rhx(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.y;
        rhw rhwVarAl = null;
        if (behavior != null && this.m != -1 && this.b == 0) {
            rhwVarAl = behavior.al(cqn.c, this);
        }
        this.m = -1;
        this.n = -1;
        this.o = -1;
        if (rhwVarAl != null) {
            this.y.an(rhwVarAl, false);
        }
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    private final void q(float f, float f2) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.v);
        this.t.setInterpolator(this.w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.u;
        if (animatorUpdateListener != null) {
            this.t.addUpdateListener(animatorUpdateListener);
        }
        this.t.start();
    }

    private final boolean r() {
        return this.i != null && e() > 0;
    }

    private final boolean s() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.clb
    public final clc a() {
        Behavior behavior = new Behavior();
        this.y = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                rhx rhxVar = (rhx) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = rhxVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = rhxVar.topMargin + rhxVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.n = iMax;
        return iMax;
    }

    final int c() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                rhx rhxVar = (rhx) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + rhxVar.topMargin + rhxVar.bottomMargin;
                int i3 = rhxVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.o = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rhx;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + iE;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.l);
            this.i.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        cpp cppVar = this.c;
        if (cppVar != null) {
            return cppVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                rhx rhxVar = (rhx) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = rhxVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + rhxVar.topMargin + rhxVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.m = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final rhx generateLayoutParams(AttributeSet attributeSet) {
        return new rhx(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rhx();
    }

    final void h(int i) {
        this.l = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.d.get(i2);
                if (ambientController != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ambientController.a;
                    collapsingToolbarLayout.e = i;
                    cpp cppVar = collapsingToolbarLayout.f;
                    int iD = cppVar != null ? cppVar.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        ria riaVar = (ria) childAt.getLayoutParams();
                        rig rigVarC = CollapsingToolbarLayout.c(childAt);
                        int i4 = riaVar.a;
                        if (i4 == 1) {
                            rigVarC.c(clc.D(-i, 0, collapsingToolbarLayout.a(childAt)));
                        } else if (i4 == 2) {
                            rigVarC.c(Math.round((-i) * riaVar.b));
                        }
                    }
                    collapsingToolbarLayout.h();
                    if (collapsingToolbarLayout.d != null && iD > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = height - collapsingToolbarLayout.getMinimumHeight();
                    int iB = height - collapsingToolbarLayout.b();
                    int i5 = minimumHeight - iD;
                    int i6 = collapsingToolbarLayout.e + i5;
                    float fAbs = Math.abs(i);
                    rla rlaVar = collapsingToolbarLayout.a;
                    float f = i5;
                    float f2 = iB / f;
                    rlaVar.s(Math.min(1.0f, f2));
                    rlaVar.e = i6;
                    float f3 = fAbs / f;
                    rlaVar.r(f3);
                    rla rlaVar2 = collapsingToolbarLayout.b;
                    rlaVar2.s(Math.min(1.0f, f2));
                    rlaVar2.e = i6;
                    rlaVar2.r(f3);
                }
            }
        }
    }

    public final void i(boolean z) {
        j(z, isLaidOut());
    }

    public final void j(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void k() {
        setWillNotDraw(!r());
    }

    final boolean l(boolean z) {
        if (this.e == z) {
            return false;
        }
        this.e = z;
        refreshDrawableState();
        if (getBackground() instanceof rnx) {
            if (this.s) {
                q(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
                return true;
            }
            if (this.f) {
                q(z ? 0.0f : this.k, z ? this.k : 0.0f);
            }
        }
        return true;
    }

    final boolean m(View view) {
        int i;
        if (this.r == null && (i = this.q) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.q);
            }
            if (viewFindViewById != null) {
                this.r = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.r;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rnt.o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.x == null) {
            this.x = new int[4];
        }
        int[] iArr = this.x;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.p;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970277 : R.attr.state_liftable;
        if (z2) {
            i = this.e ? R.attr.state_lifted : -2130970278;
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970273;
        int i2 = -2130970272;
        if (z && this.e) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && s()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int[] iArr = con.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        o();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((rhx) getChildAt(i5).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.f) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((rhx) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.p != z2) {
            this.p = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = clc.D(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        rnt.n(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new rhx();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        AppBarLayout appBarLayout;
        super(rqb.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.b = 0;
        this.g = new ArrayList();
        this.h = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = rih.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = rih.a;
        Context context3 = getContext();
        TypedArray typedArrayA = rlg.a(context3, attributeSet, rih.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = rlg.a(context2, attributeSet, rie.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            setBackground(typedArrayA2.getDrawable(0));
            ColorStateList colorStateListD = rnt.d(context2, typedArrayA2, 6);
            this.s = colorStateListD != null;
            ColorStateList colorStateListJ = qpt.J(getBackground());
            if (colorStateListJ != null) {
                rnx rnxVar = new rnx();
                rnxVar.n(colorStateListJ);
                if (colorStateListD != null) {
                    appBarLayout = this;
                    appBarLayout.u = new rht(appBarLayout, colorStateListJ, colorStateListD, rnxVar, qpt.T(getContext(), R.attr.colorSurface), 0);
                    appBarLayout.setBackground(rnxVar);
                } else {
                    appBarLayout = this;
                    rnxVar.j(context2);
                    appBarLayout.u = new rhu(appBarLayout, rnxVar, 0);
                    appBarLayout.setBackground(rnxVar);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.v = rnt.f(context2, R.attr.motionDurationMedium2, appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            appBarLayout.w = qpt.G(context2, R.attr.motionEasingStandardInterpolator, rhn.a);
            if (typedArrayA2.hasValue(4)) {
                appBarLayout.p(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                rih.a(appBarLayout, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayA2.hasValue(2)) {
                appBarLayout.setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                appBarLayout.setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            appBarLayout.k = appBarLayout.getResources().getDimension(R.dimen.design_appbar_elevation);
            appBarLayout.f = typedArrayA2.getBoolean(5, false);
            appBarLayout.q = typedArrayA2.getResourceId(7, -1);
            Drawable drawable = typedArrayA2.getDrawable(8);
            Drawable drawable2 = appBarLayout.i;
            if (drawable2 != drawable) {
                Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                appBarLayout.i = drawableMutate;
                if (drawableMutate instanceof rnx) {
                    numValueOf = Integer.valueOf(((rnx) drawableMutate).g);
                } else {
                    ColorStateList colorStateListJ2 = qpt.J(drawableMutate);
                    if (colorStateListJ2 != null) {
                        numValueOf = Integer.valueOf(colorStateListJ2.getDefaultColor());
                    }
                }
                appBarLayout.j = numValueOf;
                Drawable drawable3 = appBarLayout.i;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        appBarLayout.i.setState(appBarLayout.getDrawableState());
                    }
                    appBarLayout.i.setLayoutDirection(appBarLayout.getLayoutDirection());
                    appBarLayout.i.setVisible(appBarLayout.getVisibility() == 0, false);
                    appBarLayout.i.setCallback(appBarLayout);
                }
                appBarLayout.k();
                appBarLayout.postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            eod eodVar = new eod(appBarLayout, 2);
            int[] iArr3 = con.a;
            cog.i(appBarLayout, eodVar);
        } catch (Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
