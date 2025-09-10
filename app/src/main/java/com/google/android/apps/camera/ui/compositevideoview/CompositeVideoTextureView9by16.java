package com.google.android.apps.camera.ui.compositevideoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CompositeVideoTextureView9by16 extends CompositeVideoTextureView {
    public CompositeVideoTextureView9by16(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.round((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public CompositeVideoTextureView9by16(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompositeVideoTextureView9by16(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
