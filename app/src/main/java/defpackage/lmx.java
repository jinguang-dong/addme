package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmx {
    public lnc a;
    private lng c;
    public long b = 0;
    private final Handler d = new Handler(Looper.getMainLooper());

    public final void a() {
        lng lngVar = this.c;
        rnt.x(lngVar);
        lngVar.d();
        e();
        f();
    }

    public final void b() {
        lng lngVar = this.c;
        rnt.x(lngVar);
        lngVar.c();
        e();
        f();
    }

    public final void c() {
        lnc lncVar = this.a;
        rnt.x(lncVar);
        if (SystemClock.uptimeMillis() - this.b > 300) {
            lncVar.d();
        } else {
            Handler handler = this.d;
            handler.removeCallbacks(new lmw(lncVar, 0));
            handler.postDelayed(new lmw(lncVar, 0), 300L);
        }
        e();
        f();
    }

    public final void d(ProgressOverlay progressOverlay) {
        this.a = new lnc(progressOverlay);
        lng lngVar = new lng(progressOverlay, this.a);
        this.c = lngVar;
        lngVar.a();
    }

    public final void e() {
        boolean z = this.c.b;
    }

    public final void f() {
        boolean z = this.a.b;
    }
}
