package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmo extends Animatable2.AnimationCallback {
    final /* synthetic */ pez a;

    public mmo(pez pezVar) {
        this.a = pezVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        drawable.getClass();
        this.a.g();
    }
}
