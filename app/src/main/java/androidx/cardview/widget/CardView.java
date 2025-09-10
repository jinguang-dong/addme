package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a;
import defpackage.col;
import defpackage.con;
import defpackage.csu;
import defpackage.xu;
import defpackage.xv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final csu e;
    private static final int[] g = {R.attr.colorBackground};
    public static final a f = new a();

    public CardView(Context context) {
        this(context, null);
    }

    public final float a() {
        return a.bq(this.e);
    }

    public void c(float f2) {
        xv xvVar = (xv) this.e.a;
        if (f2 == xvVar.a) {
            return;
        }
        xvVar.a = f2;
        xvVar.a(null);
        xvVar.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        csu csuVar = new csu(this);
        this.e = csuVar;
        int[] iArr = xu.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.ar.core.R.style.CardView);
        int[] iArr2 = con.a;
        col.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.ar.core.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.ar.core.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.ar.core.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        xv xvVar = new xv(colorStateListValueOf, dimension);
        csuVar.a = xvVar;
        Object obj = csuVar.b;
        ((CardView) obj).setBackgroundDrawable(xvVar);
        View view = (View) obj;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        Object obj2 = csuVar.a;
        boolean zC = csuVar.c();
        boolean zB = csuVar.b();
        xv xvVar2 = (xv) obj2;
        if (dimension3 != xvVar2.b || xvVar2.c != zC || xvVar2.d != zB) {
            xvVar2.b = dimension3;
            xvVar2.c = zC;
            xvVar2.d = zB;
            xvVar2.a(null);
            xvVar2.invalidateSelf();
        }
        a.bs(csuVar);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
