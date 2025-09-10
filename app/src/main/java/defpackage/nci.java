package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nci implements ValueAnimator.AnimatorUpdateListener {
    boolean a;
    final /* synthetic */ ShutterButton b;

    public nci(ShutterButton shutterButton) {
        this.b = shutterButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ndo ndoVar;
        if (this.a || (ndoVar = this.b.d) == null) {
            return;
        }
        ndoVar.c();
        this.a = true;
    }
}
