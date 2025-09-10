package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtg implements qpe {
    private final Window.OnFrameMetricsAvailableListener a;
    private final tzj b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public qtg(tzj tzjVar, syx syxVar, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
        this.b = tzjVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sgt, shi] */
    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                } catch (RuntimeException e) {
                    ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5752)).s("Failed to detach the frame metrics listener");
                }
            }
        }
    }

    @Override // defpackage.qpe
    public void b(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.qpe
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.qpe
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public synchronized void i() {
        this.d = true;
        k();
    }

    public synchronized void j() {
        this.d = false;
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
