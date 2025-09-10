package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsv extends FrameLayout.LayoutParams {
    public int a;

    public dsv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, djc.c, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(true != typedArrayObtainStyledAttributes.hasValueOrEmpty(2) ? 0 : 2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public dsv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
