package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import defpackage.qpt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraAppRootLayout extends GcaLayout {
    public CameraAppRootLayout(Context context) {
        super(context);
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setPadding(0, qpt.bj(getContext(), getDisplay()) ? getRootWindowInsets().getStableInsetTop() : 0, 0, 0);
    }

    public CameraAppRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraAppRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
