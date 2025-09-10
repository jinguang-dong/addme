package androidx.wear.ambient;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0 implements Executor {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            runnable.run();
        } else {
            AmbientLifecycleObserverImpl.a(runnable);
        }
    }
}
