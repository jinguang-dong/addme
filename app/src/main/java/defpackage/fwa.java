package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.bottombar.ThumbnailView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwa extends AnimatorListenerAdapter {
    final /* synthetic */ ThumbnailView a;

    public fwa(ThumbnailView thumbnailView) {
        this.a = thumbnailView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ThumbnailView thumbnailView = this.a;
        fwb fwbVar = thumbnailView.q;
        if (fwbVar != null) {
            fwbVar.a();
            thumbnailView.a();
        }
        thumbnailView.k = null;
    }
}
