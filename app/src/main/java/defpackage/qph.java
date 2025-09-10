package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qph extends qpi {
    final /* synthetic */ qpj a;

    public qph(qpj qpjVar) {
        this.a = qpjVar;
    }

    @Override // defpackage.qpi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        qpj qpjVar = this.a;
        int i = qpjVar.b - 1;
        qpjVar.b = i;
        if (i == 0) {
            qpjVar.h = qna.a(activity.getClass());
            Handler handler = qpjVar.e;
            rnt.x(handler);
            Runnable runnable = qpjVar.f;
            rnt.x(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.qpi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qpj qpjVar = this.a;
        int i = qpjVar.b + 1;
        qpjVar.b = i;
        if (i == 1) {
            if (qpjVar.c) {
                Iterator it = qpjVar.g.iterator();
                while (it.hasNext()) {
                    ((qou) it.next()).l(qna.a(activity.getClass()));
                }
                qpjVar.c = false;
                return;
            }
            Handler handler = qpjVar.e;
            rnt.x(handler);
            Runnable runnable = qpjVar.f;
            rnt.x(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.qpi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qpj qpjVar = this.a;
        int i = qpjVar.a + 1;
        qpjVar.a = i;
        if (i == 1 && qpjVar.d) {
            for (qou qouVar : qpjVar.g) {
                qna.a(activity.getClass());
            }
            qpjVar.d = false;
        }
    }

    @Override // defpackage.qpi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        qpj qpjVar = this.a;
        qpjVar.a--;
        qna.a(activity.getClass());
        qpjVar.a();
    }
}
