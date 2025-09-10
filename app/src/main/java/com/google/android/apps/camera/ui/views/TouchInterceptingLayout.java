package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TouchInterceptingLayout extends FrameLayout {
    public TouchInterceptingLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchInterceptingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
