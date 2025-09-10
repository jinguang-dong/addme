package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.dsv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BoxInsetLayout extends ViewGroup {
    private final int a;
    private final int b;
    private boolean c;
    private Rect d;
    private Rect e;
    private Drawable f;

    public BoxInsetLayout(Context context) {
        this(context, null);
    }

    private final int a(dsv dsvVar, int i, int i2) {
        return (this.c && (dsvVar.a & 8) != 0 && (dsvVar.height == -1 || i == 80)) ? dsvVar.bottomMargin + i2 : dsvVar.bottomMargin;
    }

    private final int b(dsv dsvVar, int i, int i2) {
        return (this.c && (dsvVar.a & 1) != 0 && (dsvVar.width == -1 || i == 3)) ? dsvVar.leftMargin + i2 : dsvVar.leftMargin;
    }

    private final int c(dsv dsvVar, int i, int i2) {
        return (this.c && (dsvVar.a & 4) != 0 && (dsvVar.width == -1 || i == 5)) ? dsvVar.rightMargin + i2 : dsvVar.rightMargin;
    }

    private final int d(dsv dsvVar, int i, int i2) {
        return (this.c && (dsvVar.a & 2) != 0 && (dsvVar.height == -1 || i == 48)) ? dsvVar.topMargin + i2 : dsvVar.topMargin;
    }

    private final int e(int i, int i2) {
        return (int) (Math.max(Math.min(i, this.b), Math.min(i2, this.a)) * 0.146447f);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dsv;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dsv(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = getResources().getConfiguration().isScreenRound();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        this.e.set(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.getChildCount()
            int r2 = r0.getPaddingLeft()
            android.graphics.Rect r3 = r0.d
            int r3 = r3.left
            int r2 = r2 + r3
            int r3 = r22 - r20
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            android.graphics.Rect r4 = r0.d
            int r4 = r4.right
            int r3 = r3 - r4
            int r4 = r0.getPaddingTop()
            android.graphics.Rect r5 = r0.d
            int r5 = r5.top
            int r4 = r4 + r5
            int r5 = r23 - r21
            int r6 = r0.getPaddingBottom()
            int r5 = r5 - r6
            android.graphics.Rect r6 = r0.d
            int r6 = r6.bottom
            int r5 = r5 - r6
            r6 = 0
        L31:
            if (r6 >= r1) goto Lce
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 == r9) goto Lc2
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            dsv r8 = (defpackage.dsv) r8
            int r9 = r7.getMeasuredWidth()
            int r10 = r7.getMeasuredHeight()
            int r11 = r8.gravity
            r12 = -1
            if (r11 != r12) goto L55
            r11 = 8388659(0x800033, float:1.1755015E-38)
        L55:
            int r13 = r0.getLayoutDirection()
            int r13 = android.view.Gravity.getAbsoluteGravity(r11, r13)
            int r14 = r0.getMeasuredWidth()
            int r15 = r0.getMeasuredHeight()
            r12 = r11 & 7
            int r14 = r0.e(r14, r15)
            int r15 = r0.b(r8, r12, r14)
            int r12 = r0.c(r8, r12, r14)
            r16 = r1
            int r1 = r8.width
            r17 = r2
            r2 = -1
            if (r1 != r2) goto L7f
        L7c:
            int r2 = r17 + r15
            goto L96
        L7f:
            r1 = r13 & 7
            r2 = 1
            if (r1 == r2) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            goto L7c
        L88:
            int r1 = r3 - r9
            int r2 = r1 - r12
            goto L96
        L8d:
            int r1 = r3 - r17
            int r1 = r1 - r9
            int r1 = r1 / 2
            int r2 = r17 + r1
            int r2 = r2 + r15
            int r2 = r2 - r12
        L96:
            r1 = r11 & 112(0x70, float:1.57E-43)
            int r11 = r0.d(r8, r1, r14)
            int r12 = r0.a(r8, r1, r14)
            int r8 = r8.height
            r13 = -1
            if (r8 != r13) goto La7
        La5:
            int r11 = r11 + r4
            goto Lbc
        La7:
            r8 = 16
            if (r1 == r8) goto Lb3
            r8 = 80
            if (r1 == r8) goto Lb0
            goto La5
        Lb0:
            int r1 = r5 - r10
            goto Lba
        Lb3:
            int r1 = r5 - r4
            int r1 = r1 - r10
            int r1 = r1 / 2
            int r1 = r1 + r4
            int r1 = r1 + r11
        Lba:
            int r11 = r1 - r12
        Lbc:
            int r9 = r9 + r2
            int r10 = r10 + r11
            r7.layout(r2, r11, r9, r10)
            goto Lc6
        Lc2:
            r16 = r1
            r17 = r2
        Lc6:
            int r6 = r6 + 1
            r1 = r16
            r2 = r17
            goto L31
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.widget.BoxInsetLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                dsv dsvVar = (dsv) childAt.getLayoutParams();
                if (this.c) {
                    i3 = (dsvVar.a & 1) == 0 ? dsvVar.leftMargin : 0;
                    i5 = (dsvVar.a & 4) == 0 ? dsvVar.rightMargin : 0;
                    i4 = (dsvVar.a & 2) == 0 ? dsvVar.topMargin : 0;
                    if ((8 & dsvVar.a) == 0) {
                        i6 = dsvVar.bottomMargin;
                    } else {
                        i9 = i3;
                        i8 = i5;
                        i7 = i4;
                        i10 = 0;
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                        iMax = Math.max(iMax, childAt.getMeasuredWidth() + i9 + i8);
                        iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + i7 + i10);
                        iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                    }
                } else {
                    i3 = dsvVar.leftMargin;
                    i4 = dsvVar.topMargin;
                    i5 = dsvVar.rightMargin;
                    i6 = dsvVar.bottomMargin;
                }
                i9 = i3;
                i8 = i5;
                i7 = i4;
                i10 = i6;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                iMax = Math.max(iMax, childAt.getMeasuredWidth() + i9 + i8);
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + i7 + i10);
                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int paddingLeft = iMax + getPaddingLeft() + this.d.left + getPaddingRight() + this.d.right;
        int iMax3 = Math.max(iMax2 + getPaddingTop() + this.d.top + getPaddingBottom() + this.d.bottom, getSuggestedMinimumHeight());
        int iMax4 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable drawable = this.f;
        if (drawable != null) {
            iMax3 = Math.max(iMax3, drawable.getMinimumHeight());
            iMax4 = Math.max(iMax4, this.f.getMinimumWidth());
        }
        int iResolveSizeAndState = resolveSizeAndState(iMax4, i, iCombineMeasuredStates);
        int iResolveSizeAndState2 = resolveSizeAndState(iMax3, i2, iCombineMeasuredStates << 16);
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
        int iE = e(iResolveSizeAndState, iResolveSizeAndState2);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            dsv dsvVar2 = (dsv) childAt2.getLayoutParams();
            int i13 = dsvVar2.gravity;
            if (i13 == -1) {
                i13 = 8388659;
            }
            int paddingLeft2 = getPaddingLeft() + this.d.left;
            int paddingRight = getPaddingRight() + this.d.right;
            int paddingTop = getPaddingTop() + this.d.top;
            int paddingBottom = getPaddingBottom() + this.d.bottom;
            int i14 = i13 & 7;
            int iB = paddingLeft2 + paddingRight + b(dsvVar2, i14, iE) + c(dsvVar2, i14, iE);
            int i15 = i13 & ScriptIntrinsicBLAS.TRANSPOSE;
            int iD = paddingTop + paddingBottom + d(dsvVar2, i15, iE) + a(dsvVar2, i15, iE);
            int childMeasureSpec = getChildMeasureSpec(i, iB, dsvVar2.width);
            int childMeasureSpec2 = getChildMeasureSpec(i2, iD, dsvVar2.height);
            int measuredWidth = getMeasuredWidth() - iB;
            int measuredHeight = getMeasuredHeight() - iD;
            if (childAt2.getMeasuredWidth() > measuredWidth || childAt2.getMeasuredHeight() > measuredHeight) {
                childAt2.measure(childMeasureSpec, childMeasureSpec2);
            }
        }
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        this.f = drawable;
        if (this.d == null) {
            this.d = new Rect();
        }
        if (this.f != null) {
            drawable.getPadding(this.d);
        }
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dsv(layoutParams);
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.d == null) {
            this.d = new Rect();
        }
        if (this.e == null) {
            this.e = new Rect();
        }
        this.a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
