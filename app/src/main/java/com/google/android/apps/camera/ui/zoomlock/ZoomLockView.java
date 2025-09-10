package com.google.android.apps.camera.ui.zoomlock;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.R;
import defpackage.cvn;
import defpackage.fdi;
import defpackage.fve;
import defpackage.gzo;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.nkn;
import defpackage.nko;
import defpackage.nkp;
import defpackage.nkq;
import defpackage.nkr;
import defpackage.qpt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ZoomLockView extends RelativeLayout {
    public final boolean a;
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public AnimatorSet e;
    public ObjectAnimator f;
    public ImageView g;
    public boolean h;
    public mxm i;
    public mxj j;
    public AmbientModeSupport.AmbientController k;
    private AnimatorSet l;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = mxm.PORTRAIT;
        this.j = mxj.PHONE_LAYOUT;
        boolean z = false;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) {
            z = true;
        }
        this.a = z;
    }

    private static ObjectAnimator e(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new cvn());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    private final ObjectAnimator f(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", getResources().getDimension(R.dimen.zoom_lock_translation));
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new cvn());
        objectAnimatorOfFloat.setStartDelay(50L);
        return objectAnimatorOfFloat;
    }

    private final void g() {
        Trace.beginSection("ZoomLockView:applyOrientation");
        ImageView imageView = this.b;
        if (imageView != null) {
            qpt.aQ(imageView, this.i);
        }
        Trace.endSection();
    }

    private static final void h(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void a() {
        boolean z = this.a;
        float f = z ? this.j == mxj.TABLET_LAYOUT ? 1.137f : 1.322f : 1.5f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.c, "scaleX", f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.c, "scaleY", f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new cvn());
        objectAnimatorOfFloat2.setInterpolator(new cvn());
        objectAnimatorOfFloat.addListener(new nkn(this));
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z ? getResources().getColor(R.color.zoom_lock_freeway_red_color, null) : getResources().getColor(R.color.zoom_lock_button_start_color, null)), Integer.valueOf(z ? getResources().getColor(R.color.zoom_lock_freeway_red_color, null) : getResources().getColor(R.color.zoom_lock_button_end_color, null)));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new fve(this, 20));
        valueAnimatorOfObject.addListener(new nko(this));
        valueAnimatorOfObject.setStartDelay(50L);
        ObjectAnimator objectAnimatorF = f(this.g);
        ObjectAnimator objectAnimatorF2 = f(this.b);
        ObjectAnimator objectAnimatorE = e(this.g);
        ObjectAnimator objectAnimatorE2 = e(this.b);
        objectAnimatorE.addListener(new nkp(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.e.play(valueAnimatorOfObject).after(objectAnimatorOfFloat);
        this.e.play(objectAnimatorE).with(valueAnimatorOfObject);
        this.e.play(objectAnimatorE2).with(valueAnimatorOfObject);
        if (!z) {
            this.e.play(objectAnimatorF).with(valueAnimatorOfObject);
            this.e.play(objectAnimatorF2).with(valueAnimatorOfObject);
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setDuration(200L);
        this.f.setInterpolator(new cvn());
        this.f.addListener(new nkq(this));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.c, "scaleX", 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.c, "scaleY", 1.0f);
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat5.setDuration(200L);
        objectAnimatorOfFloat4.setInterpolator(new cvn());
        objectAnimatorOfFloat5.setInterpolator(new cvn());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.l = animatorSet2;
        animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.l.addListener(new nkr(this));
    }

    public final void b(mxm mxmVar) {
        this.i = mxmVar;
        g();
    }

    public final void c() {
        if (this.h) {
            return;
        }
        this.l.start();
    }

    public final void d(int i) {
        ImageView imageView;
        if (!this.a || (imageView = this.b) == null || this.g == null) {
            return;
        }
        h(imageView, i);
        h(this.g, i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("ZoomLockView:inflate");
        super.onFinishInflate();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.a) {
            layoutInflater.inflate(R.layout.zoom_lock_freeway_layout, (ViewGroup) this, true);
        } else {
            layoutInflater.inflate(R.layout.zoom_lock_layout, (ViewGroup) this, true);
        }
        this.b = (ImageView) findViewById(R.id.zoom_lock_icon);
        this.c = (ImageView) findViewById(R.id.lock_click_button);
        this.d = (ImageView) findViewById(R.id.lock_click_ring);
        this.g = (ImageView) findViewById(R.id.zoom_lock_bg);
        a();
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("ZoomLockView:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            g();
        }
        Trace.endSection();
    }
}
