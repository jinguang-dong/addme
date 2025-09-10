package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oou implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public oou(Looper looper, int i) {
        this.b = i;
        this.a = new ols(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public oou(int i) {
        this.b = i;
        this.a = new ols(Looper.getMainLooper());
    }
}
