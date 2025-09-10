package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dwi {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public dwi(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public abstract syu a();

    public final dvx c() {
        return this.b.b;
    }

    public final Executor d() {
        return this.b.c;
    }

    public final void e(int i) {
        this.c.compareAndSet(-256, i);
    }

    public final boolean f() {
        return this.c.get() != -256;
    }
}
