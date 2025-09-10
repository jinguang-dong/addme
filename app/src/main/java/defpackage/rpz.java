package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpz extends ir {
    public rpz(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(rqb.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = rqa.b;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iA = a(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int iB = -1;
        for (int i = 0; i < 2 && iB < 0; i++) {
            iB = rnt.b(context, typedArray, iArr[i], -1);
        }
        return iB;
    }

    private final void b(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, rqa.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            cok.e(this, iA);
        }
    }

    private static boolean c(Context context) {
        return rnt.i(context, com.google.ar.core.R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // defpackage.ir, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (c(context)) {
            b(context.getTheme(), i);
        }
    }
}
