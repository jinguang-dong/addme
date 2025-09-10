package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ap extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dg d;
    final /* synthetic */ aq e;

    public ap(ViewGroup viewGroup, View view, boolean z, dg dgVar, aq aqVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = dgVar;
        this.e = aqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c) {
            int i = this.d.h;
            view.getClass();
            a.aV(i, view, viewGroup);
        }
        aq aqVar = this.e;
        aqVar.a.a.f(aqVar);
        if (ch.X(2)) {
            Objects.toString(this.d);
        }
    }
}
