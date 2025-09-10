package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dk extends ViewGroup.MarginLayoutParams {
    public int a;

    public dk() {
        super(-2, -2);
        this.a = 8388627;
    }

    public dk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fa.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public dk(dk dkVar) {
        super((ViewGroup.MarginLayoutParams) dkVar);
        this.a = 0;
        this.a = dkVar.a;
    }

    public dk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
