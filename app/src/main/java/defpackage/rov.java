package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rov extends FrameLayout {
    private static final View.OnTouchListener h = new rou();
    public row a;
    roc b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff.Mode l;

    protected rov(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        row rowVar = this.a;
        if (rowVar != null && (rootWindowInsets = rowVar.j.getRootWindowInsets()) != null) {
            rowVar.o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            rowVar.h();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        row rowVar = this.a;
        if (rowVar != null) {
            rpb rpbVarA = rpb.a();
            Object obj = rpbVarA.a;
            AmbientMode.AmbientController ambientController = rowVar.s;
            synchronized (obj) {
                z = true;
                if (!rpbVarA.g(ambientController) && !rpbVarA.h(ambientController)) {
                    z = false;
                }
            }
            if (z) {
                row.a.post(new qly(rowVar, 19, null));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        row rowVar = this.a;
        if (rowVar == null || !rowVar.q) {
            return;
        }
        rowVar.g();
        rowVar.q = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.k);
            drawable.setTintMode(this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.l);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.g || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        row rowVar = this.a;
        if (rowVar != null) {
            rowVar.h();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected rov(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(rqb.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, rox.a);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.b = new roc(roc.c(context2, attributeSet, 0, 0));
        }
        float f = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(rnt.d(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(a.n(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int iR = qpt.R(qpt.P(this, R.attr.colorSurface), qpt.P(this, R.attr.colorOnSurface), f);
            roc rocVar = this.b;
            if (rocVar != null) {
                String str = row.b;
                rnx rnxVar = new rnx(rocVar);
                rnxVar.n(ColorStateList.valueOf(iR));
                gradientDrawable = rnxVar;
            } else {
                Resources resources = getResources();
                String str2 = row.b;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iR);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackgroundDrawable(gradientDrawable);
        }
    }
}
