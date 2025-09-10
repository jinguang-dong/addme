package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmm extends AnimatorListenerAdapter {
    final /* synthetic */ rmp a;

    public rmm(rmp rmpVar) {
        this.a = rmpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        rmp rmpVar = this.a;
        List list = rmpVar.k;
        if (list == null || rmpVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dhj) it.next()).c(rmpVar);
        }
    }
}
