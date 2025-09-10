package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lmz extends Animatable2.AnimationCallback {
    final /* synthetic */ lnc a;

    public lmz(lnc lncVar) {
        this.a = lncVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        super.onAnimationEnd(drawable);
        lnc lncVar = this.a;
        if (lncVar.b) {
            lncVar.c.start();
        }
    }
}
