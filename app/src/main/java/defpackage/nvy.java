package defpackage;

import android.transition.Transition;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvy implements Transition.TransitionListener {
    private final View a;

    public nvy(View view) {
        this.a = view;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setHasTransientState(false);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.setHasTransientState(true);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
