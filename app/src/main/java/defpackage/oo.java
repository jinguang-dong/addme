package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oo implements Executor {
    private final /* synthetic */ int a;

    public oo(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            ((or) op.g().b).b.execute(runnable);
            return;
        }
        if (i == 1) {
            new Thread(runnable).start();
            return;
        }
        if (i == 2) {
            runnable.run();
        } else if (i != 3) {
            Logger logger = paz.a;
        } else {
            runnable.run();
        }
    }
}
