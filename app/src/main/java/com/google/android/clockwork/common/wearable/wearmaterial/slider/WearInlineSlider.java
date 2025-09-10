package com.google.android.clockwork.common.wearable.wearmaterial.slider;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.clockwork.common.wearable.wearmaterial.preference.WearInlineSliderPreference;
import com.google.ar.core.R;
import defpackage.dam;
import defpackage.dbd;
import defpackage.dbe;
import defpackage.ntd;
import defpackage.nwj;
import defpackage.nyj;
import defpackage.nyk;
import defpackage.nyn;
import defpackage.nyo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearInlineSlider extends LinearLayout {
    public final ImageView a;
    public float b;
    public float c;
    public float d;
    public float e;
    public WearInlineSliderPreference f;
    private final ImageView g;
    private final ImageView h;
    private final SliderProgressDrawable i;
    private final nyk j;
    private final nyn k;
    private final ObjectAnimator l;
    private final Runnable m;
    private boolean n;
    private boolean o;

    public WearInlineSlider(Context context) {
        this(context, null);
    }

    private final void l() {
        Runnable runnable = this.m;
        removeCallbacks(runnable);
        post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(float f, boolean z) {
        float fN;
        dbd dbdVar;
        float f2 = this.e;
        float f3 = this.b;
        if (f3 > 0.0f) {
            int iRound = Math.round((f - this.c) / f3);
            float f4 = this.c;
            fN = nwj.n((iRound * this.b) + f4, f4, this.d);
            this.e = fN;
        } else {
            fN = nwj.n(f, this.c, this.d);
            this.e = fN;
        }
        boolean z2 = fN != f2;
        WearInlineSliderPreference wearInlineSliderPreference = this.f;
        if (wearInlineSliderPreference != null && z2 && wearInlineSliderPreference.a != fN) {
            if (wearInlineSliderPreference.R(Float.valueOf(fN))) {
                wearInlineSliderPreference.k(fN, false);
            } else {
                g(wearInlineSliderPreference.a);
            }
            dam damVar = wearInlineSliderPreference.o;
            if (damVar != null) {
                damVar.a(wearInlineSliderPreference);
            } else {
                dbe dbeVar = wearInlineSliderPreference.k;
                if (dbeVar != null && (dbdVar = dbeVar.c) != null) {
                    dbdVar.C(wearInlineSliderPreference);
                }
            }
        }
        if (z || z2) {
            SliderProgressDrawable sliderProgressDrawable = this.i;
            float fillAmount = sliderProgressDrawable.getFillAmount();
            float f5 = this.o ? this.c - this.b : this.c;
            float f6 = this.e - f5;
            float f7 = this.d - f5;
            float f8 = f7 != 0.0f ? f6 / f7 : 0.0f;
            if (fillAmount != f8) {
                if (isLaidOut()) {
                    ObjectAnimator objectAnimator = this.l;
                    objectAnimator.cancel();
                    objectAnimator.setFloatValues(sliderProgressDrawable.getFillAmount(), f8);
                    objectAnimator.start();
                } else {
                    sliderProgressDrawable.setFillAmount(f8);
                }
            }
        }
        invalidate();
    }

    public final void a(CharSequence charSequence) {
        this.h.setContentDescription(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void d(boolean z) {
        if (this.n != z) {
            this.n = z;
            l();
        }
    }

    public final void e(boolean z) {
        if (this.o != z) {
            this.o = z;
            l();
        }
    }

    public final void f(float f) {
        if (this.b != f) {
            this.b = f;
            l();
        }
    }

    public final void g(float f) {
        if (this.e != f) {
            m(f, false);
        }
    }

    public final void h(float f) {
        if (this.c != f) {
            this.c = f;
            l();
        }
    }

    public final void i(float f) {
        if (this.d != f) {
            this.d = f;
            l();
        }
    }

    public final void j() {
        float fMax = Math.max(this.c, this.d);
        this.d = fMax;
        float f = this.b;
        if (f <= 0.0f || (fMax - this.c) % f > 0.0f) {
            f = fMax - this.c;
            this.b = f;
        }
        int i = 0;
        if (this.n) {
            float f2 = fMax - this.c;
            float f3 = f2 / f;
            if (f3 <= 8.0f && f2 % f == 0.0f) {
                i = (int) f3;
                if (this.o) {
                    i++;
                }
            }
        }
        m(this.e, true);
        SliderProgressDrawable sliderProgressDrawable = this.i;
        sliderProgressDrawable.d = i;
        sliderProgressDrawable.invalidateSelf();
        this.k.a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nyk nykVar = this.j;
        nykVar.a.clear();
        int dimension = (int) getContext().getResources().getDimension(R.dimen.inline_slider_button_touch_target_threshold);
        Rect rect = new Rect();
        ImageView imageView = this.h;
        imageView.getHitRect(rect);
        rect.right += dimension;
        nykVar.a(new TouchDelegate(rect, imageView));
        Rect rect2 = new Rect();
        ImageView imageView2 = this.g;
        imageView2.getHitRect(rect2);
        rect2.left -= dimension;
        nykVar.a(new TouchDelegate(rect2, imageView2));
        setTouchDelegate(nykVar);
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.inlineSliderStyle);
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_InlineSlider_Default);
    }

    public WearInlineSlider(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        SliderProgressDrawable sliderProgressDrawable = new SliderProgressDrawable();
        this.i = sliderProgressDrawable;
        this.m = new ntd(this, 12);
        setOrientation(0);
        setClipToOutline(true);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.wear_inline_slider, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.inline_slider_increment);
        this.g = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.inline_slider_decrement);
        this.h = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.inline_slider_progress);
        this.a = imageView3;
        this.j = new nyk((View) imageView.getParent());
        imageView3.setOutlineProvider(new nyo(context2.getResources().getDimensionPixelSize(R.dimen.inline_slider_progress_corner_radius)));
        imageView3.setClipToOutline(true);
        imageView3.setImageDrawable(sliderProgressDrawable);
        nyn nynVar = new nyn(imageView, imageView2);
        this.k = nynVar;
        nynVar.e = new AmbientModeSupport.AmbientController(this);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context2, R.animator.wear_slider_value_transition);
        this.l = objectAnimator;
        objectAnimator.setTarget(sliderProgressDrawable);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, nyj.a, i, i2);
        nynVar.a = typedArrayObtainStyledAttributes.getBoolean(5, false);
        nynVar.a();
        h(typedArrayObtainStyledAttributes.getFloat(2, 0.0f));
        i(typedArrayObtainStyledAttributes.getFloat(3, 1.0f));
        f(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        g(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        sliderProgressDrawable.a.setColor(typedArrayObtainStyledAttributes.getColor(9, 0));
        sliderProgressDrawable.b.setColor(typedArrayObtainStyledAttributes.getColor(13, 0));
        d(typedArrayObtainStyledAttributes.getBoolean(14, false));
        e(typedArrayObtainStyledAttributes.getBoolean(15, false));
        imageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(11));
        imageView2.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(8));
        sliderProgressDrawable.c.setColor(typedArrayObtainStyledAttributes.getColor(6, 0));
        a(typedArrayObtainStyledAttributes.getString(7));
        b(typedArrayObtainStyledAttributes.getString(10));
        c(typedArrayObtainStyledAttributes.getString(12));
        typedArrayObtainStyledAttributes.recycle();
        j();
    }
}
