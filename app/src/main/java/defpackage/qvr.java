package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvr {
    public volatile qvv a = qvu.a;
    public volatile boolean b = true;
    public volatile qvo c;
    private final syj d;

    public qvr(Context context, Executor executor, qvu qvuVar, tzj tzjVar, boolean z, rwc rwcVar, uem uemVar, syj syjVar) {
        this.d = syjVar;
        this.c = syjVar.d(Integer.MAX_VALUE);
        b(new hym(this, context, tzjVar, executor, qvuVar, rwcVar.h() ? null : uemVar, 6), executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final void a(tzj tzjVar) {
        try {
            qpo qpoVar = (qpo) tzjVar.a();
            this.b = qpoVar.c();
            this.c = this.d.d(qpoVar.a());
        } catch (Throwable th) {
            ((sgt) ((sgt) qnj.a.c().i(th)).M((char) 5792)).s("Couldn't get config");
            this.b = false;
        }
    }
}
