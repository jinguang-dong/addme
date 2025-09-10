package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxf extends ckl {
    public int ax;

    public mxf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mxi.a);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.ax = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}[typedArrayObtainStyledAttributes.getInt(0, 0)];
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public mxf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public mxf(int i) {
        super(-1, -1);
        this.ax = i;
    }
}
