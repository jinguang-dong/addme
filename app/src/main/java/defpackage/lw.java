package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lw {
    private static final ThreadLocal f = new ThreadLocal();
    public static final int[] a = {-16842910};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_pressed};
    static final int[] d = {R.attr.state_checked};
    public static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList colorStateListC = c(context, i);
        if (colorStateListC != null && colorStateListC.isStateful()) {
            return colorStateListC.getColorForState(a, colorStateListC.getDefaultColor());
        }
        ThreadLocal threadLocal = f;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return cmg.e(b(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        pmg pmgVarI = pmg.I(context, null, iArr);
        try {
            return pmgVarI.G();
        } finally {
            pmgVarI.D();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        pmg pmgVarI = pmg.I(context, null, iArr);
        try {
            return pmgVarI.y(0);
        } finally {
            pmgVarI.D();
        }
    }

    public static void d(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fa.j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
