package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class czy extends RelativeLayout.LayoutParams {
    private czv a;

    public czy() {
        super(-1, -1);
    }

    public final czv a() {
        if (this.a == null) {
            this.a = new czv();
        }
        return this.a;
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
    }

    public czy(Context context, AttributeSet attributeSet) {
        czv czvVar;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czu.a);
        float fraction = typedArrayObtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            czvVar = new czv();
            czvVar.a = fraction;
        } else {
            czvVar = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.c = fraction3;
            czvVar.d = fraction3;
            czvVar.e = fraction3;
            czvVar.f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            czvVar = czvVar == null ? new czv() : czvVar;
            czvVar.i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.a = czvVar;
    }
}
