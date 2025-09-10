package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmn extends AnimatorListenerAdapter {
    final /* synthetic */ rmp a;

    public rmn(rmp rmpVar) {
        this.a = rmpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        rmp rmpVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = rmpVar.k;
        if (list == null || rmpVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dhj) it.next()).b(rmpVar);
        }
    }
}
