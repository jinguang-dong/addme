package com.google.android.apps.camera.optionsbar.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ar.core.R;
import defpackage.ctj;
import defpackage.cto;
import defpackage.ctp;
import defpackage.fdi;
import defpackage.fvy;
import defpackage.gzo;
import defpackage.hsj;
import defpackage.krs;
import defpackage.kse;
import defpackage.ltr;
import defpackage.mmr;
import defpackage.mmw;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.nlp;
import defpackage.nlr;
import defpackage.qpt;
import j$.util.DesugarArrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearMinibarImpl extends LinearLayoutCompat implements kse {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {R.id.minibar_item_ext1, R.id.minibar_item_ext2, R.id.minibar_item_ext3, R.id.minibar_item_ext4};
    private final boolean c;
    private boolean d;
    private TransitionDrawable e;
    private boolean i;
    private mxm j;
    private mxj k;

    /* JADX WARN: Multi-variable type inference failed */
    public LinearMinibarImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.j = mxm.PORTRAIT;
        this.k = mxj.PHONE_LAYOUT;
        this.c = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
    }

    private final View l() {
        return findViewById(R.id.minibar_item_face_light);
    }

    private final View m() {
        return findViewById(R.id.minibar_item_face_strong);
    }

    private final HighlightableIndicator n() {
        return (HighlightableIndicator) findViewById(R.id.minibar_item_best_take_auto);
    }

    private final void o(View view, int i) {
        int visibility = view.getVisibility();
        view.setVisibility(i);
        if (this.c) {
            nlr nlrVar = new nlr(view, false);
            if (i == 0) {
                if (visibility == 8) {
                    nlrVar.a();
                    nlrVar.d = 1;
                    View view2 = nlrVar.b;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.15f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 1.15f);
                    AnimatorSet animatorSet = nlrVar.c;
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setStartDelay(100L);
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(nlr.a);
                    animatorSet.addListener(new nlp(nlrVar));
                    animatorSet.start();
                }
            } else if (i == 8 && visibility == 0) {
                nlrVar.a();
                mmw mmwVar = mmr.a;
                nlrVar.d = 2;
                View view3 = nlrVar.b;
                cto ctoVar = new cto(view3, ctj.b, 0.0f);
                cto ctoVar2 = new cto(view3, ctj.c, 0.0f);
                ctp ctpVar = ctoVar.s;
                float f = mmwVar.b;
                ctpVar.e(f);
                float f2 = mmwVar.a;
                ctpVar.c(f2);
                ctoVar.g();
                ctp ctpVar2 = ctoVar2.s;
                ctpVar2.e(f);
                ctpVar2.c(f2);
                ctoVar2.g();
                ctoVar.i(new fvy(nlrVar, 4));
            }
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getVisibility() == 0) {
                i2++;
            }
        }
        boolean z = i2 > 0;
        if (z != this.i) {
            this.i = z;
            if (z) {
                this.e.startTransition(167);
            } else {
                this.e.reverseTransition(167);
            }
        }
    }

    @Override // defpackage.kse
    public final View a() {
        return findViewById(R.id.minibar_item_best_take_on);
    }

    @Override // defpackage.kse
    public final ImageView d(int i) {
        return (ImageView) findViewById(b[i]);
    }

    @Override // defpackage.kse
    public final void e() {
        this.d = true;
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        this.j = mxmVar;
        this.k = mxjVar;
        for (int i = 0; i < getChildCount(); i++) {
            qpt.aR(getChildAt(i), mxmVar, this.d);
        }
        this.d = false;
    }

    @Override // defpackage.kse
    public final void f(int i, boolean z, int i2, String str, krs krsVar) {
        ImageView imageViewD = d(i);
        if (!z) {
            o(imageViewD, 8);
            return;
        }
        imageViewD.setTag(krsVar);
        imageViewD.setImageResource(i2);
        imageViewD.setContentDescription(str);
        o(imageViewD, 0);
    }

    @Override // defpackage.kse
    public final void g(ltr ltrVar) {
        int iOrdinal = ltrVar.ordinal();
        if (iOrdinal == 0) {
            o(m(), 8);
            o(l(), 8);
        } else if (iOrdinal != 1) {
            o(m(), 0);
            o(l(), 8);
        } else {
            o(m(), 8);
            o(l(), 0);
        }
    }

    @Override // defpackage.kse
    public final boolean h() {
        return DesugarArrays.stream(new View[]{l(), m(), findViewById(R.id.minibar_item_motion_on_always), findViewById(R.id.minibar_item_motion_on_auto), a(), n()}).noneMatch(new hsj(12));
    }

    @Override // defpackage.kse
    public final void j(int i) {
        HighlightableIndicator highlightableIndicatorN = n();
        View viewA = a();
        int i2 = i - 1;
        if (i2 == 0 || i2 == 1) {
            o(highlightableIndicatorN, 8);
            o(viewA, 8);
        } else {
            o(highlightableIndicatorN, 8);
            o(viewA, 0);
        }
    }

    @Override // defpackage.kse
    public final void k(boolean z, int i, boolean z2) {
        int i2 = i - 1;
        if (i2 == 1) {
            HighlightableIndicator highlightableIndicatorN = n();
            if (z2) {
                if (!highlightableIndicatorN.c) {
                    highlightableIndicatorN.a(false);
                }
            } else if (highlightableIndicatorN.c) {
                highlightableIndicatorN.b(false);
            }
            o(highlightableIndicatorN, true != z ? 8 : 0);
            return;
        }
        if (i2 == 2 && z2) {
            HighlightableIndicator highlightableIndicator = (HighlightableIndicator) a();
            if (z) {
                if (highlightableIndicator.c) {
                    return;
                }
                highlightableIndicator.a(true);
            } else if (highlightableIndicator.c) {
                highlightableIndicator.b(true);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{getResources().getDrawable(R.drawable.new_minibar_background_off, null), getResources().getDrawable(R.drawable.new_minibar_background_on, null)});
        this.e = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        setBackground(this.e);
        n().a(false);
        new nlr(this, false);
        if (this.c) {
            getLayoutTransition().setInterpolator(2, AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.anticipate));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCenterX;
        int iWidth;
        super.onMeasure(i, i2);
        WindowInsets rootWindowInsets = getRootWindowInsets();
        int i3 = 19;
        if (rootWindowInsets != null && rootWindowInsets.getDisplayCutout() != null) {
            DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
            displayCutout.getClass();
            Rect bounds = ((Activity) getContext()).getWindowManager().getCurrentWindowMetrics().getBounds();
            int iOrdinal = this.j.ordinal();
            if (iOrdinal == 0) {
                iCenterX = displayCutout.getBoundingRectTop().centerX();
                iWidth = bounds.width();
            } else if (iOrdinal == 1) {
                iCenterX = displayCutout.getBoundingRectLeft().centerY();
                iWidth = bounds.height();
            } else if (iOrdinal == 2) {
                iCenterX = displayCutout.getBoundingRectRight().centerY();
                iWidth = bounds.height();
            } else if (iOrdinal != 3) {
                iCenterX = 0;
                iWidth = 0;
            } else {
                iCenterX = displayCutout.getBoundingRectBottom().centerX();
                iWidth = bounds.width();
            }
            boolean z = this.c;
            int iAbs = Math.abs(iCenterX - (iWidth / 2));
            if (!z && !this.k.a() && iAbs > 100) {
                i3 = 17;
            }
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.getClass();
        if (i3 != layoutParams.gravity) {
            layoutParams.gravity = i3;
            setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.kse
    public final void i() {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
