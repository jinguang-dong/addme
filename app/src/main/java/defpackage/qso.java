package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qso implements qpe {
    private final tzj a;
    private boolean b = false;
    private Activity c;

    public qso(tzj tzjVar, final rwc rwcVar, Executor executor) {
        this.a = tzjVar;
        executor.execute(new Runnable() { // from class: qsn
            @Override // java.lang.Runnable
            public final void run() {
                qso.i(this.a, rwcVar);
            }
        });
    }

    public static /* synthetic */ void i(qso qsoVar, rwc rwcVar) {
        if (!rwcVar.h() || ((Boolean) ((uem) rwcVar.c()).a()).booleanValue()) {
            synchronized (qsoVar) {
                qsoVar.b = true;
                Activity activity = qsoVar.c;
                if (activity != null) {
                    qsoVar.d(activity);
                }
                qsoVar.c = null;
            }
        }
    }

    @Override // defpackage.qpe
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((qss) this.a.a()).b(activity);
        } else {
            activity.equals(this.c);
        }
        this.c = null;
    }

    @Override // defpackage.qpe
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((qss) this.a.a()).d(activity);
        } else {
            this.c = activity;
        }
    }

    @Override // defpackage.qpe
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
