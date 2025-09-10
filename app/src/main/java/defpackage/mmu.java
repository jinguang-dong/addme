package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmu extends Animatable2.AnimationCallback {
    final /* synthetic */ mmv a;

    public mmu(mmv mmvVar) {
        this.a = mmvVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        mmv mmvVar = this.a;
        mmvVar.c = false;
        Iterator it = mmvVar.d.iterator();
        while (it.hasNext()) {
            ((Animatable2.AnimationCallback) it.next()).onAnimationEnd(drawable);
        }
    }
}
