package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.ar.core.R;
import defpackage.mxm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptionsPanelCoordinator extends CoordinatorLayout {
    public mxm j;
    private AutobahnViewPager k;
    private float l;

    public OptionsPanelCoordinator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = mxm.PORTRAIT;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean k(View view, int i, int i2) {
        AutobahnViewPager autobahnViewPager = this.k;
        if (autobahnViewPager != null && (view instanceof NestedScrollView)) {
            view = autobahnViewPager;
        }
        return super.k(view, i, i2);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.k = (AutobahnViewPager) findViewById(R.id.viewpager);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AutobahnViewPager autobahnViewPager;
        boolean z;
        if (motionEvent.getActionMasked() == 0) {
            this.l = motionEvent.getY();
        }
        int actionMasked = motionEvent.getActionMasked();
        float y = motionEvent.getY() - this.l;
        if (actionMasked == 2 && y > 0.0f && (autobahnViewPager = this.k) != null && autobahnViewPager.p) {
            if (this.j.d()) {
                AutobahnViewPager autobahnViewPager2 = this.k;
                autobahnViewPager2.getClass();
                z = !autobahnViewPager2.getChildAt(autobahnViewPager2.e).findViewById(R.id.options_menu_view_internal).canScrollVertically(-1);
            } else {
                AutobahnViewPager autobahnViewPager3 = this.k;
                autobahnViewPager3.getClass();
                z = (this.j.equals(mxm.REVERSE_LANDSCAPE) && autobahnViewPager3.e == autobahnViewPager3.getChildCount() + (-1)) || (this.j.equals(mxm.LANDSCAPE) && autobahnViewPager3.e == 0);
            }
            if (z) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.cnv
    public final boolean t(View view, View view2, int i, int i2) {
        return this.j.d() && super.t(view, view2, i, i2);
    }
}
