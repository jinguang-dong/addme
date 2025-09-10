package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AutobahnViewPager extends ViewPager {
    public boolean p;

    public AutobahnViewPager(Context context) {
        super(context);
        this.p = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.p && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("onMeasureAutobahnViewPager");
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(i, i2);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        Trace.endSection();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.p && super.onTouchEvent(motionEvent);
    }

    public AutobahnViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = true;
    }
}
