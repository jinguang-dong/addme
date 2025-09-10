package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjw extends ho {
    private static final int e = 2132085437;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final dho x;
    private final dhj y;

    /* JADX WARN: Illegal instructions before constructor call */
    public rjw(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iX;
        ColorStateList colorStateListB;
        int i2 = e;
        super(rqb.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        Context context2 = getContext();
        dho dhoVar = new dho(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = cme.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(dhoVar.d);
        new dhn(drawable.getConstantState());
        dhoVar.e = drawable;
        this.x = dhoVar;
        this.y = new rjt(this);
        Context context3 = getContext();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        hq hqVar = this.a;
        if (hqVar != null) {
            hqVar.b = true;
            hqVar.a();
        }
        pmg pmgVarD = rlg.d(context3, attributeSet, rjx.a, R.attr.checkboxStyle, i2, new int[0]);
        this.q = pmgVarD.z(2);
        if (this.p != null && rlg.c(context3)) {
            int iX2 = pmgVarD.x(0, 0);
            int iX3 = pmgVarD.x(1, 0);
            if (iX2 == i && iX3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = byi.bJ(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = byi.bJ(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = (!pmgVarD.F(3) || (iX = pmgVarD.x(3, 0)) == 0 || (colorStateListB = clu.b(context3, iX)) == null) ? pmgVarD.y(3) : colorStateListB;
        this.s = a.n(pmgVarD.u(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = pmgVarD.E(10, false);
        this.m = pmgVarD.E(6, true);
        this.n = pmgVarD.E(9, false);
        this.o = pmgVarD.B(8);
        if (pmgVarD.F(7)) {
            a(pmgVarD.u(7, 0));
        }
        pmgVarD.D();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.p = qpt.N(this.p, this.b, getButtonTintMode());
        Drawable drawable = this.q;
        ColorStateList colorStateList2 = this.c;
        this.q = qpt.N(drawable, colorStateList2, this.s);
        if (this.r) {
            dho dhoVar = this.x;
            if (dhoVar != null) {
                dhj dhjVar = this.y;
                if (dhjVar != null) {
                    Drawable drawable2 = dhoVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(dhjVar.a());
                    }
                    ArrayList arrayList = dhoVar.c;
                    if (arrayList != null) {
                        arrayList.remove(dhjVar);
                        if (dhoVar.c.size() == 0 && (animatorListener = dhoVar.b) != null) {
                            dhoVar.a.c.removeListener(animatorListener);
                            dhoVar.b = null;
                        }
                    }
                }
                if (dhjVar != null) {
                    Drawable drawable3 = dhoVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(dhjVar.a());
                    } else {
                        if (dhoVar.c == null) {
                            dhoVar.c = new ArrayList();
                        }
                        if (!dhoVar.c.contains(dhjVar)) {
                            dhoVar.c.add(dhjVar);
                            if (dhoVar.b == null) {
                                dhoVar.b = new dhl(dhoVar);
                            }
                            dhoVar.a.c.addListener(dhoVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.p;
            if ((drawable4 instanceof AnimatedStateListDrawable) && dhoVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, dhoVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, dhoVar, false);
            }
        }
        Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        super.setButtonDrawable(qpt.K(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        if (this.v == null) {
            int i2 = this.t;
            super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
        }
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((rju) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iP = qpt.P(this, R.attr.colorControlActivated);
                int iP2 = qpt.P(this, R.attr.colorError);
                int iP3 = qpt.P(this, R.attr.colorSurface);
                int iP4 = qpt.P(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{qpt.R(iP3, iP2, 1.0f), qpt.R(iP3, iP, 1.0f), qpt.R(iP3, iP4, 0.54f), qpt.R(iP3, iP4, 0.38f), qpt.R(iP3, iP4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.d = qpt.M(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == qpt.I(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rjv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rjv rjvVar = (rjv) parcelable;
        super.onRestoreInstanceState(rjvVar.getSuperState());
        a(rjvVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        rjv rjvVar = new rjv(super.onSaveInstanceState());
        rjvVar.a = this.t;
        return rjvVar;
    }

    @Override // defpackage.ho, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(byi.bJ(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        hq hqVar = this.a;
        if (hqVar != null) {
            hqVar.a = mode;
            hqVar.c = true;
            hqVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.ho, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
