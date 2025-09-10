package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roc {
    public static final rnr a = new rnz(0.5f);
    public final rnr b;
    final rnr c;
    public final rnr d;
    public final rnr e;
    final rnt f;
    final rnt g;
    final rnt h;
    final rnt i;
    public final rnt j;
    public final rnt k;
    public final rnt l;
    public final rnt m;

    public roc() {
        this.j = new roa();
        this.k = new roa();
        this.l = new roa();
        this.m = new roa();
        this.b = new rno(0.0f);
        this.c = new rno(0.0f);
        this.d = new rno(0.0f);
        this.e = new rno(0.0f);
        this.f = new rnt();
        this.g = new rnt();
        this.h = new rnt();
        this.i = new rnt();
    }

    public static rnr a(TypedArray typedArray, int i, rnr rnrVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new rno(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new rnz(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return rnrVar;
    }

    public static rob b(Context context, int i, int i2, rnr rnrVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(rny.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            rnr rnrVarA = a(typedArrayObtainStyledAttributes, 5, rnrVar);
            rnr rnrVarA2 = a(typedArrayObtainStyledAttributes, 8, rnrVarA);
            rnr rnrVarA3 = a(typedArrayObtainStyledAttributes, 9, rnrVarA);
            rnr rnrVarA4 = a(typedArrayObtainStyledAttributes, 7, rnrVarA);
            rnr rnrVarA5 = a(typedArrayObtainStyledAttributes, 6, rnrVarA);
            rob robVar = new rob();
            robVar.d(rnt.q(i4));
            robVar.a = rnrVarA2;
            robVar.e(rnt.q(i5));
            robVar.b = rnrVarA3;
            robVar.c(rnt.q(i6));
            robVar.c = rnrVarA4;
            robVar.b(rnt.q(i7));
            robVar.d = rnrVarA5;
            return robVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static rob c(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new rno(0.0f));
    }

    public static rob d(Context context, AttributeSet attributeSet, int i, int i2, rnr rnrVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rny.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, rnrVar);
    }

    public final roc e(float f) {
        rob robVar = new rob(this);
        robVar.a(f);
        return new roc(robVar);
    }

    public final boolean f() {
        return (this.k instanceof roa) && (this.j instanceof roa) && (this.l instanceof roa) && (this.m instanceof roa);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.i.getClass().equals(rnt.class) && this.g.getClass().equals(rnt.class) && this.f.getClass().equals(rnt.class) && this.h.getClass().equals(rnt.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public roc(rob robVar) {
        this.j = robVar.i;
        this.k = robVar.j;
        this.l = robVar.k;
        this.m = robVar.l;
        this.b = robVar.a;
        this.c = robVar.b;
        this.d = robVar.c;
        this.e = robVar.d;
        this.f = robVar.e;
        this.g = robVar.f;
        this.h = robVar.g;
        this.i = robVar.h;
    }

    public final String toString() {
        rnr rnrVar = this.e;
        rnr rnrVar2 = this.d;
        rnr rnrVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(rnrVar3) + ", " + String.valueOf(rnrVar2) + ", " + String.valueOf(rnrVar) + PNlJufQ.gcQDgwPq;
    }
}
