package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientMode;
import defpackage.byi;
import defpackage.fz;
import defpackage.ga;
import defpackage.gb;
import defpackage.gd;
import defpackage.gl;
import defpackage.go;
import defpackage.hg;
import defpackage.hh;
import defpackage.hi;
import defpackage.hj;
import defpackage.hk;
import defpackage.jr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements ga, go {
    public gb a;
    public boolean b;
    public hg c;
    public fz d;
    public AmbientMode.AmbientController e;
    private Context i;
    private int j;
    private gl k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final hj n() {
        hj hjVar = new hj();
        hjVar.gravity = 16;
        return hjVar;
    }

    public static final hj o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return n();
        }
        hj hjVar = layoutParams instanceof hj ? new hj((hj) layoutParams) : new hj(layoutParams);
        if (hjVar.gravity <= 0) {
            hjVar.gravity = 16;
        }
        return hjVar;
    }

    @Override // defpackage.go
    public final void a(gb gbVar) {
        this.a = gbVar;
    }

    @Override // defpackage.ga
    public final boolean b(gd gdVar) {
        return this.a.z(gdVar, 0);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hj generateLayoutParams(AttributeSet attributeSet) {
        return new hj(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hj;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* renamed from: eJ */
    public final /* bridge */ /* synthetic */ jr generateDefaultLayoutParams() {
        return n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* renamed from: eL */
    public final /* bridge */ /* synthetic */ jr generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            gb gbVar = new gb(context);
            this.a = gbVar;
            gbVar.p(new hk(this, 0));
            hg hgVar = new hg(context);
            this.c = hgVar;
            hgVar.p();
            hg hgVar2 = this.c;
            gl hiVar = this.k;
            if (hiVar == null) {
                hiVar = new hi();
            }
            hgVar2.e = hiVar;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h() {
        hg hgVar = this.c;
        if (hgVar != null) {
            hgVar.n();
        }
    }

    public final void i(gl glVar, fz fzVar) {
        this.k = glVar;
        this.d = fzVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(hg hgVar) {
        this.c = hgVar;
        hgVar.j(this);
    }

    protected final boolean l(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof hh)) {
            zC = ((hh) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof hh)) ? zC : ((hh) childAt2).d() | zC;
    }

    public final boolean m() {
        hg hgVar = this.c;
        return hgVar != null && hgVar.l();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hg hgVar = this.c;
        if (hgVar != null) {
            hgVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zBF = byi.bF(this);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                hj hjVar = (hj) childAt.getLayoutParams();
                if (hjVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zBF) {
                        paddingLeft = getPaddingLeft() + hjVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - hjVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + hjVar.leftMargin) + hjVar.rightMargin;
                    l(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zBF) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                hj hjVar2 = (hj) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !hjVar2.a) {
                    int i17 = width2 - hjVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + hjVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            hj hjVar3 = (hj) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !hjVar3.a) {
                int i20 = paddingLeft2 + hjVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + hjVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }
}
