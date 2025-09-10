package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dvm implements View.OnAttachStateChangeListener {
    private final dvn a;
    private final WeakReference b;

    public dvm(dvn dvnVar, Activity activity) {
        this.a = dvnVar;
        this.b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.b.get();
        IBinder iBinderY = cij.y(activity);
        if (activity == null || iBinderY == null) {
            return;
        }
        this.a.b(iBinderY, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
