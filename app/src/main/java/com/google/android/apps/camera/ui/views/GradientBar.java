package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GradientBar extends View {
    public GradientBar(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("gradientBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    public GradientBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
