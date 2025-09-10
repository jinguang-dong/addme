package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.wear.ambient.AmbientLifecycleObserver;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import defpackage.byi;
import defpackage.col;
import defpackage.con;
import defpackage.cpt;
import defpackage.dij;
import defpackage.dik;
import defpackage.dim;
import defpackage.din;
import defpackage.dio;
import defpackage.dip;
import defpackage.diq;
import defpackage.dir;
import defpackage.dis;
import defpackage.diu;
import defpackage.diw;
import defpackage.dix;
import defpackage.diy;
import defpackage.diz;
import defpackage.dja;
import defpackage.djb;
import defpackage.ejs;
import defpackage.kh;
import defpackage.ki;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public final dim a;
    public int b;
    public boolean c;
    LinearLayoutManager d;
    public RecyclerView e;
    public dip f;
    public boolean g;
    public final int h;
    public AmbientLifecycleObserver.AmbientLifecycleCallback.CC i;
    public final byi j;
    private final Rect k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private kh o;
    private dim p;
    private din q;
    private ejs r;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new dim();
        this.c = false;
        this.j = new diq(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        i(context, null);
    }

    private final void i(Context context, AttributeSet attributeSet) {
        this.i = new dix(this);
        diz dizVar = new diz(this, context);
        this.e = dizVar;
        dizVar.setId(View.generateViewId());
        this.e.setDescendantFocusability(131072);
        diu diuVar = new diu(this);
        this.d = diuVar;
        this.e.ad(diuVar);
        RecyclerView recyclerView = this.e;
        recyclerView.G = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        int[] iArr = dij.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = con.a;
        col.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.d.V(typedArrayObtainStyledAttributes.getInt(0, 0));
            ((dix) this.i).e();
            typedArrayObtainStyledAttributes.recycle();
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView2 = this.e;
            AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = new AmbientLifecycleObserver.AmbientLifecycleCallback.CC(null, null);
            if (recyclerView2.x == null) {
                recyclerView2.x = new ArrayList();
            }
            recyclerView2.x.add(cc);
            this.f = new dip(this);
            dip dipVar = this.f;
            RecyclerView recyclerView3 = this.e;
            this.r = new ejs(dipVar);
            diy diyVar = new diy(this);
            this.o = diyVar;
            diyVar.e(recyclerView3);
            this.e.az(this.f);
            this.e.setOverScrollMode(getOverScrollMode());
            dim dimVar = new dim();
            this.p = dimVar;
            this.f.f = dimVar;
            dir dirVar = new dir(this);
            dis disVar = new dis(this);
            dimVar.d(dirVar);
            this.p.d(disVar);
            AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc2 = this.i;
            this.e.setImportantForAccessibility(2);
            dix dixVar = (dix) cc2;
            dixVar.b = new diw(dixVar);
            ViewPager2 viewPager2 = dixVar.a;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.p.d(this.a);
            din dinVar = new din();
            this.q = dinVar;
            this.p.d(dinVar);
            RecyclerView recyclerView4 = this.e;
            attachViewToParent(recyclerView4, 0, recyclerView4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        return this.d.k == 1 ? 1 : 0;
    }

    public final ki b() {
        return this.e.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        ki kiVarB;
        if (this.m == -1 || (kiVarB = b()) == 0) {
            return;
        }
        if (this.n != null) {
            if (kiVarB instanceof dik) {
                ((dik) kiVarB).b();
            }
            this.n = null;
        }
        int iMax = Math.max(0, Math.min(this.m, kiVarB.a() - 1));
        this.b = iMax;
        this.m = -1;
        this.e.Z(iMax);
        ((dix) this.i).e();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.e.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.e.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        h();
        e(i, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof dja) {
            int i = ((dja) parcelable).a;
            sparseArray.put(this.e.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e(int i, boolean z) {
        ki kiVarB = b();
        if (kiVarB == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (kiVarB.a() > 0) {
            int iMin = Math.min(Math.max(i, 0), kiVarB.a() - 1);
            if (iMin == this.b && this.f.s()) {
                return;
            }
            int i2 = this.b;
            if (iMin == i2) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            this.b = iMin;
            ((dix) this.i).e();
            double d = i2;
            if (!this.f.s()) {
                dip dipVar = this.f;
                dipVar.r();
                dio dioVar = dipVar.c;
                d = dioVar.a + dioVar.b;
            }
            dip dipVar2 = this.f;
            dipVar2.a = true != z ? 3 : 2;
            int i3 = dipVar2.d;
            dipVar2.d = iMin;
            dipVar2.q(2);
            if (i3 != iMin) {
                dipVar2.p(iMin);
            }
            if (!z) {
                this.e.Z(iMin);
                return;
            }
            double d2 = iMin;
            if (Math.abs(d2 - d) <= 3.0d) {
                this.e.af(iMin);
                return;
            }
            this.e.Z(d2 > d ? iMin - 3 : iMin + 3);
            RecyclerView recyclerView = this.e;
            recyclerView.post(new djb(iMin, recyclerView));
        }
    }

    public final boolean g() {
        return this.d.aq() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h() {
        Object obj = this.r.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = this.i;
        cpt cptVar = new cpt(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ((dix) cc).a;
        if (viewPager2.b() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.a() == 1) {
            iA = viewPager2.b().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.b().a();
            iA = 1;
        }
        cptVar.o(ejs.q(iA, iA2, 0));
        ki kiVarB = viewPager2.b();
        if (kiVarB == null || (iA3 = kiVarB.a()) == 0 || !viewPager2.g) {
            return;
        }
        if (viewPager2.b > 0) {
            cptVar.g(8192);
        }
        if (viewPager2.b < iA3 - 1) {
            cptVar.g(4096);
        }
        cptVar.x(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        Rect rect = this.k;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.l;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.e.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.c) {
            f();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.e, i, i2);
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredState = this.e.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dja)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dja djaVar = (dja) parcelable;
        super.onRestoreInstanceState(djaVar.getSuperState());
        this.m = djaVar.b;
        this.n = djaVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        dja djaVar = new dja(super.onSaveInstanceState());
        djaVar.a = this.e.getId();
        int i = this.m;
        if (i == -1) {
            i = this.b;
        }
        djaVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            djaVar.c = parcelable;
            return djaVar;
        }
        Object obj = this.e.l;
        if (obj instanceof dik) {
            djaVar.c = ((dik) obj).a();
        }
        return djaVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.i.f(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        AmbientLifecycleObserver.AmbientLifecycleCallback.CC cc = this.i;
        if (!cc.f(i)) {
            throw new IllegalStateException();
        }
        dix dixVar = (dix) cc;
        dixVar.d(dixVar.a.b + (i == 8192 ? -1 : 1));
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((dix) this.i).e();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public final void f() {
        kh khVar = this.o;
        if (khVar == null) {
            throw new IllegalStateException(SHXc.ICoCGUXlM);
        }
        View viewB = khVar.b(this.d);
        if (viewB == null) {
            return;
        }
        int iBi = LinearLayoutManager.bi(viewB);
        if (iBi != this.b && this.f.b == 0) {
            this.p.c(iBi);
        }
        this.c = false;
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new dim();
        this.c = false;
        this.j = new diq(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new dim();
        this.c = false;
        this.j = new diq(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new dim();
        this.c = false;
        this.j = new diq(this);
        this.m = -1;
        this.g = true;
        this.h = -1;
        i(context, attributeSet);
    }
}
