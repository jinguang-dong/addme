package com.google.android.apps.camera.whitebalance;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.luf;
import defpackage.luj;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.nkw;
import defpackage.qpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ManualWhiteBalanceUi extends FrameLayout {
    private nkw a;
    private mxm b;
    private mxj c;
    private luj d;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualWhiteBalanceUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = nkw.UNINITIALIZED;
        this.b = mxm.PORTRAIT;
        this.c = mxj.PHONE_LAYOUT;
        if (context instanceof fdi) {
            this.d = ((fdi) context).a();
        }
    }

    private final int f(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_width);
        return (i / 2) + (dimensionPixelSize / 2) + (getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_inset_size) / 2) + getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_margin_between_reset_btn);
    }

    public final ImageButton a() {
        return (ImageButton) findViewById(R.id.manual_wb_reset_button);
    }

    public final SeekBar b() {
        return (SeekBar) findViewById(R.id.manual_wb_slider);
    }

    public final ManualWhiteBalanceKnob c() {
        return (ManualWhiteBalanceKnob) findViewById(R.id.manual_wb_knob);
    }

    public final void d(mxm mxmVar, mxj mxjVar, nkw nkwVar) throws Resources.NotFoundException {
        this.b = mxmVar;
        this.c = mxjVar;
        this.a = nkwVar;
        if (c() != null) {
            qpt.aQ(c(), mxmVar);
        }
        if (a() != null) {
            qpt.aQ(a(), mxmVar);
        }
        e(b().getProgress(), b().getMax());
    }

    public final void e(int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_size);
        c().setTranslationY((-(i - (i2 / 2))) * ((b().getWidth() - dimensionPixelSize) / i2));
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.chameleon_layout, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.manual_wb_reset_button);
        imageButton.getClass();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageButton.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_height);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_width);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.manual_wb_reset_btn_inset_size);
        InsetDrawable insetDrawable = new InsetDrawable(getResources().getDrawable(R.drawable.ic_reset_outlines, null), dimensionPixelSize5);
        layoutParams.bottomMargin = f(dimensionPixelSize);
        layoutParams.leftMargin = ((Math.abs(dimensionPixelSize3 - dimensionPixelSize4) / 2) - dimensionPixelSize5) + dimensionPixelSize2;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(insetDrawable);
        SeekBar seekBar = (SeekBar) findViewById(R.id.manual_wb_slider);
        seekBar.getClass();
        seekBar.setRotation(270.0f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) seekBar.getLayoutParams();
        int dimensionPixelSize6 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize7 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_size);
        int dimensionPixelSize8 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_inset_size);
        int dimensionPixelSize9 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
        int dimensionPixelSize10 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_height);
        layoutParams2.width = dimensionPixelSize9;
        layoutParams2.leftMargin = ((-Math.abs(layoutParams2.width - dimensionPixelSize6)) / 2) + dimensionPixelSize10;
        seekBar.setLayoutParams(layoutParams2);
        seekBar.setPadding(0, 0, 0, 0);
        seekBar.setVisibility(0);
        ManualWhiteBalanceKnob manualWhiteBalanceKnob = (ManualWhiteBalanceKnob) findViewById(R.id.manual_wb_knob);
        manualWhiteBalanceKnob.getClass();
        InsetDrawable insetDrawable2 = new InsetDrawable(getResources().getDrawable(R.drawable.bg_manual_wb_knob, null), dimensionPixelSize8);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) manualWhiteBalanceKnob.getLayoutParams();
        layoutParams3.leftMargin = ((Math.abs(dimensionPixelSize6 - dimensionPixelSize7) / 2) - dimensionPixelSize8) + dimensionPixelSize10;
        manualWhiteBalanceKnob.setLayoutParams(layoutParams3);
        manualWhiteBalanceKnob.setBackground(insetDrawable2);
        manualWhiteBalanceKnob.setVisibility(0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d(this.b, this.c, this.a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (((Boolean) this.d.b(luf.aZ)).booleanValue()) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width);
            if (this.c.equals(mxj.JARVIS_LAYOUT)) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_width_jarvis);
            } else {
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_knob_size);
                ((ImageButton) findViewById(R.id.manual_wb_reset_button)).getClass();
                if (dimensionPixelSize2 + dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_margin_between_reset_btn) + r0.getMeasuredWidth() >= getMeasuredHeight() * 0.9f) {
                    dimensionPixelSize = (int) (dimensionPixelSize * 0.8f);
                }
            }
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_touch_area);
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_height);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b().getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.leftMargin = ((-Math.abs(layoutParams.width - dimensionPixelSize3)) / 2) + dimensionPixelSize4;
            ImageButton imageButtonA = a();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButtonA.getLayoutParams();
            layoutParams2.bottomMargin = f(dimensionPixelSize);
            imageButtonA.setLayoutParams(layoutParams2);
        }
    }
}
