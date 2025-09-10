package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quh implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public final /* synthetic */ qui b;

    public quh(qui quiVar, Application application) {
        this.b = quiVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        qui quiVar = this.b;
        que queVar = quiVar.n;
        if (queVar.b != null) {
            queVar = quiVar.o;
        }
        queVar.a = activity.getClass().getSimpleName();
        queVar.b = qqx.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qui quiVar = this.b;
        que queVar = quiVar.o;
        if (queVar.b == null) {
            queVar = quiVar.n;
        }
        if (queVar.d == null) {
            queVar.d = qqx.a();
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new quf(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new qug(this, viewFindViewById));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qui quiVar = this.b;
        que queVar = quiVar.o;
        if (queVar.b == null) {
            queVar = quiVar.n;
        }
        if (queVar.c == null) {
            queVar.c = qqx.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
