package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edk implements Executor {
    final /* synthetic */ gga a;

    public edk(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) this.a.a).post(runnable);
    }
}
