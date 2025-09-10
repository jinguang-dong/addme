package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyi extends cyj {
    public volatile cyh a;
    public volatile cyh b;
    public List c;
    private Executor k;

    public cyi(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        cyh cyhVar = this.a;
        Executor executor = this.k;
        if (cyhVar.f == 1) {
            cyhVar.f = 2;
            executor.execute(cyhVar.c);
            return;
        }
        int i = cyhVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void b(List list) {
        this.c = list;
        cyd cydVar = this.j;
        if (cydVar != null) {
            if (cyc.b(2)) {
                Objects.toString(cydVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                cydVar.h(list);
            } else {
                cydVar.i(list);
            }
        }
    }

    final void c(cyh cyhVar) {
        if (this.b == cyhVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.cyj
    public final void d() {
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                cyh cyhVar = this.a;
                cyhVar.d.set(true);
                if (cyhVar.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}
