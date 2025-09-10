package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rbi implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ rwc c;
    final /* synthetic */ Set d;
    final /* synthetic */ rwc e;
    final /* synthetic */ uem f;
    final /* synthetic */ sjp g;

    public rbi(Application application, rwc rwcVar, Set set, sjp sjpVar, rwc rwcVar2, uem uemVar) {
        this.b = application;
        this.c = rwcVar;
        this.d = set;
        this.g = sjpVar;
        this.e = rwcVar2;
        this.f = uemVar;
    }

    private final sbp a() {
        if (this.a) {
            int i = sbp.d;
            return sex.a;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        scl sclVar = new scl();
        sclVar.j(this.d);
        if (this.g.a() || ((Boolean) this.e.e(false)).booleanValue()) {
            sclVar.j((Iterable) ((tzu) this.f).a);
        }
        scn scnVarG = sclVar.g();
        sbk sbkVarE = sbp.e(scnVarG.size());
        sgj sgjVarListIterator = scnVarG.listIterator();
        while (sgjVarListIterator.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) sgjVarListIterator.next();
            rwc rwcVar = this.c;
            if (rwcVar.h()) {
                activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((rvu) rwcVar.c()).apply(activityLifecycleCallbacks);
            }
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            sbkVarE.h(activityLifecycleCallbacks);
        }
        return sbkVarE.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        sbp sbpVarA = a();
        int i = ((sex) sbpVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) sbpVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        rnt.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        rnt.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        sbp sbpVarA = a();
        int i = ((sex) sbpVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) sbpVarA.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rnt.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        rnt.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        rnt.L(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        rnt.L(this.a);
    }
}
