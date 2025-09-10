package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.wear.ambient.AmbientMode;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpb {
    private static rpb e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new roz(this));
    public rpa c;
    public rpa d;

    private rpb() {
    }

    public static rpb a() {
        if (e == null) {
            e = new rpb();
        }
        return e;
    }

    public final void b(rpa rpaVar) {
        int i = rpaVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(rpaVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, rpaVar), i);
    }

    public final void c() {
        rpa rpaVar = this.d;
        if (rpaVar != null) {
            this.c = rpaVar;
            this.d = null;
            AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) ((WeakReference) rpaVar.c).get();
            if (ambientController == null) {
                this.c = null;
                return;
            }
            Object obj = ambientController.a;
            Handler handler = row.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(rpa rpaVar, int i) {
        AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) ((WeakReference) rpaVar.c).get();
        if (ambientController == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(rpaVar);
        Object obj = ambientController.a;
        Handler handler = row.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(AmbientMode.AmbientController ambientController) {
        synchronized (this.a) {
            if (g(ambientController)) {
                rpa rpaVar = this.c;
                if (!rpaVar.b) {
                    rpaVar.b = true;
                    this.b.removeCallbacksAndMessages(rpaVar);
                }
            }
        }
    }

    public final void f(AmbientMode.AmbientController ambientController) {
        synchronized (this.a) {
            if (g(ambientController)) {
                rpa rpaVar = this.c;
                if (rpaVar.b) {
                    rpaVar.b = false;
                    b(rpaVar);
                }
            }
        }
    }

    public final boolean g(AmbientMode.AmbientController ambientController) {
        rpa rpaVar = this.c;
        return rpaVar != null && rpaVar.a(ambientController);
    }

    public final boolean h(AmbientMode.AmbientController ambientController) {
        rpa rpaVar = this.d;
        return rpaVar != null && rpaVar.a(ambientController);
    }
}
