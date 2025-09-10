package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oag extends FutureTask {
    final /* synthetic */ oah a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oag(oah oahVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.a = oahVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(String.valueOf(th))));
        }
        super.setException(th);
    }
}
