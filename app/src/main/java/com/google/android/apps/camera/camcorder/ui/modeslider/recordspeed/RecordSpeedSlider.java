package com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.cme;
import defpackage.glm;
import defpackage.glo;
import defpackage.glq;
import defpackage.mzc;
import defpackage.mzd;
import defpackage.qpt;
import defpackage.ryo;
import defpackage.syj;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordSpeedSlider extends LinearLayout implements mzd {
    public final AtomicInteger a;
    public ryo b;
    public mzc c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public RecordSpeedSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AtomicInteger(-1);
        this.b = new ryo();
    }

    public final int a() {
        int size = this.b.r().size();
        int i = this.i;
        int i2 = i != 1 ? 0 : 1;
        if (i != 0) {
            return size + (i2 ^ 1);
        }
        throw null;
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
        this.c = mzcVar;
    }

    @Override // defpackage.mzd
    public final void g(int i) {
        h(i, false);
    }

    public final void h(int i, boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (i < 0) {
            throw new IllegalArgumentException(a.bv(i, "Illegal index: "));
        }
        AtomicInteger atomicInteger = this.a;
        if (i != atomicInteger.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    InsetDrawable insetDrawable = this.d ? (InsetDrawable) getContext().getDrawable(R.drawable.bg_record_speed_slider_knob_tablet) : (InsetDrawable) getContext().getDrawable(true != this.h ? R.drawable.bg_record_speed_slider_knob : R.drawable.bg_record_speed_slider_knob_freeway);
                    if (insetDrawable != null) {
                        l(textView, qpt.P(textView, R.attr.colorOnSecondary));
                        insetDrawable.setTint(qpt.P(textView, R.attr.colorSecondary));
                        textView.setBackground(insetDrawable);
                    }
                    textView.setSelected(true);
                    textView.sendAccessibilityEvent(4);
                    if (i == this.e) {
                        textView.getCompoundDrawables()[0].setTint(qpt.P(textView, R.attr.colorOnSecondary));
                    } else {
                        Drawable drawable = getContext().getDrawable(this.f);
                        int iP = qpt.P(textView, R.attr.colorOnSecondary);
                        if (drawable != null) {
                            drawable.setTint(iP);
                        }
                        int dimensionPixelSize3 = getResources().getDimensionPixelSize(true != this.h ? R.dimen.record_speed_slider_knob_compound_padding_between_text : R.dimen.record_speed_slider_knob_compound_padding_between_text_freeway);
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(dimensionPixelSize3);
                        if (this.d) {
                            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tablet_record_speed_slider_selected_knob_left_padding);
                            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.tablet_record_speed_slider_selected_knob_right_padding);
                        } else {
                            dimensionPixelSize = this.h ? this.g : getResources().getDimensionPixelSize(R.dimen.record_speed_slider_drawable_left_padding);
                            dimensionPixelSize2 = this.g;
                        }
                        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
                    }
                } else {
                    l(textView, qpt.P(textView, R.attr.colorOnSurface));
                    textView.setBackground(null);
                    textView.setSelected(false);
                    if (i2 == this.e) {
                        textView.getCompoundDrawables()[0].setTint(qpt.P(textView, R.attr.colorOnSurface));
                    } else {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(0);
                        int i3 = this.g;
                        textView.setPadding(i3, 0, i3, 0);
                    }
                }
            }
            atomicInteger.set(i);
            mzc mzcVar = this.c;
            if (mzcVar != null) {
                if (!z) {
                    mzcVar.b(false);
                }
                glm glmVar = (glm) this.c;
                glq glqVar = glmVar.a;
                if (!glqVar.d) {
                    glmVar.c.h(glqVar.f, i);
                }
                if (z && glmVar.c.k) {
                    syj.i(this);
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

    public final boolean j() {
        return getChildAt(this.e) != null && getChildAt(this.e).getVisibility() == 0;
    }

    @Override // defpackage.mzd
    public final boolean k() {
        return getVisibility() == 0;
    }

    public final void l(TextView textView, int i) {
        cme.a(getContext(), R.font.google_sans_medium_compat, new glo(textView));
        textView.setTextColor(i);
    }

    public final void m(int i) {
        if (i != this.e) {
            if (this.i == 0) {
                throw null;
            }
        } else {
            throw new IllegalArgumentException(i + " is the index for back option");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
