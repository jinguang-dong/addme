package defpackage;

import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rit implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public rit(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AmbientMode.AmbientController ambientController;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        cqr cqrVar = swipeDismissBehavior.a;
        if (cqrVar != null && cqrVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (ambientController = swipeDismissBehavior.f) == null) {
                return;
            }
            ambientController.i(this.b);
        }
    }
}
