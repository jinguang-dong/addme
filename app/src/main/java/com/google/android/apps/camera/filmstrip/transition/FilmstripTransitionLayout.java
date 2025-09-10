package com.google.android.apps.camera.filmstrip.transition;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import defpackage.fve;
import defpackage.haj;
import defpackage.hbj;
import defpackage.hnc;
import defpackage.hng;
import defpackage.hnh;
import defpackage.hni;
import defpackage.muj;
import defpackage.nlj;
import defpackage.nnk;
import defpackage.ojl;
import defpackage.owf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FilmstripTransitionLayout extends FrameLayout {
    public final ValueAnimator a;
    public boolean b;
    public FilmstripTransitionThumbnailView c;
    public View d;
    public boolean e;
    public hnh f;
    public owf g;
    public nnk h;
    public hnc i;
    public hbj j;

    public FilmstripTransitionLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.b = false;
        this.i = null;
        this.e = true;
        setVisibility(4);
        b(0.0f);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new fve(this, 5, null));
        valueAnimatorOfFloat.addListener(new hng(this));
    }

    public final hni a() {
        float f;
        float f2;
        this.d.getClass();
        SizeF sizeF = new SizeF(this.c.a().getWidth(), this.c.a().getHeight());
        View view = this.d;
        if (view instanceof ThumbnailView) {
            ThumbnailView thumbnailView = (ThumbnailView) view;
            float f3 = thumbnailView.g;
            f = thumbnailView.h;
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        Point pointBh = ojl.bh(view);
        RectF rectF = new RectF(pointBh.x, pointBh.y, pointBh.x + f, pointBh.y + f);
        RectF rectF2 = new RectF(nlj.m(getRootView())[0], r4[1], r8 + r0.getWidth(), r4[1] + r0.getHeight());
        Point pointF = nlj.f(getContext());
        RectF rectF3 = new RectF(0.0f, 0.0f, pointF.x, pointF.y);
        if (c()) {
            rectF3.bottom -= (rectF3.bottom - rectF3.top) * 0.5f;
        }
        return new hni(sizeF, rectF2, rectF3, rectF, f2);
    }

    public final void b(float f) {
        setBackgroundColor(Color.argb((int) (f * 255.0f), 0, 0, 0));
    }

    public final boolean c() {
        String strF;
        hbj hbjVar = this.j;
        return (hbjVar == null || this.h == null || this.g == null || (strF = hbjVar.f(haj.b)) == null || !this.h.b(strF) || ((muj) this.g.dL()).b != 5) ? false : true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (FilmstripTransitionThumbnailView) findViewById(com.google.ar.core.R.id.transition_thumbnail_view);
    }
}
