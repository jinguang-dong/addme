package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnx extends AnimatorListenerAdapter {
    final /* synthetic */ CaptureFrameUi a;
    final /* synthetic */ mny b;

    public mnx(mny mnyVar, CaptureFrameUi captureFrameUi) {
        this.a = captureFrameUi;
        this.b = mnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mny mnyVar = this.b;
        synchronized (mnyVar.d) {
            if (mnyVar.c.equals(moa.HIDDEN)) {
                this.a.setVisibility(8);
            }
            mnyVar.b = mnyVar.c;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        mny mnyVar = this.b;
        synchronized (mnyVar.d) {
            if (!mnyVar.c.equals(moa.HIDDEN)) {
                this.a.setVisibility(0);
            }
        }
    }
}
