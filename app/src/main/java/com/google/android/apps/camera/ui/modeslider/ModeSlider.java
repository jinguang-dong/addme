package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.cme;
import defpackage.mys;
import defpackage.mzc;
import defpackage.mzd;
import defpackage.nlj;
import defpackage.qpt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModeSlider extends LinearLayout implements mzd {
    public final AtomicInteger a;
    public final int b;
    public mzc c;
    public final List d;
    public int e;
    public final LinearLayout.LayoutParams f;

    public ModeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AtomicInteger(-1);
        this.d = new ArrayList();
        this.e = 0;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.mode_slider_mode_side_padding);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.mode_slider_knob_height));
        this.f = layoutParams;
        layoutParams.gravity = 8388627;
    }

    public final void a() {
        if (this.e <= 0 || b() == -1) {
            return;
        }
        getChildAt(b()).setLayoutParams(this.f);
        int width = Integer.MAX_VALUE;
        ((TextView) getChildAt(b())).setMaxWidth(Integer.MAX_VALUE);
        int dimensionPixelSize = nlj.l(getContext()) ? getResources().getDimensionPixelSize(R.dimen.mode_slider_side_margin_felix_third) : getResources().getDimensionPixelSize(R.dimen.mode_slider_side_margin);
        int i = this.e - (dimensionPixelSize + dimensionPixelSize);
        int size = this.d.size();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mode_slider_side_padding);
        if (getMeasuredWidth() > i && size > 1) {
            width = ((i - (dimensionPixelSize2 + dimensionPixelSize2)) - getChildAt(b()).getWidth()) / (size - 1);
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != b()) {
                ((TextView) getChildAt(i2)).setMaxWidth(width);
            }
        }
    }

    @Override // defpackage.mzd
    public final int b() {
        return this.a.get();
    }

    @Override // defpackage.mzd
    public final void c() {
        setEnabled(false);
    }

    @Override // defpackage.mzd
    public final void d() {
        setEnabled(true);
    }

    @Override // defpackage.mzd
    public final void e() {
        setVisibility(8);
    }

    @Override // defpackage.mzd
    public final void f(mzc mzcVar) {
        throw null;
    }

    @Override // defpackage.mzd
    public final void g(int i) {
        throw null;
    }

    public final void h(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bv(i, "Illegal index: "));
        }
        AtomicInteger atomicInteger = this.a;
        if (i != atomicInteger.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    Drawable drawable = getContext().getDrawable(R.drawable.bg_mode_slider_knob);
                    if (drawable != null) {
                        j(textView, qpt.P(textView, R.attr.colorOnSecondary));
                        drawable.setTint(qpt.P(textView, R.attr.colorSecondary));
                        textView.setBackground(drawable);
                    }
                    textView.setSelected(true);
                } else {
                    textView.setBackground(null);
                    j(textView, qpt.P(textView, R.attr.colorOnSurface));
                    textView.setSelected(false);
                }
            }
            atomicInteger.set(i);
            a();
            mzc mzcVar = this.c;
            if (mzcVar != null) {
                if (!z) {
                    mzcVar.b(false);
                }
                if (z) {
                    performHapticFeedback(4);
                }
                if (z) {
                    return;
                }
                this.c.a(this, false);
            }
        }
    }

    @Override // defpackage.mzd
    public final void i() {
        setVisibility(0);
    }

    public final void j(TextView textView, int i) {
        cme.a(getContext(), R.font.google_sans_medium_compat, new mys(textView));
        textView.setTextColor(i);
    }

    @Override // defpackage.mzd
    public final boolean k() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
