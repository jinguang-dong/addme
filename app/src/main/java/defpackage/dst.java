package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dst extends ViewGroup.MarginLayoutParams {
    public boolean a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;

    public dst() {
        super(-1, -1);
        this.a = true;
        this.b = 1;
    }

    public dst(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.b = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, djc.b);
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.b = typedArrayObtainStyledAttributes.getInt(1, 1);
        this.f = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public dst(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = true;
        this.b = 1;
    }
}
