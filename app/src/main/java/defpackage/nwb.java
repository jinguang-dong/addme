package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nwb extends ConstraintLayout implements Checkable {
    static final int[] i = {-16842910};
    static final int[] j = {R.attr.state_enabled, -16842912};
    static final int[] k = {R.attr.state_enabled, R.attr.state_checked};
    private static final int[] s = {R.attr.state_checked};
    protected ColorStateList l;
    protected ColorStateList m;
    public Drawable n;
    public ImageView o;
    protected boolean p;
    protected boolean q;
    protected boolean r;
    private ColorStateList t;
    private ColorStateList u;
    private final Set v;

    public nwb(Context context) {
        this(context, null);
    }

    public static ColorStateList g(int i2, int i3) {
        return new ColorStateList(new int[][]{j, k, i}, new int[]{i3, i2, i3});
    }

    private static int m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        return colorStateList.getColorForState(k, 0);
    }

    private static int n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        return colorStateList.getColorForState(j, 0);
    }

    public final String h() {
        return (true != this.q ? Button.class : CompoundButton.class).getName();
    }

    protected void i(ColorStateList colorStateList) {
        Drawable background = getBackground();
        if (background != null) {
            background.mutate().setTintList(colorStateList);
        }
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    protected final void j(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListG;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, nvx.a, i2, com.google.ar.core.R.style.WearButtonDefault);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(4) || typedArrayObtainStyledAttributes.hasValue(9) || typedArrayObtainStyledAttributes.hasValue(3) || typedArrayObtainStyledAttributes.hasValue(8);
            if (typedArrayObtainStyledAttributes.hasValue(12)) {
                l(typedArrayObtainStyledAttributes.getResourceId(12, 0));
            }
            if (typedArrayObtainStyledAttributes.hasValueOrEmpty(7)) {
                this.t = typedArrayObtainStyledAttributes.getColorStateList(7);
            } else if (typedArrayObtainStyledAttributes.getBoolean(11, true)) {
                this.t = this.l;
            }
            if (typedArrayObtainStyledAttributes.hasValueOrEmpty(6)) {
                this.u = typedArrayObtainStyledAttributes.getColorStateList(6);
            } else {
                this.u = this.m;
            }
            if (z) {
                int color = typedArrayObtainStyledAttributes.getColor(4, m(this.t));
                int color2 = typedArrayObtainStyledAttributes.getColor(9, n(this.t));
                if (color != 0) {
                    colorStateListG = g(color, color2);
                    this.t = colorStateListG;
                    this.u = g(typedArrayObtainStyledAttributes.getColor(3, m(this.u)), typedArrayObtainStyledAttributes.getColor(8, n(this.u)));
                } else if (color2 == 0) {
                    colorStateListG = null;
                    this.t = colorStateListG;
                    this.u = g(typedArrayObtainStyledAttributes.getColor(3, m(this.u)), typedArrayObtainStyledAttributes.getColor(8, n(this.u)));
                } else {
                    color = 0;
                    colorStateListG = g(color, color2);
                    this.t = colorStateListG;
                    this.u = g(typedArrayObtainStyledAttributes.getColor(3, m(this.u)), typedArrayObtainStyledAttributes.getColor(8, n(this.u)));
                }
            }
            if (this.t != null || typedArrayObtainStyledAttributes.getBoolean(13, true)) {
                this.o.setImageTintList(this.t);
            }
            this.n = typedArrayObtainStyledAttributes.getDrawable(5);
            i(this.u);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(10, getContext().getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.wear_button_corner_radius));
            Drawable background = getBackground();
            if (background instanceof LayerDrawable) {
                background = ((LayerDrawable) background).findDrawableByLayerId(R.id.background);
            }
            Drawable drawable = this.n;
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable.mutate()).setCornerRadius(dimension);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background.mutate()).setCornerRadius(dimension);
            }
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
            k(typedArrayObtainStyledAttributes.getBoolean(2, false));
            setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
            this.r = typedArrayObtainStyledAttributes.getBoolean(15, false);
            setClipToOutline(true);
            setOutlineProvider(new nvz(this));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void k(boolean z) {
        this.q = z | (getParent() instanceof nwc);
        refreshDrawableState();
    }

    public abstract void l(int i2);

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof nwc) {
            k(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.p) {
            mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        ColorStateList colorStateList = this.u;
        double dA = cmg.a(cmg.d(colorStateList == null ? 0 : colorStateList.getColorForState(iArrOnCreateDrawableState, 0), -16777216));
        int length = iArrOnCreateDrawableState.length;
        int i3 = length - 1;
        int i4 = i3;
        while (i4 >= 0 && iArrOnCreateDrawableState[i4] == 0) {
            i4--;
        }
        if (i4 == i3) {
            int[] iArr = new int[length + 1];
            System.arraycopy(iArrOnCreateDrawableState, 0, iArr, 0, length);
            iArrOnCreateDrawableState = iArr;
        }
        iArrOnCreateDrawableState[i4 + 1] = dA >= 0.5d ? com.google.ar.core.R.attr.state_light : -2130970279;
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.q && isEnabled() && this.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate().setTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        super.setBackground(drawable);
        i(this.u);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        this.u = colorStateListValueOf;
        i(colorStateListValueOf);
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        if (!this.q || z == this.p) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        for (nwj nwjVar : DesugarCollections.unmodifiableSet(this.v)) {
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }

    public nwb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.wearButtonStyle);
    }

    public nwb(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i2);
        this.p = false;
        HashSet hashSet = new HashSet();
        this.v = hashSet;
        this.l = null;
        int iL = nwj.l(context, com.google.ar.core.R.attr.colorOnPrimary);
        this.m = g(iL, iL);
        hashSet.add(new nwj());
        con.i(this, new nwa(this));
    }
}
