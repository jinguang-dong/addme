package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlg {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorPrimaryVariant};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        e(context, attributeSet, i, i2);
        f(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void b(Context context) {
        g(context, a, "Theme.AppCompat");
    }

    public static boolean c(Context context) {
        return rnt.i(context, R.attr.isMaterial3Theme, false);
    }

    public static pmg d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        e(context, attributeSet, i, i2);
        f(context, attributeSet, iArr, i, i2, iArr2);
        return pmg.J(context, attributeSet, iArr, i, i2);
    }

    private static void e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rle.b, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                g(context, b, "Theme.MaterialComponents");
            }
        }
        b(context);
    }

    private static void f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rle.b, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[0], -1) == -1) {
                typedArrayObtainStyledAttributes2.recycle();
            } else {
                typedArrayObtainStyledAttributes2.recycle();
                z = true;
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void g(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalArgumentException(a.bw(str, "The style on this component requires your app theme to be ", " (or a descendant)."));
        }
    }
}
