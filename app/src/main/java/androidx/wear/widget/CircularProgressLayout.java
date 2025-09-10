package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.dfs;
import defpackage.dft;
import defpackage.djc;
import defpackage.dsz;
import defpackage.nyt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CircularProgressLayout extends FrameLayout {
    public dft a;
    private nyt b;

    public CircularProgressLayout(Context context) {
        this(context, null);
    }

    public final void a(int... iArr) {
        dft dftVar = this.a;
        dfs dfsVar = dftVar.a;
        dfsVar.e(iArr);
        dfsVar.d(0);
        dftVar.invalidateSelf();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nyt nytVar = this.b;
        nytVar.b(false);
        dft dftVar = ((CircularProgressLayout) nytVar.b).a;
        dfs dfsVar = dftVar.a;
        dfsVar.e = 0.0f;
        dfsVar.f = 0.0f;
        dftVar.invalidateSelf();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            this.a.b(0.0f);
        } else {
            View childAt = getChildAt(0);
            this.a.b(Math.min(childAt.getWidth(), childAt.getHeight()) / 2.0f);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        dft dftVar = this.a;
        dftVar.a.d.setColor(i);
        dftVar.invalidateSelf();
    }

    public CircularProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularProgressLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CircularProgressLayout(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        dft dftVar = new dft(context);
        this.a = dftVar;
        dftVar.a.g = 0.75f;
        dftVar.invalidateSelf();
        dft dftVar2 = this.a;
        dftVar2.a.b.setStrokeCap(Paint.Cap.BUTT);
        dftVar2.invalidateSelf();
        setBackground(this.a);
        setOnHierarchyChangeListener(new dsz());
        this.b = new nyt(this);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, djc.e);
        if (typedArrayObtainAttributes.getType(1) != 1 && typedArrayObtainAttributes.hasValue(1)) {
            a(typedArrayObtainAttributes.getColor(1, -16777216));
        } else {
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(typedArrayObtainAttributes.getResourceId(1, R.array.circular_progress_layout_color_scheme_colors));
            int[] iArr = new int[typedArrayObtainTypedArray.length()];
            for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                iArr[i3] = typedArrayObtainTypedArray.getColor(i3, 0);
            }
            typedArrayObtainTypedArray.recycle();
            a(iArr);
        }
        this.a.c(typedArrayObtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.circular_progress_layout_stroke_width)));
        setBackgroundColor(typedArrayObtainAttributes.getColor(0, context.getColor(R.color.circular_progress_layout_background_color)));
        this.b.b(typedArrayObtainAttributes.getBoolean(2, false));
        typedArrayObtainAttributes.recycle();
    }
}
