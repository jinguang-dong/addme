package defpackage;

import android.os.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcy {
    public final vdm a;
    final Executor b;
    final Executor c;
    public final /* synthetic */ vda d;

    public vcy(vda vdaVar, UrlRequest.Callback callback, Executor executor) {
        this.d = vdaVar;
        this.a = new vdm(callback);
        if (vdaVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new psi(executor, 2);
            this.c = executor;
        }
    }

    final void a(vdb vdbVar, String str) {
        try {
            b(new vcq(this.d, vdbVar, 5), str);
        } catch (RejectedExecutionException e) {
            this.d.b(new vbz("Exception posting task to executor", e));
        }
    }

    final void b(Runnable runnable, String str) {
        new jps("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str), 3, null);
        try {
            this.b.execute(new vcq(str, runnable, 10));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.d.d(new smv(this, 15), "maybeReportMetrics");
    }

    final void d() {
        a(new vcp(this, 5), "onResponseStarted");
    }
}
