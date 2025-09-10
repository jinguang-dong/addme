package defpackage;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gll implements LayoutTransition.TransitionListener {
    final /* synthetic */ glm a;

    public gll(glm glmVar) {
        this.a = glmVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) throws Resources.NotFoundException {
        AmbientModeSupport.AmbientController ambientController = this.a.c.w;
        if (ambientController != null) {
            ((gli) ambientController.a).i(nkw.VIDEO);
        }
        layoutTransition.removeTransitionListener(this);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        AmbientModeSupport.AmbientController ambientController = this.a.c.w;
        if (ambientController != null) {
            ((gli) ambientController.a).l(nkw.VIDEO);
        }
    }
}
