package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.qpt;
import defpackage.rie;
import defpackage.rlg;
import defpackage.rlh;
import defpackage.rnt;
import defpackage.rnx;
import defpackage.rqb;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] E = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer F;
    private boolean G;
    private boolean H;
    private ImageView.ScaleType I;
    private Boolean J;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void z(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rnt.o(this);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.G || this.H) {
            List listA = rlh.a(this, this.t);
            TextView textView = listA.isEmpty() ? null : (TextView) Collections.min(listA, rlh.a);
            List listA2 = rlh.a(this, this.u);
            TextView textView2 = listA2.isEmpty() ? null : (TextView) Collections.max(listA2, rlh.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.G && textView != null) {
                    z(textView, pair);
                }
                if (this.H && textView2 != null) {
                    z(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.e;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.J;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.I;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        if (drawable != null && this.F != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.F.intValue());
        }
        super.p(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        rnt.n(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListJ;
        super(rqb.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayA = rlg.a(context2, attributeSet, rie.e, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.F = Integer.valueOf(typedArrayA.getColor(2, -1));
            Drawable drawableE = e();
            if (drawableE != null) {
                p(drawableE);
            }
        }
        this.G = typedArrayA.getBoolean(4, false);
        this.H = typedArrayA.getBoolean(3, false);
        int i2 = typedArrayA.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.I = E[i2];
        }
        if (typedArrayA.hasValue(0)) {
            this.J = Boolean.valueOf(typedArrayA.getBoolean(0, false));
        }
        typedArrayA.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListJ = ColorStateList.valueOf(0);
        } else {
            colorStateListJ = qpt.J(background);
        }
        if (colorStateListJ != null) {
            rnx rnxVar = new rnx();
            rnxVar.n(colorStateListJ);
            rnxVar.j(context2);
            rnxVar.l(getElevation());
            setBackground(rnxVar);
        }
    }
}
