package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.byi;
import defpackage.hn;
import defpackage.lz;
import defpackage.rjk;
import defpackage.rjl;
import defpackage.rjm;
import defpackage.rjn;
import defpackage.rjo;
import defpackage.rnt;
import defpackage.roc;
import defpackage.rol;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, rol {
    private static final int[] b = {R.attr.state_checkable};
    private static final int[] c = {R.attr.state_checked};
    private final LinkedHashSet d;
    private PorterDuff.Mode e;
    private ColorStateList f;
    private int g;
    private int h;
    private int i;
    public final rjn j;
    public Drawable k;
    public boolean l;
    public int m;
    public boolean n;
    int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private int v;
    private int w;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int c() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void d() {
        if (i()) {
            setCompoundDrawablesRelative(this.k, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.k, null);
        } else if (s()) {
            setCompoundDrawablesRelative(null, this.k, null, null);
        }
    }

    private final void e(boolean z) {
        if (!q() || this.q == z) {
            return;
        }
        this.q = z;
        refreshDrawableState();
        if (getParent() instanceof rjo) {
            throw null;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((rjk) it.next()).a();
        }
        this.r = false;
    }

    private final void f(boolean z) {
        Drawable drawable = this.k;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.k = drawableMutate;
            drawableMutate.setTintList(this.f);
            PorterDuff.Mode mode = this.e;
            if (mode != null) {
                this.k.setTintMode(mode);
            }
            int intrinsicWidth = this.g;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.k.getIntrinsicWidth();
            }
            int intrinsicHeight = this.g;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.k;
            int i = this.h;
            int i2 = this.i;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.k.setVisible(true, z);
        }
        if (z) {
            d();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.k) && ((!h() || drawable5 == this.k) && (!s() || drawable4 == this.k))) {
            return;
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.g(int, int):void");
    }

    private final boolean h() {
        int i = this.s;
        return i == 3 || i == 4;
    }

    private final boolean i() {
        int i = this.s;
        return i == 1 || i == 2;
    }

    private final boolean s() {
        int i = this.s;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        lz lzVar;
        if (r()) {
            return this.j.l;
        }
        hn hnVar = this.a;
        if (hnVar == null || (lzVar = hnVar.a) == null) {
            return null;
        }
        return lzVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        lz lzVar;
        if (r()) {
            return this.j.k;
        }
        hn hnVar = this.a;
        if (hnVar == null || (lzVar = hnVar.a) == null) {
            return null;
        }
        return lzVar.b;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    final String j() {
        if (TextUtils.isEmpty(null)) {
            return (true != q() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void k(int i) {
        if (r()) {
            rjn rjnVar = this.j;
            if (rjnVar.q && rjnVar.i == i) {
                return;
            }
            rjnVar.i = i;
            rjnVar.q = true;
            rjnVar.d(rjnVar.b.e(i));
        }
    }

    public final void l(Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            f(true);
            g(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // defpackage.rol
    public final void m(roc rocVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.j.d(rocVar);
    }

    public final void n(ColorStateList colorStateList) {
        if (r()) {
            rjn rjnVar = this.j;
            if (rjnVar.l != colorStateList) {
                rjnVar.l = colorStateList;
                if (rjnVar.a() != null) {
                    rjnVar.a().setTintList(rjnVar.l);
                    return;
                }
                return;
            }
            return;
        }
        hn hnVar = this.a;
        if (hnVar != null) {
            if (hnVar.a == null) {
                hnVar.a = new lz();
            }
            lz lzVar = hnVar.a;
            lzVar.a = colorStateList;
            lzVar.d = true;
            hnVar.a();
        }
    }

    public final void o(PorterDuff.Mode mode) {
        if (r()) {
            rjn rjnVar = this.j;
            if (rjnVar.k != mode) {
                rjnVar.k = mode;
                if (rjnVar.a() == null || rjnVar.k == null) {
                    return;
                }
                rjnVar.a().setTintMode(rjnVar.k);
                return;
            }
            return;
        }
        hn hnVar = this.a;
        if (hnVar != null) {
            if (hnVar.a == null) {
                hnVar.a = new lz();
            }
            lz lzVar = hnVar.a;
            lzVar.b = mode;
            lzVar.c = true;
            hnVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            rnt.p(this, this.j.a());
        }
        boolean z = false;
        if ((getParent() instanceof rjm) && ((rjm) getParent()).getOrientation() == 0) {
            z = true;
        }
        this.n = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (q()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        if (this.q) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(j());
        accessibilityEvent.setChecked(this.q);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(j());
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        g(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.u = -1.0f;
        }
        if (this.u == -1.0f) {
            this.u = getMeasuredWidth();
            if (getParent() instanceof rjm) {
                throw null;
            }
        }
        if (this.o == -1) {
            Drawable drawable = this.k;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.p;
                int intrinsicWidth = this.g;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.o = (getMeasuredWidth() - c()) - i5;
        }
        if (this.v == -1) {
            this.v = getPaddingStart();
        }
        if (this.w == -1) {
            this.w = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rjl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rjl rjlVar = (rjl) parcelable;
        super.onRestoreInstanceState(rjlVar.d);
        e(rjlVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        rjl rjlVar = new rjl(super.onSaveInstanceState());
        rjlVar.a = this.q;
        return rjlVar;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p() {
        int i = this.m;
        getLayoutParams().width = (int) (this.u + 0.0f);
        setPaddingRelative(this.v + i, getPaddingTop(), this.w - i, getPaddingBottom());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.j.s) {
            toggle();
        }
        return super.performClick();
    }

    public final boolean q() {
        rjn rjnVar = this.j;
        return rjnVar != null && rjnVar.r;
    }

    public final boolean r() {
        rjn rjnVar = this.j;
        return (rjnVar == null || rjnVar.p) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.k != null) {
            if (this.k.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!r()) {
            super.setBackgroundColor(i);
            return;
        }
        rjn rjnVar = this.j;
        if (rjnVar.a() != null) {
            rjnVar.a().setTint(i);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.j.c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? byi.bJ(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        n(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        o(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        e(z);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.j.a().l(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        g(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.u = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        e(!this.q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r25, android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
