package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;
import defpackage.ckl;
import defpackage.cku;
import defpackage.fdi;
import defpackage.gzj;
import defpackage.hnl;
import defpackage.hnm;
import defpackage.ht;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusIndicatorAccessoryView extends ht {
    public Animator a;
    public View b;
    private final Duration c;
    private boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    FocusIndicatorAccessoryView(Context context) {
        super(context);
        this.a = new AnimatorSet();
        this.c = Duration.ofMillis(context.getResources().getInteger(R.integer.accessory_indicator_animation_millis));
        if (context instanceof fdi) {
            this.d = ((fdi) context).b().p(gzj.f);
        }
    }

    public final void a() {
        this.a.cancel();
    }

    public final void b() {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), android.R.animator.fade_in);
        this.a = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(this.c.toMillis());
        if (this.d) {
            this.a.setStartDelay(Duration.ofMillis(getContext().getResources().getInteger(R.integer.accessory_indicator_delay_start_animation_millis)).toMillis());
        }
        this.a.setTarget(this);
        this.a.addListener(new hnl(this));
        this.a.start();
    }

    public final void c(boolean z) throws Resources.NotFoundException {
        if (!z) {
            this.a.cancel();
            setVisibility(8);
            return;
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), android.R.animator.fade_out);
        this.a = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(this.c.toMillis());
        this.a.setTarget(this);
        this.a.addListener(new hnm(this));
        this.a.start();
    }

    public final void d(float f) {
        setImageAlpha((int) (f * 255.0f));
    }

    public final void e() {
        View view = this.b;
        view.getClass();
        ckl cklVar = (ckl) view.getLayoutParams();
        int iRound = cklVar.leftMargin + Math.round(this.b.getTranslationX());
        int iRound2 = cklVar.topMargin + Math.round(this.b.getTranslationY());
        Point point = new Point(iRound + (this.b.getWidth() / 2), iRound2 + (this.b.getHeight() / 2));
        int dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.square_focus_ring_size) / 2) + getHeight();
        Rect rect = new Rect(point.x - dimensionPixelSize, point.y - dimensionPixelSize, point.x + dimensionPixelSize, point.y + dimensionPixelSize);
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        cku ckuVar = new cku();
        int id = getId();
        int id2 = this.b.getId();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.focus_indicator_ring_view_size) / 2;
        ckuVar.g(constraintLayout);
        ckuVar.f(id, 3);
        ckuVar.f(id, 4);
        ckuVar.f(id, 6);
        ckuVar.f(id, 7);
        int i = dimensionPixelSize2 - dimensionPixelSize;
        if (rect.top >= 0) {
            ckuVar.j(id, 3, id2, 3, i);
            ckuVar.i(id, 6, id2, 6);
            ckuVar.i(id, 7, id2, 7);
        } else {
            ckuVar.i(id, 3, id2, 3);
            ckuVar.i(id, 4, id2, 4);
            if (rect.left > constraintLayout.getWidth() - rect.width()) {
                ckuVar.j(id, 6, id2, 6, i);
            } else {
                ckuVar.j(id, 7, id2, 7, i);
            }
        }
        ckuVar.c(constraintLayout);
        setTranslationX(this.b.getTranslationX());
        setTranslationY(this.b.getTranslationY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusIndicatorAccessoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AnimatorSet();
        this.c = Duration.ofMillis(context.getResources().getInteger(R.integer.accessory_indicator_animation_millis));
        if (context instanceof fdi) {
            this.d = ((fdi) context).b().p(gzj.f);
        }
    }
}
