package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fry implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fry(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final Executor b() {
        if (this.b != 0) {
            ExecutorService executorServiceB = ((fru) this.a).b();
            ScheduledExecutorService scheduledExecutorService = frp.a;
            return executorServiceB;
        }
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.a.a();
        ScheduledExecutorService scheduledExecutorService3 = frp.a;
        scheduledExecutorService2.getClass();
        return scheduledExecutorService2;
    }
}
