package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oaq implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ oar a;

    public oaq(oar oarVar) {
        this.a = oarVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        obm obmVar = this.a.d;
        if (obmVar != null) {
            obmVar.o("Job execution failed", th);
        }
    }
}
