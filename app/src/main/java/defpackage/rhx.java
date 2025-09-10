package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhx extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public qat c;

    public rhx() {
        super(-1, -2);
        this.a = 1;
    }

    public rhx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rie.b);
        this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(0, 0) == 1 ? new qat((byte[]) null) : null;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public rhx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public rhx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public rhx(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
