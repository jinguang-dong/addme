package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhl extends AnimatorListenerAdapter {
    final /* synthetic */ dho a;

    public dhl(dho dhoVar) {
        this.a = dhoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dho dhoVar = this.a;
        ArrayList arrayList = new ArrayList(dhoVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dhj) arrayList.get(i)).b(dhoVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dho dhoVar = this.a;
        ArrayList arrayList = new ArrayList(dhoVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dhj) arrayList.get(i)).c(dhoVar);
        }
    }
}
