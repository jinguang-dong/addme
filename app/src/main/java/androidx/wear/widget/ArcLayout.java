package androidx.wear.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.djc;
import defpackage.dss;
import defpackage.dst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ArcLayout extends ViewGroup {
    private int a;
    private int b;
    private float c;
    private float d;
    private boolean e;
    private final dss f;
    private View g;

    public ArcLayout(Context context) {
        this(context, null);
    }

    private final float a(View view) {
        float f;
        dst dstVar = (dst) view.getLayoutParams();
        boolean z = view instanceof CurvedTextView;
        int iA = z ? ((CurvedTextView) view).a() : view.getMeasuredHeight();
        int i = (this.a - dstVar.topMargin) - dstVar.bottomMargin;
        int i2 = this.e ? dstVar.topMargin : dstVar.bottomMargin;
        float fRound = (z || getMeasuredWidth() >= getMeasuredHeight()) ? 0.0f : Math.round((getMeasuredHeight() - getMeasuredWidth()) / 2.0f);
        int i3 = i - iA;
        int i4 = dstVar.b;
        float f2 = i2 + fRound;
        if (i4 == 0) {
            return f2;
        }
        if (i4 == 1) {
            f = i3 / 2.0f;
        } else {
            if (i4 != 2) {
                return 0.0f;
            }
            f = i3;
        }
        return f2 + f;
    }

    private static float b(float f, float f2) {
        double dAsin = Math.asin((f / f2) / 2.0f);
        return (float) Math.toDegrees(dAsin + dAsin);
    }

    private final void c(View view, dss dssVar) {
        if (view.getVisibility() == 8) {
            dssVar.a = 0.0f;
            dssVar.b = 0.0f;
            dssVar.c = 0.0f;
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f = this.a;
        dst dstVar = (dst) view.getLayoutParams();
        float f2 = (measuredWidth / 2.0f) - f;
        dssVar.a = b(dstVar.leftMargin, f2);
        dssVar.b = b(dstVar.rightMargin, f2);
        if (view instanceof CurvedTextView) {
            dssVar.c = ((CurvedTextView) view).b;
        } else {
            dssVar.c = b(view.getMeasuredWidth(), f2);
        }
    }

    private final void d(View view, float f, float[] fArr) {
        Matrix matrix = new Matrix();
        dst dstVar = (dst) view.getLayoutParams();
        if (view instanceof CurvedTextView) {
            matrix.postRotate(-f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            matrix.postTranslate(-view.getX(), -view.getY());
        } else {
            matrix.postTranslate(-dstVar.d, -dstVar.e);
            if (dstVar.a) {
                matrix.postRotate(-f);
            }
            matrix.postTranslate(view.getWidth() / 2, view.getHeight() / 2);
        }
        matrix.mapPoints(fArr);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dst;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        dst dstVar = (dst) view.getLayoutParams();
        float f = dstVar.c;
        if (view instanceof CurvedTextView) {
            canvas.rotate(f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            CurvedTextView curvedTextView = (CurvedTextView) view;
            if (curvedTextView.c != -1) {
                throw new IllegalArgumentException("CurvedTextView shall not set anchorType value when added intoArcLayout");
            }
            if (curvedTextView.d != -1.0f) {
                throw new IllegalArgumentException("CurvedTextView shall not set anchorAngleDegrees value when added into ArcLayout");
            }
        } else {
            if (dstVar.a) {
                f = (true != this.e ? 180.0f : 0.0f) + f;
            }
            canvas.rotate(f, dstVar.d, dstVar.e);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dst();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dst(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g == null && motionEvent.getActionMasked() == 0) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    float f = ((dst) childAt.getLayoutParams()).c;
                    float[] fArr = {motionEvent.getX(), motionEvent.getY()};
                    d(childAt, f, fArr);
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    if (childAt instanceof CurvedTextView) {
                        if (((CurvedTextView) childAt).c(f2, f3)) {
                            this.g = childAt;
                            break;
                        }
                    } else {
                        if (f2 >= 0.0f && f2 < childAt.getMeasuredWidth() && f3 >= 0.0f && f3 < childAt.getMeasuredHeight()) {
                            this.g = childAt;
                            break;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fA;
        float f;
        float f2;
        float f3;
        float fA2;
        int i5 = 0;
        boolean z2 = getLayoutDirection() == 1;
        boolean z3 = this.e;
        int i6 = this.b;
        float f4 = z3 != z2 ? 1.0f : -1.0f;
        int i7 = 2;
        float f5 = 0.0f;
        float f6 = 2.0f;
        if (i6 == 0) {
            fA = this.c * f4;
        } else {
            boolean z4 = false;
            float fA3 = 0.0f;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                z4 |= !(((dst) childAt.getLayoutParams()).f <= 0.0f);
                dss dssVar = this.f;
                c(childAt, dssVar);
                fA3 += dssVar.a();
            }
            if (z4) {
                float f7 = this.d;
                if (fA3 < f7) {
                    fA3 = f7;
                }
            }
            int i9 = this.b;
            if (i9 == 1) {
                f = this.c * f4;
                fA3 /= 2.0f;
            } else if (i9 == 2) {
                f = this.c * f4;
            } else {
                fA = 0.0f;
            }
            fA = f - fA3;
        }
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                float f10 = ((dst) childAt2.getLayoutParams()).f;
                if (f10 > 0.0f) {
                    f8 += f10;
                    dss dssVar2 = this.f;
                    c(childAt2, dssVar2);
                    fA2 = dssVar2.a + dssVar2.b;
                } else {
                    dss dssVar3 = this.f;
                    c(childAt2, dssVar3);
                    fA2 = dssVar3.a();
                }
                f9 += fA2;
            }
        }
        float f11 = f8 > 0.0f ? (this.d - f9) / f8 : 0.0f;
        while (i5 < getChildCount()) {
            View childAt3 = getChildAt(i5);
            if (childAt3.getVisibility() != 8) {
                dss dssVar4 = this.f;
                c(childAt3, dssVar4);
                dst dstVar = (dst) childAt3.getLayoutParams();
                float f12 = dstVar.f;
                if (f12 > f5) {
                    float f13 = f12 * f11;
                    dssVar4.c = f13;
                    if (!(childAt3 instanceof CurvedTextView)) {
                        throw new IllegalStateException("ArcLayout.LayoutParams with non zero weights are only supported for views implementing ArcLayout.Widget");
                    }
                    ((CurvedTextView) childAt3).b = f13;
                }
                float f14 = (dssVar4.a + (dssVar4.c / f6) + fA) * f4;
                dstVar.c = f14;
                float measuredHeight = ((getMeasuredHeight() - childAt3.getMeasuredHeight()) / i7) - a(childAt3);
                f2 = f11;
                double d = f14 * 3.141592653589793d;
                double d2 = measuredHeight;
                double d3 = d / 180.0d;
                f3 = f6;
                dstVar.d = (float) ((getMeasuredWidth() / f6) + (Math.sin(d3) * d2));
                dstVar.e = (float) ((getMeasuredHeight() / f3) - (d2 * Math.cos(d3)));
                fA += dssVar4.a();
                if (childAt3 instanceof CurvedTextView) {
                    int iRound = Math.round((getMeasuredWidth() / f3) - (childAt3.getMeasuredWidth() / f3));
                    int iRound2 = Math.round((getMeasuredHeight() / f3) - (childAt3.getMeasuredHeight() / f3));
                    childAt3.layout(iRound, iRound2, childAt3.getMeasuredWidth() + iRound, childAt3.getMeasuredHeight() + iRound2);
                } else {
                    int iRound3 = Math.round(dstVar.d - (childAt3.getMeasuredWidth() / f3));
                    int iRound4 = Math.round(dstVar.e - (childAt3.getMeasuredHeight() / f3));
                    childAt3.layout(iRound3, iRound4, childAt3.getMeasuredWidth() + iRound3, childAt3.getMeasuredHeight() + iRound4);
                }
            } else {
                f2 = f11;
                f3 = f6;
            }
            i5++;
            f11 = f2;
            f6 = f3;
            i7 = 2;
            f5 = 0.0f;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            size2 = displayMetrics.heightPixels;
            size = i3;
        }
        if (size < size2) {
            size2 = size;
        } else if (size2 < size) {
            size = size2;
        } else {
            int i4 = size2;
            size2 = size;
            size = i4;
        }
        int i5 = size / 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        int iMax = 0;
        int iCombineMeasuredStates = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (childAt instanceof CurvedTextView) {
                    measuredHeight = ((CurvedTextView) childAt).a();
                } else {
                    measureChild(childAt, getChildMeasureSpec(iMakeMeasureSpec, 0, childAt.getLayoutParams().width), getChildMeasureSpec(iMakeMeasureSpec, 0, childAt.getLayoutParams().height));
                    measuredHeight = childAt.getMeasuredHeight();
                    iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                }
                dst dstVar = (dst) childAt.getLayoutParams();
                iMax = Math.max(iMax, measuredHeight + dstVar.topMargin + dstVar.bottomMargin);
            }
        }
        this.a = iMax;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8 && (childAt2 instanceof CurvedTextView)) {
                dst dstVar2 = (dst) childAt2.getLayoutParams();
                float fA = a(childAt2);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((i5 + i5) - Math.round(fA + fA), 1073741824);
                measureChild(childAt2, getChildMeasureSpec(iMakeMeasureSpec2, 0, dstVar2.width), getChildMeasureSpec(iMakeMeasureSpec2, 0, dstVar2.height));
                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt2.getMeasuredState());
            }
        }
        setMeasuredDimension(resolveSizeAndState(size2, i, iCombineMeasuredStates), resolveSizeAndState(size, i2, iCombineMeasuredStates));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g == null) {
            return false;
        }
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        d(this.g, ((dst) this.g.getLayoutParams()).c, fArr);
        motionEvent.offsetLocation(fArr[0] - motionEvent.getX(), fArr[1] - motionEvent.getY());
        this.g.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.g = null;
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).forceLayout();
        }
    }

    public ArcLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dst(layoutParams);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0;
        this.d = 360.0f;
        this.f = new dss();
        this.g = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, djc.a, i, i2);
        this.b = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.c = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
