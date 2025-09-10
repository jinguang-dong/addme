package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hng extends AnimatorListenerAdapter {
    final /* synthetic */ FilmstripTransitionLayout a;

    public hng(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.a = filmstripTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        hnc hncVar = this.a.i;
        if (hncVar != null) {
            hne hneVar = hncVar.b;
            hneVar.f.setVisibility(4);
            hneVar.h.setVisibility(0);
            hncVar.a.a(new CancellationException("Animation is cancelled"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.a;
        if (filmstripTransitionLayout.e) {
            filmstripTransitionLayout.setVisibility(4);
        }
        if (filmstripTransitionLayout.b) {
            filmstripTransitionLayout.b = false;
            return;
        }
        hnc hncVar = filmstripTransitionLayout.i;
        if (hncVar != null) {
            hne hneVar = hncVar.b;
            if (!hneVar.m.isDone()) {
                hncVar.a.f(hneVar.c());
                return;
            }
            CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
            ((sgt) ((sgt) hne.a.c().i(cancellationException)).M((char) 1375)).s("onTransitionEnd");
            hncVar.a.a(cancellationException);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.a;
        filmstripTransitionLayout.setVisibility(0);
        filmstripTransitionLayout.d.setVisibility(4);
    }
}
