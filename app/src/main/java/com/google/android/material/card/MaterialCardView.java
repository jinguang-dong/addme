package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.qpt;
import defpackage.rjr;
import defpackage.rjs;
import defpackage.rlg;
import defpackage.rnt;
import defpackage.roc;
import defpackage.rol;
import defpackage.rqb;
import defpackage.xv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, rol {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    private boolean i;
    public final rjr l;
    public boolean m;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public final void c(float f) {
        super.c(f);
        rjr rjrVar = this.l;
        rjrVar.f(rjrVar.m.e(f));
        rjrVar.i.invalidateSelf();
        if (rjrVar.m() || rjrVar.l()) {
            rjrVar.h();
        }
        if (rjrVar.m()) {
            if (!rjrVar.q) {
                super.setBackgroundDrawable(rjrVar.d(rjrVar.c));
            }
            rjrVar.a.setForeground(rjrVar.d(rjrVar.i));
        }
    }

    public final boolean g() {
        rjr rjrVar = this.l;
        return rjrVar != null && rjrVar.r;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // defpackage.rol
    public final void m(roc rocVar) {
        RectF rectF = new RectF();
        rjr rjrVar = this.l;
        rectF.set(rjrVar.c.getBounds());
        setClipToOutline(rocVar.g(rectF));
        rjrVar.f(rocVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rjr rjrVar = this.l;
        rjrVar.g();
        rnt.p(this, rjrVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (g()) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        if (this.m) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        rjr rjrVar = this.l;
        if (rjrVar.p != null) {
            MaterialCardView materialCardView = rjrVar.a;
            if (materialCardView.a) {
                float fB = rjrVar.b();
                iCeil = (int) Math.ceil(fB + fB);
                float fA = rjrVar.a();
                iCeil2 = (int) Math.ceil(fA + fA);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i3 = rjrVar.k() ? ((measuredWidth - rjrVar.e) - rjrVar.f) - iCeil2 : rjrVar.e;
            int i4 = rjrVar.j() ? rjrVar.e : ((measuredHeight - rjrVar.e) - rjrVar.f) - iCeil;
            int i5 = rjrVar.k() ? rjrVar.e : ((measuredWidth - rjrVar.e) - rjrVar.f) - iCeil2;
            int i6 = rjrVar.j() ? ((measuredHeight - rjrVar.e) - rjrVar.f) - iCeil : rjrVar.e;
            int layoutDirection = materialCardView.getLayoutDirection();
            rjrVar.p.setLayerInset(2, layoutDirection != 1 ? i3 : i5, i6, layoutDirection == 1 ? i3 : i5, i4);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            rjr rjrVar = this.l;
            if (!rjrVar.q) {
                rjrVar.q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.m != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        rjr rjrVar = this.l;
        if (rjrVar != null) {
            rjrVar.g();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (g() && isEnabled()) {
            this.m = !this.m;
            refreshDrawableState();
            rjr rjrVar = this.l;
            Drawable drawable = rjrVar.o;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                rjrVar.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                rjrVar.o.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            rjrVar.e(this.m, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(rqb.a(context, attributeSet, i, com.google.ar.core.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.m = false;
        this.i = true;
        TypedArray typedArrayA = rlg.a(getContext(), attributeSet, rjs.a, i, com.google.ar.core.R.style.Widget_MaterialComponents_CardView, new int[0]);
        rjr rjrVar = new rjr(this, attributeSet, i);
        this.l = rjrVar;
        rjrVar.c.n(((xv) this.e.a).e);
        rjrVar.b.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        rjrVar.h();
        rjrVar.n = rnt.d(rjrVar.a.getContext(), typedArrayA, 11);
        if (rjrVar.n == null) {
            rjrVar.n = ColorStateList.valueOf(-1);
        }
        rjrVar.h = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        rjrVar.r = z;
        rjrVar.a.setLongClickable(z);
        rjrVar.l = rnt.d(rjrVar.a.getContext(), typedArrayA, 6);
        Drawable drawableE = rnt.e(rjrVar.a.getContext(), typedArrayA, 2);
        if (drawableE != null) {
            rjrVar.j = drawableE.mutate();
            rjrVar.j.setTintList(rjrVar.l);
            rjrVar.e(rjrVar.a.m, false);
        } else {
            rjrVar.j = null;
        }
        LayerDrawable layerDrawable = rjrVar.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.ar.core.R.id.mtrl_card_checked_layer_id, rjrVar.j);
        }
        rjrVar.f = typedArrayA.getDimensionPixelSize(5, 0);
        rjrVar.e = typedArrayA.getDimensionPixelSize(4, 0);
        rjrVar.g = typedArrayA.getInteger(3, 8388661);
        rjrVar.k = rnt.d(rjrVar.a.getContext(), typedArrayA, 7);
        if (rjrVar.k == null) {
            rjrVar.k = ColorStateList.valueOf(qpt.P(rjrVar.a, com.google.ar.core.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListD = rnt.d(rjrVar.a.getContext(), typedArrayA, 1);
        rjrVar.d.n(colorStateListD == null ? ColorStateList.valueOf(0) : colorStateListD);
        Drawable drawable = rjrVar.o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(rjrVar.k);
        }
        rjrVar.c.l(((View) rjrVar.a.e.b).getElevation());
        rjrVar.i();
        super.setBackgroundDrawable(rjrVar.d(rjrVar.c));
        rjrVar.i = rjrVar.n() ? rjrVar.c() : rjrVar.d;
        rjrVar.a.setForeground(rjrVar.d(rjrVar.i));
        typedArrayA.recycle();
    }
}
