package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fru implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fru(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public final ExecutorService b() {
        int i = this.b;
        if (i == 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
            ScheduledExecutorService scheduledExecutorService2 = frp.a;
            return new ovb(scheduledExecutorService);
        }
        if (i != 1) {
            syw sywVar = (syw) this.a.a();
            ScheduledExecutorService scheduledExecutorService3 = frp.a;
            sywVar.getClass();
            return sywVar;
        }
        ExecutorService executorService = (ExecutorService) this.a.a();
        ScheduledExecutorService scheduledExecutorService4 = frp.a;
        executorService.getClass();
        return executorService;
    }
}
