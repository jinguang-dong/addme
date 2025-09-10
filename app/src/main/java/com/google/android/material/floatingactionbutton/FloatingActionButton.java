package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.aaa;
import defpackage.clb;
import defpackage.clc;
import defpackage.clf;
import defpackage.coe;
import defpackage.con;
import defpackage.iua;
import defpackage.rhr;
import defpackage.rki;
import defpackage.rkp;
import defpackage.rkq;
import defpackage.rks;
import defpackage.rkt;
import defpackage.rku;
import defpackage.rlb;
import defpackage.rlg;
import defpackage.rll;
import defpackage.rnl;
import defpackage.rnt;
import defpackage.rnx;
import defpackage.roc;
import defpackage.rol;
import defpackage.rpa;
import defpackage.rpc;
import defpackage.rqb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FloatingActionButton extends rll implements rol, clb {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private rkt m;
    private final rpa n;
    private final iua o;

    /* compiled from: PG */
    public class BaseBehavior extends clc {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private final boolean a(View view, FloatingActionButton floatingActionButton) {
            return (this.b && ((clf) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0) ? false : true;
        }

        private final boolean ak(View view, FloatingActionButton floatingActionButton) {
            if (a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((clf) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.e();
            return true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof clf) {
                return ((clf) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            rlb.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.e();
            return true;
        }

        @Override // defpackage.clc
        public final void d(clf clfVar) {
            if (clfVar.h == 0) {
                clfVar.h = 80;
            }
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listA.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (b(view2) && ak(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (c(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            clf clfVar = (clf) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - clfVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= clfVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - clfVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= clfVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = con.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = con.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                c(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (b(view2)) {
                ak(view2, floatingActionButton);
            }
        }

        @Override // defpackage.clc
        public final /* bridge */ /* synthetic */ boolean u(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rku.c);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
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

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int g(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    private final rkt h() {
        if (this.m == null) {
            this.m = new rkt(this, new AmbientModeSupport.AmbientController(this));
        }
        return this.m;
    }

    @Override // defpackage.clb
    public final clc a() {
        return new Behavior();
    }

    public final int b() {
        return g(this.i);
    }

    final void d() {
        rkt rktVarH = h();
        FloatingActionButton floatingActionButton = rktVarH.B;
        if (floatingActionButton.getVisibility() == 0) {
            if (rktVarH.A == 1) {
                return;
            }
        } else if (rktVarH.A != 2) {
            return;
        }
        Animator animator = rktVarH.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!rktVarH.l()) {
            floatingActionButton.f(4, false);
            return;
        }
        rhr rhrVar = rktVarH.x;
        AnimatorSet animatorSetB = rhrVar != null ? rktVarH.b(rhrVar, 0.0f, 0.0f, 0.0f) : rktVarH.c(0.0f, 0.4f, 0.4f, rkt.d, rkt.e);
        animatorSetB.addListener(new rkp(rktVarH));
        animatorSetB.start();
    }

    final void e() {
        rkt rktVarH = h();
        FloatingActionButton floatingActionButton = rktVarH.B;
        if (floatingActionButton.getVisibility() != 0) {
            if (rktVarH.A == 2) {
                return;
            }
        } else if (rktVarH.A != 1) {
            return;
        }
        Animator animator = rktVarH.v;
        if (animator != null) {
            animator.cancel();
        }
        rhr rhrVar = rktVarH.w;
        if (!rktVarH.l()) {
            floatingActionButton.f(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            rktVarH.f(1.0f);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            float f = rhrVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            floatingActionButton.setScaleX(f);
            rktVarH.f(f);
        }
        rhr rhrVar2 = rktVarH.w;
        AnimatorSet animatorSetB = rhrVar2 != null ? rktVarH.b(rhrVar2, 1.0f, 1.0f, 1.0f) : rktVarH.c(1.0f, 1.0f, 1.0f, rkt.b, rkt.c);
        animatorSetB.addListener(new rkq(rktVarH));
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // defpackage.rol
    public final void m(roc rocVar) {
        h().g(rocVar);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rkt rktVarH = h();
        rnx rnxVar = rktVarH.m;
        if (rnxVar != null) {
            rnt.p(rktVarH.B, rnxVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        h().i();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rpc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rpc rpcVar = (rpc) parcelable;
        super.onRestoreInstanceState(rpcVar.d);
        rpa rpaVar = this.n;
        Bundle bundle = (Bundle) rpcVar.a.get("expandableWidgetHelper");
        coe.d(bundle);
        rpaVar.b = bundle.getBoolean("expanded", false);
        rpaVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (rpaVar.b) {
            View view = (View) rpaVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(view);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        rpc rpcVar = new rpc(parcelableOnSaveInstanceState);
        aaa aaaVar = rpcVar.a;
        rpa rpaVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", rpaVar.b);
        bundle.putInt("expandedComponentIdHint", rpaVar.a);
        aaaVar.put("expandableWidgetHelper", bundle);
        return rpcVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Rect rect2 = this.c;
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            int i = -this.m.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            rkt rktVarH = h();
            rnx rnxVar = rktVarH.m;
            if (rnxVar != null) {
                rnxVar.setTintList(colorStateList);
            }
            rki rkiVar = rktVarH.o;
            if (rkiVar != null) {
                rkiVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            rnx rnxVar = h().m;
            if (rnxVar != null) {
                rnxVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        rnx rnxVar = h().m;
        if (rnxVar != null) {
            rnxVar.l(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            h().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.k(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        h();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        h();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        h();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        h();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        h();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(rqb.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = rlg.a(context2, attributeSet, rku.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = rnt.d(context2, typedArrayA, 1);
        this.f = a.n(typedArrayA.getInt(2, -1), null);
        this.g = rnt.d(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        rkt rktVarH = h();
        if (rktVarH.z != dimensionPixelSize2) {
            rktVarH.z = dimensionPixelSize2;
            rktVarH.h();
        }
        rhr rhrVarA = rhr.a(context2, typedArrayA, 15);
        rhr rhrVarA2 = rhr.a(context2, typedArrayA, 8);
        roc rocVar = new roc(roc.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, roc.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        iua iuaVar = new iua(this);
        this.o = iuaVar;
        iuaVar.i(attributeSet, i);
        this.n = new rpa(this);
        h().g(rocVar);
        rkt rktVarH2 = h();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i2 = this.h;
        roc rocVar2 = rktVarH2.l;
        coe.d(rocVar2);
        rktVarH2.m = new rks(rocVar2);
        rktVarH2.m.setTintList(colorStateList2);
        if (mode != null) {
            rktVarH2.m.setTintMode(mode);
        }
        rktVarH2.m.j(rktVarH2.B.getContext());
        if (i2 > 0) {
            Context context3 = rktVarH2.B.getContext();
            roc rocVar3 = rktVarH2.l;
            coe.d(rocVar3);
            rki rkiVar = new rki(rocVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            rkiVar.c = color;
            rkiVar.d = color2;
            rkiVar.e = color3;
            rkiVar.f = color4;
            float f = i2;
            if (rkiVar.b != f) {
                rkiVar.b = f;
                rkiVar.a.setStrokeWidth(f * 1.3333f);
                rkiVar.g = true;
                rkiVar.invalidateSelf();
            }
            rkiVar.b(colorStateList2);
            rktVarH2.o = rkiVar;
            rki rkiVar2 = rktVarH2.o;
            coe.d(rkiVar2);
            rnx rnxVar = rktVarH2.m;
            coe.d(rnxVar);
            layerDrawable = new LayerDrawable(new Drawable[]{rkiVar2, rnxVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            rktVarH2.o = null;
            layerDrawable = rktVarH2.m;
        }
        rktVarH2.n = new RippleDrawable(rnl.b(colorStateList), layerDrawable, drawable);
        rktVarH2.p = rktVarH2.n;
        h().u = dimensionPixelSize;
        rkt rktVarH3 = h();
        if (rktVarH3.r != dimension) {
            rktVarH3.r = dimension;
            rktVarH3.e(dimension, rktVarH3.s, rktVarH3.t);
        }
        rkt rktVarH4 = h();
        if (rktVarH4.s != dimension2) {
            rktVarH4.s = dimension2;
            rktVarH4.e(rktVarH4.r, dimension2, rktVarH4.t);
        }
        rkt rktVarH5 = h();
        if (rktVarH5.t != dimension3) {
            rktVarH5.t = dimension3;
            rktVarH5.e(rktVarH5.r, rktVarH5.s, dimension3);
        }
        h().w = rhrVarA;
        h().x = rhrVarA2;
        h().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }
}
