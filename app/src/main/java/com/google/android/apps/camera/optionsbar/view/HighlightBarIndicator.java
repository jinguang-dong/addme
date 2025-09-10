package com.google.android.apps.camera.optionsbar.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.ar.core.R;
import defpackage.fve;
import defpackage.nlr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HighlightBarIndicator extends LinearLayout {
    public Drawable a;
    private int b;
    private int c;
    private final AnimatorSet d;

    public HighlightBarIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new AnimatorSet();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = getContext().getColor(R.color.highlight_bar_default_text_color);
        this.c = getContext().getColor(R.color.camera_protection_background);
        Drawable drawable = ((AppCompatImageView) findViewById(R.id.highlightBar_best_take_icon)).getDrawable();
        this.a = drawable;
        if (drawable != null) {
            drawable.setTint(this.b);
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) getBackground();
        animationDrawable.setEnterFadeDuration(1400);
        animationDrawable.setExitFadeDuration(1400);
        animationDrawable.setOneShot(false);
        if (getVisibility() == 0) {
            animationDrawable.start();
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.b, this.c);
        valueAnimatorOfArgb.addUpdateListener(new fve(this, 13));
        this.d.setDuration(167L).playTogether(valueAnimatorOfArgb);
        new nlr(this, false);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (z) {
            Drawable background = getBackground();
            if (background instanceof AnimationDrawable) {
                ((AnimationDrawable) background).start();
                return;
            }
            return;
        }
        Drawable background2 = getBackground();
        if (background2 instanceof AnimationDrawable) {
            ((AnimationDrawable) background2).stop();
        }
    }
}
