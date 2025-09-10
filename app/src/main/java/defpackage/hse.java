package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;
import com.google.ar.core.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hse extends AnimatorListenerAdapter {
    final /* synthetic */ float a;
    final /* synthetic */ CatcherView b;

    public hse(CatcherView catcherView, float f) {
        this.a = f;
        this.b = catcherView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a == 1.0f) {
            CatcherView catcherView = this.b;
            Iterator it = catcherView.k.iterator();
            while (it.hasNext()) {
                ((hsg) it.next()).a();
            }
            catcherView.r = 2;
            catcherView.b.setColor(catcherView.g.getColor(R.color.gesture_confirm_state_color));
            catcherView.invalidate();
        }
    }
}
