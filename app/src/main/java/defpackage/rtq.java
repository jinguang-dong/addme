package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.ar.core.InstallActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtq extends AnimatorListenerAdapter {
    final /* synthetic */ InstallActivity a;

    public rtq(InstallActivity installActivity) {
        this.a = installActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.showSpinner();
    }
}
