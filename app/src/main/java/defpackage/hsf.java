package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsf extends AnimatorListenerAdapter {
    final /* synthetic */ float a;
    final /* synthetic */ CatcherView b;

    public hsf(CatcherView catcherView, float f) {
        this.a = f;
        this.b = catcherView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a == 0.95f) {
            CatcherView catcherView = this.b;
            Iterator it = catcherView.k.iterator();
            while (it.hasNext()) {
                ((hsg) it.next()).a();
            }
            catcherView.r = 3;
        }
        this.b.invalidate();
    }
}
