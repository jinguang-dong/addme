package com.google.android.apps.camera.optionsbar.view;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.ar.core.R;
import defpackage.fvq;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.nlj;
import defpackage.owf;
import defpackage.rww;
import defpackage.sgt;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptionsPanelContent extends LinearLayout {
    private static final sgv i = sgv.g("com.google.android.apps.camera.optionsbar.view.OptionsPanelContent");
    public final rww a;
    public ViewGroup b;
    public int c;
    public owf d;
    public mxj e;
    public mxm f;
    public AnimatorSet g;
    public boolean h;
    private int j;
    private Size k;
    private int l;

    public OptionsPanelContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = mxj.PHONE_LAYOUT;
        this.f = mxm.PORTRAIT;
        this.h = false;
        this.a = new fvq(this, 7);
    }

    private final int h(mxm mxmVar) {
        return (mxmVar.d() || this.e.a()) ? this.l : c();
    }

    private final int i() throws Resources.NotFoundException {
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            int iB = b(this.f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_horizontal_padding_tablet);
            return iB - (dimensionPixelSize + dimensionPixelSize);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return c();
        }
        if (iOrdinal == 3) {
            return getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_width_tabletop);
        }
        throw new IllegalArgumentException("Unexpected layout decision ".concat(String.valueOf(String.valueOf(this.e))));
    }

    private final int j() {
        return this.c + this.j;
    }

    private final void k(mxm mxmVar) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (this.e.equals(mxj.TABLET_LAYOUT)) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_top_padding_tablet);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_bottom_padding_tablet);
        } else {
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_top_padding);
            dimensionPixelSize = mxmVar.d() ? getResources().getDimensionPixelSize(R.dimen.bottom_panel_content_bottom_padding_portrait) : 0;
            dimensionPixelSize2 = dimensionPixelSize3;
        }
        setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize);
    }

    public final float a() {
        mxm mxmVar;
        if (this.e.a()) {
            return 0.0f;
        }
        if (this.f.d() == (this.l > c())) {
            return 0.0f;
        }
        int iB = b(this.f);
        int iOrdinal = this.f.ordinal();
        if (iOrdinal == 0) {
            mxmVar = mxm.LANDSCAPE;
        } else if (iOrdinal == 1) {
            mxmVar = mxm.PORTRAIT;
        } else if (iOrdinal == 2) {
            mxmVar = mxm.REVERSE_PORTRAIT;
        } else {
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
            mxmVar = mxm.REVERSE_LANDSCAPE;
        }
        return Math.abs(iB - b(mxmVar));
    }

    public final int b(mxm mxmVar) {
        return this.e.equals(mxj.TABLET_LAYOUT) ? Math.min(this.k.getWidth(), getResources().getDimensionPixelSize(R.dimen.bottom_panel_height_tablet)) : j() + h(mxmVar);
    }

    public final int c() {
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            return Math.min(Math.max(getResources().getDimensionPixelSize(R.dimen.bottom_panel_min_width_tablet), this.l), Math.min(getResources().getDimensionPixelSize(R.dimen.bottom_panel_max_width_tablet), this.k.getHeight()));
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new IllegalArgumentException("Unexpected layout decision ".concat(String.valueOf(String.valueOf(this.e))));
        }
        Size size = this.k;
        return this.f.d() ? size.getWidth() : size.getHeight();
    }

    public final void d() {
        owf owfVar = this.d;
        Size size = owfVar == null ? null : (Size) owfVar.dL();
        if (size == null || (size.getWidth() == 0 && size.getHeight() == 0)) {
            ((sgt) i.c().M(3453)).s("windowSize is uninitialized, falling back to display metrics");
            size = new Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        }
        this.k = size;
    }

    public final void e() throws Resources.NotFoundException {
        int iMin;
        int dimensionPixelSize;
        int iJ;
        this.j = nlj.c((Activity) getContext(), (WindowInsets) this.a.fr());
        k(mxm.PORTRAIT);
        int i2 = i();
        int iOrdinal = this.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottom_panel_max_height);
                iJ = j();
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unexpected layout decision ".concat(String.valueOf(String.valueOf(this.e))));
                }
                dimensionPixelSize = getResources().getDisplayMetrics().heightPixels / 2;
                iJ = j();
            }
            iMin = dimensionPixelSize - iJ;
        } else {
            iMin = Math.min(getResources().getDimensionPixelSize(R.dimen.bottom_panel_max_width_tablet), this.k.getHeight());
        }
        measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE));
        this.l = getMeasuredHeight();
        g();
        f();
    }

    public final void f() throws Resources.NotFoundException {
        setRotation(this.f.d() ? 0.0f : this.f.c().e);
        k(this.f);
        int i2 = i();
        float f = i2 / 2.0f;
        setPivotX(f);
        setPivotY(f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = i2;
        layoutParams2.height = h(this.f);
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            layoutParams2.leftMargin = (c() - this.l) / 2;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            layoutParams2.leftMargin = 0;
        } else if (iOrdinal == 3) {
            layoutParams2.leftMargin = (c() - i2) / 2;
        }
        setLayoutParams(layoutParams2);
    }

    public final void g() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = c();
        layoutParams.height = b(this.f);
        this.b.setLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection("OptionsPanelContent onLayout");
        super.onLayout(z, i2, i3, i4, i5);
        Trace.endSection();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        Trace.beginSection("OptionsPanelContent onMeasure");
        super.onMeasure(i2, i3);
        Trace.endSection();
    }
}
