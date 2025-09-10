package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.ckl;
import defpackage.cku;
import defpackage.con;
import defpackage.nvx;
import defpackage.nwb;
import defpackage.nwd;
import defpackage.nwe;
import defpackage.nwf;
import defpackage.nwg;
import defpackage.nwj;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearChipButton extends nwb {
    private FrameLayout A;
    private View B;
    private ImageView C;
    private CharSequence D;
    private int E;
    private ColorStateList F;
    private int G;
    private int H;
    private int I;
    private int J;
    private Drawable K;
    private Drawable L;
    private Drawable M;
    private Drawable N;
    private int O;
    private boolean P;
    private boolean Q;
    private Transition R;
    private boolean S;
    private final int T;
    public CompoundButton s;
    public boolean t;
    private final int u;
    private final cku v;
    private final ViewTreeObserver.OnPreDrawListener w;
    private nwe x;
    private TextView y;
    private TextView z;

    public WearChipButton(Context context) {
        this(context, null);
    }

    private final void A() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.S) {
            return;
        }
        cku ckuVar = this.v;
        ckuVar.g(this);
        if (this.o.getVisibility() == 0 && this.y.getVisibility() == 8 && this.z.getVisibility() == 8 && this.x == nwe.NONE) {
            ckuVar.r(R.id.start_guideline, this.I);
            ckuVar.s(R.id.end_guideline, this.I);
            ckuVar.i(R.id.wear_chip_icon, 7, R.id.end_guideline, 6);
        } else {
            ckuVar.r(R.id.start_guideline, this.J);
            ckuVar.s(R.id.end_guideline, this.J);
            ckuVar.f(R.id.wear_chip_icon, 7);
        }
        if (s()) {
            int i = this.z.getVisibility() == 0 ? R.id.top_text_center_line : 0;
            ckuVar.i(R.id.wear_chip_primary_text, 3, i, 3);
            ckuVar.i(R.id.wear_chip_primary_text, 4, i, 4);
        }
        ckuVar.c(this);
    }

    private final void B() {
        CompoundButton compoundButton = this.s;
        if (compoundButton != null) {
            setStateDescription(compoundButton.getStateDescription());
        }
    }

    private final void C(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.S || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(this.o.getVisibility() == 0 ? getResources().getDimensionPixelSize(R.dimen.wear_button_padding_between_icon_and_text) : 0);
        view.setLayoutParams(marginLayoutParams);
    }

    private static final void D(TextView textView, int i) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i);
        }
    }

    private final int t(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    private static int u(boolean z) {
        return z ? 255 : 0;
    }

    private final nwf v() {
        CompoundButton compoundButton = this.s;
        return new nwf(compoundButton != null ? compoundButton.getAccessibilityClassName() : null, m(), this.z.getVisibility() == 0 ? this.z.getText() : "");
    }

    private final void w(AccessibilityEvent accessibilityEvent) {
        nwf nwfVarV = v();
        accessibilityEvent.setClassName(nwfVarV.a);
        if (accessibilityEvent.getContentChangeTypes() != 64) {
            CharSequence charSequence = nwfVarV.b;
            if (charSequence.length() > 0) {
                accessibilityEvent.getText().add(charSequence);
            }
            CharSequence charSequence2 = nwfVarV.c;
            if (charSequence2.length() > 0) {
                accessibilityEvent.getText().add(charSequence2);
            }
        }
        accessibilityEvent.setChecked(this.p);
    }

    private final void x(boolean z) {
        CompoundButton compoundButton = this.s;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
            B();
        }
    }

    private final void y() {
        Drawable drawable = this.K;
        if (drawable == null || this.M == null || this.L == null || this.N == null) {
            return;
        }
        boolean z = this.O == 1;
        boolean z2 = this.s == null;
        drawable.setAlpha(u(z2 && !z));
        this.L.setAlpha(u(z2 && z));
        this.M.setAlpha(u((z2 || z) ? false : true));
        this.N.setAlpha(u(!z2 && z));
    }

    private final void z() {
        CharSequence charSequenceM = this.D;
        if (charSequenceM == null) {
            charSequenceM = m();
        }
        this.B.setContentDescription(m());
        this.A.setContentDescription(charSequenceM);
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setContentDescription(charSequenceM);
            this.C.setImportantForAccessibility(2);
        }
        CompoundButton compoundButton = this.s;
        if (compoundButton != null) {
            compoundButton.setContentDescription(charSequenceM);
        }
        this.A.setImportantForAccessibility(2);
        B();
    }

    @Override // defpackage.nwb
    protected final void i(ColorStateList colorStateList) {
        Drawable background = getBackground();
        Drawable drawable = this.K;
        if (drawable == null || this.M == null || this.L == null || this.N == null) {
            if (background != null) {
                background.mutate().setTintList(colorStateList);
            }
        } else {
            drawable.mutate().setTintList(colorStateList);
            this.L.mutate().setTintList(colorStateList);
            this.M.mutate().setTintList(colorStateList);
            this.N.mutate().setTintList(colorStateList);
        }
    }

    @Override // defpackage.nwb
    public final void l(int i) {
        if (i != 0) {
            r();
            this.o.setImageResource(i);
            this.o.setVisibility(0);
            this.o.setDuplicateParentStateEnabled(true);
            n();
        }
    }

    public final CharSequence m() {
        return this.y.getVisibility() == 0 ? this.y.getText() : "";
    }

    public final void n() {
        C(this.y);
        C(this.z);
        A();
    }

    public final void o(nwe nweVar) {
        if (this.x == nweVar) {
            return;
        }
        r();
        this.A.removeAllViews();
        this.s = null;
        this.C = null;
        this.x = nweVar;
        nwe nweVar2 = nwe.NONE;
        int i = nweVar.f;
        if (i != 0) {
            LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.A, true);
            if (nweVar == nwe.ICON) {
                ImageView imageView = (ImageView) this.A.findViewById(R.id.wear_chip_end_icon);
                this.C = imageView;
                imageView.setImageResource(this.E);
                this.C.setImageTintList(this.F);
            } else {
                this.s = (CompoundButton) this.A.findViewById(R.id.wear_chip_selection_control);
                x(this.p);
            }
        }
        boolean z = nweVar == nwe.ICON || this.s != null;
        this.A.setVisibility(true != z ? 8 : 0);
        int dimensionPixelSize = z ? getResources().getDimensionPixelSize(R.dimen.wear_chip_button_selection_control_start_margin) : 0;
        D(this.y, dimensionPixelSize);
        D(this.z, dimensionPixelSize);
        n();
        y();
        z();
        this.A.setForeground(null);
    }

    @Override // defpackage.nwb, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootView().getViewTreeObserver().addOnPreDrawListener(this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TransitionManager.endTransitions(this);
        this.t = false;
        getRootView().getViewTreeObserver().removeOnPreDrawListener(this.w);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        w(accessibilityEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        nwf nwfVarV = v();
        accessibilityNodeInfo.setClassName(nwfVarV.a);
        accessibilityNodeInfo.setText(nwfVarV.a());
        accessibilityNodeInfo.setCheckable(this.q);
        accessibilityNodeInfo.setChecked(this.p);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iT;
        super.onMeasure(i, i2);
        if (s()) {
            return;
        }
        int i3 = this.d;
        int measuredHeight = getMeasuredHeight();
        int iT2 = 0;
        boolean z = true;
        if (i3 != 0 && measuredHeight >= i3 && this.y.getLineCount() + this.z.getLineCount() == 2) {
            z = false;
        }
        if (this.P == z) {
            return;
        }
        this.P = z;
        if (z) {
            iT2 = t(R.dimen.wear_multiline_button_top_padding);
            iT = t(R.dimen.wear_multiline_button_bottom_padding);
        } else {
            iT = 0;
        }
        cku ckuVar = this.v;
        ckuVar.g(this);
        ckuVar.r(R.id.top_guideline, iT2);
        ckuVar.s(R.id.bottom_guideline, iT);
        ckuVar.c(this);
        measure(i, i2);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        w(accessibilityEvent);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.O != i) {
            this.O = i;
            y();
        }
    }

    public final void p(CharSequence charSequence) {
        if (this.y == null) {
            return;
        }
        r();
        if (TextUtils.isEmpty(charSequence)) {
            this.y.setVisibility(8);
        } else {
            this.y.setVisibility(0);
            ContentChangeTransition.c(this.y, charSequence);
            A();
        }
        z();
    }

    public final void q(CharSequence charSequence) {
        r();
        if (TextUtils.isEmpty(charSequence)) {
            this.z.setVisibility(8);
            this.y.setMaxLines(this.G);
        } else {
            this.z.setVisibility(0);
            ContentChangeTransition.c(this.z, charSequence);
            this.y.setMaxLines(this.H);
        }
        A();
    }

    public final void r() {
        if (this.Q && !this.S && this.t) {
            if (this.y.getVisibility() == 8 && this.z.getVisibility() == 8) {
                return;
            }
            TransitionManager.beginDelayedTransition(this, this.R);
        }
    }

    final boolean s() {
        return this.T == 1;
    }

    @Override // defpackage.nwb, android.view.View
    public final void setBackground(Drawable drawable) {
        if (getBackground() != drawable) {
            r();
            super.setBackground(drawable);
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                this.K = layerDrawable.findDrawableByLayerId(R.id.wear_chip_start_accent);
                this.L = layerDrawable.findDrawableByLayerId(R.id.wear_chip_start_accent_rtl);
                this.M = layerDrawable.findDrawableByLayerId(R.id.wear_chip_end_accent);
                this.N = layerDrawable.findDrawableByLayerId(R.id.wear_chip_end_accent_rtl);
            } else {
                this.K = null;
                this.L = null;
                this.M = null;
                this.N = null;
            }
            y();
        }
    }

    @Override // defpackage.nwb, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        x(z);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.x == nwe.ICON) {
            this.A.setEnabled(isEnabled());
            ImageView imageView = this.C;
            if (imageView != null) {
                imageView.setEnabled(isEnabled());
            }
        } else {
            this.A.setEnabled(isEnabled());
        }
        this.B.setEnabled(z);
    }

    public WearChipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wearChipButtonStyle);
    }

    /* JADX WARN: Finally extract failed */
    public WearChipButton(Context context, AttributeSet attributeSet, int i) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ImageView imageView;
        super(context, attributeSet, i);
        cku ckuVar = new cku();
        this.v = ckuVar;
        this.w = new nwd(this, 0);
        this.x = nwe.NONE;
        this.O = 0;
        this.P = true;
        this.Q = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, nvx.b, i, R.style.WearChipButtonDefault);
        try {
            int i2 = typedArrayObtainStyledAttributes.getInt(6, 0) == 1 ? 2 : 1;
            typedArrayObtainStyledAttributes.recycle();
            this.T = i2;
            int dimensionPixelSize = getResources().getDimensionPixelSize(true != s() ? R.dimen.wear_multiline_button_start_padding : R.dimen.wear_button_start_padding);
            this.u = dimensionPixelSize;
            this.I = dimensionPixelSize;
            this.J = dimensionPixelSize;
            LayoutInflater.from(getContext()).inflate(R.layout.wear_chip_button_layout, (ViewGroup) this, true);
            this.o = (ImageView) findViewById(R.id.wear_chip_icon);
            this.y = (TextView) findViewById(R.id.wear_chip_primary_text);
            this.z = (TextView) findViewById(R.id.wear_chip_secondary_text);
            this.A = (FrameLayout) findViewById(R.id.wear_chip_selection_control_container);
            this.B = findViewById(R.id.wear_chip_start);
            if (!s()) {
                ckuVar.g(this);
                ckuVar.r(R.id.start_guideline, t(R.dimen.wear_multiline_button_start_padding));
                ckuVar.s(R.id.end_guideline, t(R.dimen.wear_multiline_button_end_padding));
                ckuVar.r(R.id.top_guideline, t(R.dimen.wear_multiline_button_top_padding));
                ckuVar.s(R.id.bottom_guideline, t(R.dimen.wear_multiline_button_bottom_padding));
                ckuVar.q(R.id.wear_chip_primary_text);
                ckuVar.q(R.id.wear_chip_secondary_text);
                ckuVar.i(R.id.wear_chip_primary_text, 3, R.id.top_guideline, 3);
                ckuVar.i(R.id.wear_chip_primary_text, 4, R.id.wear_chip_secondary_text, 3);
                ckuVar.i(R.id.wear_chip_secondary_text, 3, R.id.wear_chip_primary_text, 4);
                ckuVar.i(R.id.wear_chip_secondary_text, 4, R.id.bottom_guideline, 4);
                ckuVar.b(R.id.wear_chip_primary_text).d.Y = 2;
                ckuVar.c(this);
            }
            setTransitionName("WearChipButton:Transition");
            this.R = TransitionInflater.from(getContext()).inflateTransition(R.transition.wear_chip_button_state);
            this.S = true;
            super.j(attributeSet, i);
            TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(attributeSet, nvx.b, i, R.style.WearChipButtonDefault);
            try {
                this.G = getContext().getResources().getInteger(true != s() ? R.integer.wear_multiline_button_primary_text_max_lines : R.integer.wear_button_primary_text_max_lines);
                this.H = getContext().getResources().getInteger(true != s() ? R.integer.wear_multiline_button_primary_text_max_lines_with_secondary : R.integer.wear_button_primary_text_max_lines_with_secondary);
                if (typedArrayObtainStyledAttributes2.hasValue(7)) {
                    p(typedArrayObtainStyledAttributes2.getString(7));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(8)) {
                    this.y.setTextAppearance(typedArrayObtainStyledAttributes2.getResourceId(8, 0));
                    this.y.setMaxLines(this.G);
                } else {
                    this.y.setTextAppearance(R.style.PrimaryTextAppearanceWearButton);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(9)) {
                    ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(9);
                    this.y.setTextColor(colorStateList == null ? ColorStateList.valueOf(-1) : colorStateList);
                }
                int i3 = typedArrayObtainStyledAttributes2.getInt(10, 0);
                if (i3 >= 0) {
                    nwj.c();
                    if (i3 < 2) {
                        int i4 = nwj.c()[i3];
                        ckl cklVar = (ckl) this.y.getLayoutParams();
                        cklVar.G = i4 == 1 ? 0.0f : 0.5f;
                        this.y.setLayoutParams(cklVar);
                        this.y.setGravity(i4 == 1 ? 8388611 : 1);
                        this.y.setTextAlignment(i4 == 1 ? 5 : 4);
                    }
                }
                if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                    int i5 = typedArrayObtainStyledAttributes2.getInt(11, this.G);
                    this.G = i5;
                    this.H = i5;
                    this.y.setMaxLines(i5);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(12)) {
                    q(typedArrayObtainStyledAttributes2.getString(12));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(13)) {
                    this.z.setTextAppearance(typedArrayObtainStyledAttributes2.getResourceId(13, 0));
                } else {
                    this.z.setTextAppearance(R.style.SecondaryTextAppearanceWearButton);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(14)) {
                    ColorStateList colorStateList2 = typedArrayObtainStyledAttributes2.getColorStateList(14);
                    this.z.setTextColor(colorStateList2 == null ? ColorStateList.valueOf(-1) : colorStateList2);
                }
                if (!typedArrayObtainStyledAttributes2.getBoolean(15, true)) {
                    this.z.setVisibility(8);
                }
                int iT = t(R.dimen.wear_chip_button_icon_size);
                if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(18, iT);
                    ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
                    layoutParams.width = dimensionPixelSize2;
                    layoutParams.height = dimensionPixelSize2;
                    this.o.setLayoutParams(layoutParams);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                    this.I = typedArrayObtainStyledAttributes2.getDimensionPixelSize(5, dimensionPixelSize);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                    this.J = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
                }
                this.z.setMaxLines(typedArrayObtainStyledAttributes2.getInt(16, true != s() ? 2 : 1));
                nwe nweVar = nwe.NONE;
                int i6 = typedArrayObtainStyledAttributes2.getInt(2, 0);
                if (i6 >= 0 && i6 < nwe.values().length) {
                    nweVar = nwe.values()[i6];
                }
                o(nweVar);
                if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                    this.E = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    ImageView imageView2 = this.C;
                    if (imageView2 != null) {
                        r();
                        imageView2.setImageResource(this.E);
                    }
                }
                if (typedArrayObtainStyledAttributes2.hasValue(17)) {
                    this.D = typedArrayObtainStyledAttributes2.getString(17);
                    z();
                }
                if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                    ColorStateList colorStateList3 = typedArrayObtainStyledAttributes2.getColorStateList(1);
                    this.F = colorStateList3;
                    if (this.x == nwe.ICON && (imageView = this.C) != null) {
                        imageView.setImageTintList(colorStateList3);
                    }
                }
                this.Q = typedArrayObtainStyledAttributes2.getBoolean(3, this.Q);
                this.S = false;
                typedArrayObtainStyledAttributes2.recycle();
                n();
                C(this.y);
                C(this.z);
                con.i(this.A, new nwg(this, this));
            } catch (Throwable th) {
                this.S = false;
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
