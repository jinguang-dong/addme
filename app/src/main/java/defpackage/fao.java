package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fao implements Executor {
    private final /* synthetic */ int a;

    public fao(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            fax.h(runnable);
        } else {
            runnable.run();
        }
    }
}
