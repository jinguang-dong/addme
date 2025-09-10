package com.google.android.apps.camera.pro.feature.lens;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.lkb;
import defpackage.lkc;
import defpackage.owq;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LensFeatureControlsView extends FrameLayout {
    private static final Duration f = Duration.ofMillis(100);
    private static final Duration g = Duration.ofMillis(1500);
    public owq a;
    public View b;
    public View c;
    public View d;
    public boolean e;
    private GestureDetector h;
    private boolean i;
    private boolean j;

    public LensFeatureControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = null;
        this.i = false;
        this.e = false;
        this.j = false;
    }

    private final boolean b(MotionEvent motionEvent) {
        return motionEvent.getX() >= ((float) this.b.getLeft()) && motionEvent.getX() <= ((float) this.b.getRight()) && motionEvent.getY() >= ((float) this.b.getTop()) && motionEvent.getY() <= ((float) this.b.getBottom());
    }

    public final void a() {
        this.e = true;
        this.a.a(true);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.b.animate().alpha(0.0f);
        Duration duration = f;
        viewPropertyAnimatorAlpha.setDuration(duration.toMillis()).setStartDelay(0L);
        this.c.animate().alpha(1.0f).setDuration(duration.toMillis()).setStartDelay(0L).setListener(null);
        this.c.setVisibility(0);
        this.d = this.c;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.lens_toggle_controls);
        this.c = findViewById(R.id.lens_slider_container);
        this.d = this.b;
        this.h = new GestureDetector(getContext(), new lkb(this));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e && motionEvent.getAction() == 0 && !b(motionEvent)) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (!this.e && b(motionEvent)) {
                this.i = true;
            } else if (this.e) {
                a();
            }
        }
        if (this.i) {
            this.h.onTouchEvent(motionEvent);
        }
        if (!this.j && this.e) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            motionEvent.offsetLocation(-this.c.getX(), -this.c.getY());
            this.c.dispatchTouchEvent(motionEventObtain);
        }
        this.j = this.e;
        View view = this.d;
        if (view != null) {
            motionEvent.offsetLocation(-view.getX(), -view.getY());
            view.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.i = false;
            ViewPropertyAnimator viewPropertyAnimatorAlpha = this.b.animate().alpha(1.0f);
            Duration duration = f;
            ViewPropertyAnimator duration2 = viewPropertyAnimatorAlpha.setDuration(duration.toMillis());
            Duration duration3 = g;
            duration2.setStartDelay(duration3.toMillis());
            this.c.animate().alpha(0.0f).setDuration(duration.toMillis()).setStartDelay(duration3.toMillis()).setListener(new lkc(this));
        }
        return true;
    }
}
