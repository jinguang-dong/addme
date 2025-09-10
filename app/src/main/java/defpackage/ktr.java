package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktr extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ OptionsPanelContent b;

    public ktr(OptionsPanelContent optionsPanelContent) {
        this.b = optionsPanelContent;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        if (this.a) {
            this.a = false;
        } else {
            this.b.f();
        }
    }
}
