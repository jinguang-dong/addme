package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzw implements kiz {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ Runnable b;

    public kzw(ExecutorService executorService, Runnable runnable) {
        this.a = executorService;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.kiz
    public final syu a() {
        try {
            this.a.execute(this.b);
            return ske.M(true);
        } catch (RejectedExecutionException e) {
            ((sgt) ((sgt) kzx.a.c().i(e)).M((char) 3873)).s("Error executing task.");
            return ske.K();
        }
    }

    @Override // defpackage.kiz
    public final syu b() {
        return ske.K();
    }
}
