package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ncy extends AnimatorListenerAdapter {
    final /* synthetic */ ndw a;
    final /* synthetic */ ndc b;

    public ncy(ndc ndcVar, ndw ndwVar) {
        this.a = ndwVar;
        this.b = ndcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShutterButton shutterButton = this.b.b;
        shutterButton.p = false;
        shutterButton.j.c(this.a.v);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.b.p = true;
    }
}
