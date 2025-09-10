package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmz implements Executor, qpe {
    public final syx a;
    private final qpf b;
    private final uem e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public qmz(syx syxVar, qpf qpfVar, uem uemVar) {
        this.a = syxVar;
        this.b = qpfVar;
        this.e = uemVar;
        Object obj = ((qqe) qpfVar.a).a;
        int i = qpg.c;
        if (((qpg) obj).b.get() > 0) {
            k();
        } else {
            qpfVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new kbs(this, 7), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.qpe
    public final void d(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else {
            if (this.f.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((rwc) ((tzu) this.e).a).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: qmy
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        qmz qmzVar = this.a;
                        qmzVar.a.schedule(new kbs(qmzVar, 6), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new kbs(this, 6), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
