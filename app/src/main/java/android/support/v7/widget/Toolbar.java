package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import defpackage.byi;
import defpackage.cns;
import defpackage.col;
import defpackage.con;
import defpackage.dk;
import defpackage.fa;
import defpackage.fl;
import defpackage.fz;
import defpackage.gb;
import defpackage.gd;
import defpackage.gl;
import defpackage.got;
import defpackage.hg;
import defpackage.hk;
import defpackage.ht;
import defpackage.ir;
import defpackage.ll;
import defpackage.mb;
import defpackage.mc;
import defpackage.md;
import defpackage.me;
import defpackage.mf;
import defpackage.mi;
import defpackage.pmg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements cns {
    public fz A;
    public boolean B;
    public final got C;
    public AmbientMode.AmbientController D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private mi O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final AmbientMode.AmbientController S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public ll s;
    public CharSequence t;
    public CharSequence u;
    public final ArrayList v;
    public ArrayList w;
    public hg x;
    public md y;
    public gl z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int A(View view, int i) {
        me meVar = (me) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = meVar.a & ScriptIntrinsicBLAS.TRANSPOSE;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & ScriptIntrinsicBLAS.TRANSPOSE;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - meVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < meVar.topMargin) {
            iMax = meVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < meVar.bottomMargin) {
                iMax = Math.max(0, iMax - (meVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int B(View view, int i, int[] iArr, int i2) {
        me meVar = (me) view.getLayoutParams();
        int i3 = meVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iA = A(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return iMax + measuredWidth + meVar.rightMargin;
    }

    private final int C(View view, int i, int[] iArr, int i2) {
        me meVar = (me) view.getLayoutParams();
        int i3 = meVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA = A(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (measuredWidth + meVar.leftMargin);
    }

    private final int D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void E(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                me meVar = (me) childAt.getLayoutParams();
                if (meVar.b == 0 && I(childAt) && z(meVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            me meVar2 = (me) childAt2.getLayoutParams();
            if (meVar2.b == 0 && I(childAt2) && z(meVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void F(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        me meVar = layoutParams == null ? new me() : !checkLayoutParams(layoutParams) ? y(layoutParams) : (me) layoutParams;
        meVar.b = 1;
        if (!z || this.i == null) {
            addView(view, meVar);
        } else {
            view.setLayoutParams(meVar);
            this.v.add(view);
        }
    }

    private final void G() {
        if (this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
    }

    private final boolean H(View view) {
        return view.getParent() == this || this.v.contains(view);
    }

    private final boolean I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int J(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int K(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void L(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected static final me y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof me ? new me((me) layoutParams) : layoutParams instanceof dk ? new me((dk) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new me((ViewGroup.MarginLayoutParams) layoutParams) : new me(layoutParams);
    }

    private final int z(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int a() {
        ll llVar = this.s;
        if (llVar != null) {
            return llVar.g ? llVar.a : llVar.b;
        }
        return 0;
    }

    public final int b() {
        ll llVar = this.s;
        if (llVar != null) {
            return llVar.g ? llVar.b : llVar.a;
        }
        return 0;
    }

    public final int c() {
        gb gbVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (gbVar = actionMenuView.a) == null || !gbVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof me);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuG = actionMenuView.g();
            if (this.y == null) {
                this.y = new md(this);
            }
            this.a.c.o();
            ((gb) menuG).h(this.y, this.j);
            t();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new fl(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new me();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new me(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        md mdVar = this.y;
        gd gdVar = mdVar == null ? null : mdVar.b;
        if (gdVar != null) {
            gdVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.s == null) {
            this.s = new ll();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.k);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.z, new hk(this, 2));
            me meVar = new me();
            meVar.a = (this.n & ScriptIntrinsicBLAS.TRANSPOSE) | 8388613;
            this.a.setLayoutParams(meVar);
            F(this.a, false);
        }
    }

    public final void m() {
        if (this.d == null) {
            this.d = new ht(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            me meVar = new me();
            meVar.a = (this.n & ScriptIntrinsicBLAS.TRANSPOSE) | 8388611;
            this.d.setLayoutParams(meVar);
        }
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            G();
            if (!H(this.e)) {
                F(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && H(imageView)) {
                removeView(this.e);
                this.v.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.d.setTooltipText(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.L = r1
            r0 = r2
        Lc:
            boolean r3 = r5.L
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.L = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.L = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02be A[LOOP:0: B:113:0x02bc->B:114:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d6 A[LOOP:1: B:116:0x02d4->B:117:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7 A[LOOP:2: B:119:0x02f5->B:120:0x02f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0345 A[LOOP:3: B:128:0x0343->B:129:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        boolean zBF = byi.bF(this);
        int i3 = !zBF ? 1 : 0;
        int iMax2 = 0;
        if (I(this.d)) {
            L(this.d, i, 0, i2, this.E);
            measuredWidth = this.d.getMeasuredWidth() + J(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + K(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (I(this.h)) {
            L(this.h, i, 0, i2, this.E);
            measuredWidth = this.h.getMeasuredWidth() + J(this.h);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + K(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int[] iArr = this.N;
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zBF ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (I(this.a)) {
            L(this.a, i, iMax3, i2, this.E);
            measuredWidth2 = this.a.getMeasuredWidth() + J(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + K(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i3] = Math.max(0, iC - measuredWidth2);
        if (I(this.i)) {
            iMax4 += D(this.i, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + K(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (I(this.e)) {
            iMax4 += D(this.e, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + K(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((me) childAt.getLayoutParams()).b == 0 && I(childAt)) {
                iMax4 += D(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + K(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.q + this.r;
        int i7 = this.o + this.p;
        if (I(this.b)) {
            D(this.b, i, i5 + i7, i2, i6, iArr);
            iMax2 = this.b.getMeasuredWidth() + J(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + K(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (I(this.c)) {
            iMax2 = Math.max(iMax2, D(this.c, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + K(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof mf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mf mfVar = (mf) parcelable;
        super.onRestoreInstanceState(mfVar.d);
        ActionMenuView actionMenuView = this.a;
        gb gbVar = actionMenuView != null ? actionMenuView.a : null;
        int i = mfVar.a;
        if (i != 0 && this.y != null && gbVar != null && (menuItemFindItem = gbVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (mfVar.b) {
            Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        ll llVar = this.s;
        boolean z = llVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        llVar.g = z2;
        if (!llVar.h) {
            llVar.a = llVar.e;
            llVar.b = llVar.f;
            return;
        }
        if (z2) {
            int i2 = llVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = llVar.e;
            }
            llVar.a = i2;
            int i3 = llVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = llVar.f;
            }
            llVar.b = i3;
            return;
        }
        int i4 = llVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = llVar.e;
        }
        llVar.a = i4;
        int i5 = llVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = llVar.f;
        }
        llVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        gd gdVar;
        mf mfVar = new mf(super.onSaveInstanceState());
        md mdVar = this.y;
        if (mdVar != null && (gdVar = mdVar.b) != null) {
            mfVar.a = gdVar.a;
        }
        mfVar.b = v();
        return mfVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void p(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!H(this.d)) {
                F(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && H(imageButton)) {
                removeView(this.d);
                this.v.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void q(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && H(textView)) {
                removeView(this.c);
                this.v.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                ir irVar = new ir(context);
                this.c = irVar;
                irVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!H(this.c)) {
                F(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.u = charSequence;
    }

    public final void s(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && H(textView)) {
                removeView(this.b);
                this.v.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                ir irVar = new ir(context);
                this.b = irVar;
                irVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!H(this.b)) {
                F(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
        if (!u() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.B) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
            if (onBackInvokedDispatcher != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                this.Q = null;
                return;
            }
            return;
        }
        if (this.Q == null) {
            if (this.P == null) {
                this.P = new mc(new mb(this, 1), 0);
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
            this.Q = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        }
    }

    public final boolean u() {
        md mdVar = this.y;
        return (mdVar == null || mdVar.b == null) ? false : true;
    }

    public final boolean v() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean w() {
        hg hgVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hgVar = actionMenuView.c) == null || !hgVar.m()) ? false : true;
    }

    public final mi x() {
        if (this.O == null) {
            this.O = new mi(this, true);
        }
        return this.O;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return y(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.v = new ArrayList();
        this.N = new int[2];
        this.C = new got(new mb(this, 0));
        this.w = new ArrayList();
        this.S = new AmbientMode.AmbientController(this);
        this.R = new mb(this, 2, null);
        Context context2 = getContext();
        int[] iArr = fa.x;
        pmg pmgVarJ = pmg.J(context2, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        int[] iArr2 = con.a;
        col.b(this, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        this.l = pmgVarJ.x(28, 0);
        this.m = pmgVarJ.x(19, 0);
        this.H = pmgVarJ.v(0, this.H);
        this.n = pmgVarJ.v(2, 48);
        int iS = pmgVarJ.s(22, 0);
        iS = pmgVarJ.F(27) ? pmgVarJ.s(27, iS) : iS;
        this.r = iS;
        this.q = iS;
        this.p = iS;
        this.o = iS;
        int iS2 = pmgVarJ.s(25, -1);
        if (iS2 >= 0) {
            this.o = iS2;
        }
        int iS3 = pmgVarJ.s(24, -1);
        if (iS3 >= 0) {
            this.p = iS3;
        }
        int iS4 = pmgVarJ.s(26, -1);
        if (iS4 >= 0) {
            this.q = iS4;
        }
        int iS5 = pmgVarJ.s(23, -1);
        if (iS5 >= 0) {
            this.r = iS5;
        }
        this.E = pmgVarJ.t(13, -1);
        int iS6 = pmgVarJ.s(9, Integer.MIN_VALUE);
        int iS7 = pmgVarJ.s(5, Integer.MIN_VALUE);
        int iT = pmgVarJ.t(7, 0);
        int iT2 = pmgVarJ.t(8, 0);
        k();
        ll llVar = this.s;
        llVar.h = false;
        if (iT != Integer.MIN_VALUE) {
            llVar.e = iT;
            llVar.a = iT;
        }
        if (iT2 != Integer.MIN_VALUE) {
            llVar.f = iT2;
            llVar.b = iT2;
        }
        if (iS6 != Integer.MIN_VALUE || iS7 != Integer.MIN_VALUE) {
            llVar.a(iS6, iS7);
        }
        this.F = pmgVarJ.s(10, Integer.MIN_VALUE);
        this.G = pmgVarJ.s(6, Integer.MIN_VALUE);
        this.f = pmgVarJ.z(4);
        this.g = pmgVarJ.B(3);
        CharSequence charSequenceB = pmgVarJ.B(21);
        if (!TextUtils.isEmpty(charSequenceB)) {
            s(charSequenceB);
        }
        CharSequence charSequenceB2 = pmgVarJ.B(18);
        if (!TextUtils.isEmpty(charSequenceB2)) {
            r(charSequenceB2);
        }
        this.j = getContext();
        q(pmgVarJ.x(17, 0));
        Drawable drawableZ = pmgVarJ.z(16);
        if (drawableZ != null) {
            p(drawableZ);
        }
        CharSequence charSequenceB3 = pmgVarJ.B(15);
        if (!TextUtils.isEmpty(charSequenceB3)) {
            o(charSequenceB3);
        }
        Drawable drawableZ2 = pmgVarJ.z(11);
        if (drawableZ2 != null) {
            n(drawableZ2);
        }
        CharSequence charSequenceB4 = pmgVarJ.B(12);
        if (!TextUtils.isEmpty(charSequenceB4)) {
            if (!TextUtils.isEmpty(charSequenceB4)) {
                G();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceB4);
            }
        }
        if (pmgVarJ.F(29)) {
            ColorStateList colorStateListY = pmgVarJ.y(29);
            this.I = colorStateListY;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListY);
            }
        }
        if (pmgVarJ.F(20)) {
            ColorStateList colorStateListY2 = pmgVarJ.y(20);
            this.J = colorStateListY2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListY2);
            }
        }
        if (pmgVarJ.F(14)) {
            g().inflate(pmgVarJ.x(14, 0), f());
        }
        pmgVarJ.D();
    }
}
