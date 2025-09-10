package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ann implements View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback, apm {
    public static long a;
    public boolean c;
    private final View d;
    private boolean e;
    private boolean g;
    private long h;
    public final PriorityQueue b = new PriorityQueue(11, new wp(3));
    private final Choreographer f = Choreographer.getInstance();
    private final jal i = new jal((byte[]) null);

    public ann(View view) {
        this.d = view;
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
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final boolean d() {
        jal jalVar = this.i;
        long jA = jalVar.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA);
        if (jA <= 0) {
            return true;
        }
        PriorityQueue priorityQueue = this.b;
        Object objPeek = priorityQueue.peek();
        objPeek.getClass();
        if (((apk) ((qev) objPeek).b).c(jalVar)) {
            return true;
        }
        priorityQueue.poll();
        return false;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.post(this);
    }

    @Override // defpackage.apm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(apk apkVar) {
        this.b.add(new qev(1, apkVar));
        a();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.h = j;
            this.d.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.d.removeCallbacks(this);
        this.f.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.e && this.g) {
            View view = this.d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                long jNanoTime = System.nanoTime();
                long j = a;
                this.c = jNanoTime > (j + j) + nanos;
                this.i.a = Math.max(this.h, nanos) + a;
                boolean zD = false;
                while (true) {
                    if (!priorityQueue.isEmpty()) {
                        if (zD) {
                            break;
                        }
                        if (this.c) {
                            Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
                                zD = d();
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            zD = d();
                        }
                    } else if (!zD) {
                        this.e = false;
                    }
                }
                this.f.postFrameCallback(this);
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.e = false;
    }
}
