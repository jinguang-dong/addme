package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnf extends hx {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public rnf(Context context, AttributeSet attributeSet) {
        super(rqb.a(context, attributeSet, com.google.ar.core.R.attr.radioButtonStyle, com.google.ar.core.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = rlg.a(context2, attributeSet, rng.a, com.google.ar.core.R.attr.radioButtonStyle, com.google.ar.core.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(rnt.d(context2, typedArrayA, 0));
        }
        this.c = typedArrayA.getBoolean(1, false);
        typedArrayA.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int iP = qpt.P(this, com.google.ar.core.R.attr.colorControlActivated);
                int iP2 = qpt.P(this, com.google.ar.core.R.attr.colorOnSurface);
                int iP3 = qpt.P(this, com.google.ar.core.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{qpt.R(iP3, iP, 1.0f), qpt.R(iP3, iP2, 0.54f), qpt.R(iP3, iP2, 0.38f), qpt.R(iP3, iP2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
