package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmh implements Runnable, Choreographer.FrameCallback, dnf, baq {
    public static long a;
    private final View b;
    private boolean d;
    private boolean f;
    private long g;
    private final bdp c = new bdp(new dnd[16]);
    private final Choreographer e = Choreographer.getInstance();

    public dmh(View view) {
        this.b = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
    }

    @Override // defpackage.baq
    public final void b() {
        this.f = false;
        this.b.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // defpackage.baq
    public final void cU() {
        this.f = true;
    }

    @Override // defpackage.dnf
    public final void d(dnd dndVar) {
        this.c.n(dndVar);
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        bdp bdpVar = this.c;
        if (bdpVar.b != 0 && this.d && this.f) {
            View view = this.b;
            if (view.getWindowVisibility() == 0) {
                qhz qhzVar = new qhz(Math.max(this.g, TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime())) + a);
                boolean z = false;
                while (true) {
                    if (bdpVar.b != 0) {
                        if (z) {
                            break;
                        }
                        if (qhzVar.a() <= 0 || ((dnd) bdpVar.a[0]).c(qhzVar)) {
                            z = true;
                        } else {
                            bdpVar.c(0);
                        }
                    } else if (!z) {
                        this.d = false;
                        return;
                    }
                }
                this.e.postFrameCallback(this);
                return;
            }
        }
        this.d = false;
    }

    @Override // defpackage.baq
    public final void a() {
    }
}
