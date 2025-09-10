package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpa extends qot implements qpe {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final qov c;
    private qna d;

    public qpa(qov qovVar) {
        this.c = qovVar;
    }

    @Override // defpackage.qpe
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.qpe
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qpe
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qpe
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (qpm.d(applicationContext, qpm.a(applicationContext, "Primes.onActivityStarted"))) {
            l(qna.a(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((sgt) qnj.a.c().M(5709)).s("Activity started with background importance");
        }
    }

    @Override // defpackage.qpe
    public final void g(Activity activity) {
        qna qnaVarA = qna.a(activity.getClass());
        this.d = qnaVarA;
        Context applicationContext = activity.getApplicationContext();
        if (qpm.d(applicationContext, qpm.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(qnaVarA);
    }

    @Override // defpackage.qpe
    public final void h(int i) {
        qna qnaVar;
        if (i >= 20 && (qnaVar = this.d) != null) {
            k(qnaVar);
        }
        this.d = null;
    }

    @Override // defpackage.qot
    public final void i(qna qnaVar) {
        this.c.i(qnaVar);
    }

    @Override // defpackage.qot
    public final void j(qna qnaVar) {
        this.c.j(qnaVar);
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
