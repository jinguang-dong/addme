package com.google.android.apps.camera.ui.modeslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.ar.core.R;
import defpackage.mub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ModeSliderUi extends FrameLayout {
    private ModeSlider a;
    private RecordSpeedSlider b;

    public ModeSliderUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final RecordSpeedSlider a() {
        RecordSpeedSlider recordSpeedSlider = this.b;
        recordSpeedSlider.getClass();
        return recordSpeedSlider;
    }

    public final ModeSlider b() {
        ModeSlider modeSlider = this.a;
        modeSlider.getClass();
        return modeSlider;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.mode_slider_layout, this);
        ModeSlider modeSlider = (ModeSlider) findViewById(R.id.mode_slider);
        modeSlider.getClass();
        this.a = modeSlider;
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) findViewById(R.id.record_speed_slider);
        recordSpeedSlider.getClass();
        this.b = recordSpeedSlider;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            b().e = getMeasuredWidth();
            b().post(new mub(this, 14));
        }
    }
}
