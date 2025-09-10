package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.byi;
import defpackage.col;
import defpackage.con;
import defpackage.fa;
import defpackage.jr;
import defpackage.pmg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: eJ, reason: merged with bridge method [inline-methods] */
    public jr generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new jr(-2);
        }
        if (i == 1) {
            return new jr(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: eK, reason: merged with bridge method [inline-methods] */
    public jr generateLayoutParams(AttributeSet attributeSet) {
        return new jr(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: eL, reason: merged with bridge method [inline-methods] */
    public jr generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jr ? new jr((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new jr((ViewGroup.MarginLayoutParams) layoutParams) : new jr(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.f & ScriptIntrinsicBLAS.TRANSPOSE) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return bottom + ((jr) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.g == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && s(i2)) {
                    p(canvas, (childAt.getTop() - ((jr) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i2++;
            }
            if (s(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                p(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((jr) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zBF = byi.bF(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && s(i2)) {
                jr jrVar = (jr) childAt3.getLayoutParams();
                q(canvas, zBF ? childAt3.getRight() + jrVar.rightMargin : (childAt3.getLeft() - jrVar.leftMargin) - this.h);
            }
            i2++;
        }
        if (s(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                jr jrVar2 = (jr) childAt4.getLayoutParams();
                if (zBF) {
                    left = childAt4.getLeft() - jrVar2.leftMargin;
                    i = this.h;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + jrVar2.rightMargin;
                }
            } else if (zBF) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.h;
                right = left - i;
            }
            q(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    final void q(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void r(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    protected final boolean s(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.a = false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        int[] iArr = fa.n;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        int[] iArr2 = con.a;
        col.b(this, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        int iU = pmgVarJ.u(1, -1);
        if (iU >= 0) {
            r(iU);
        }
        int iU2 = pmgVarJ.u(0, -1);
        if (iU2 >= 0 && this.f != iU2) {
            iU2 = (8388615 & iU2) == 0 ? iU2 | 8388611 : iU2;
            this.f = (iU2 & ScriptIntrinsicBLAS.TRANSPOSE) == 0 ? iU2 | 48 : iU2;
            requestLayout();
        }
        if (!pmgVarJ.E(2, true)) {
            t();
        }
        this.i = ((TypedArray) pmgVarJ.b).getFloat(4, -1.0f);
        this.b = pmgVarJ.u(3, -1);
        this.j = pmgVarJ.E(7, false);
        Drawable drawableZ = pmgVarJ.z(5);
        if (drawableZ != this.g) {
            this.g = drawableZ;
            if (drawableZ != null) {
                this.h = drawableZ.getIntrinsicWidth();
                this.m = drawableZ.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableZ == null);
            requestLayout();
        }
        this.n = pmgVarJ.u(8, 0);
        this.o = pmgVarJ.t(6, 0);
        pmgVarJ.D();
    }
}
