package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndg extends Animatable2.AnimationCallback {
    final /* synthetic */ ndh a;
    final /* synthetic */ AnimatedVectorDrawable b;

    public ndg(ndh ndhVar, AnimatedVectorDrawable animatedVectorDrawable) {
        this.a = ndhVar;
        this.b = animatedVectorDrawable;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        drawable.getClass();
        ShutterButton shutterButton = this.a.a;
        shutterButton.j.a = rwc.i(this.b);
        shutterButton.invalidate();
    }
}
