package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.lang.Iterable$EL;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irh extends AnimatorListenerAdapter {
    final /* synthetic */ iri a;
    final /* synthetic */ iqq b;
    final /* synthetic */ irk c;

    public irh(irk irkVar, iri iriVar, iqq iqqVar) {
        this.a = iriVar;
        this.b = iqqVar;
        this.c = irkVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ?? r3 = this.c.s.a;
        iri iriVar = this.a;
        if (r3.containsKey(iriVar)) {
            iqq iqqVar = this.b;
            List list = (List) r3.get(iriVar);
            list.getClass();
            Iterable$EL.forEach(list, new ird(iqqVar, 3));
        }
    }
}
