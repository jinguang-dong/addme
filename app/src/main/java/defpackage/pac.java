package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pac implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public pac(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ps a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.b.a();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.c.a();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.d.a();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        scheduledExecutorService3.getClass();
        scheduledExecutorService4.getClass();
        return new ps(scheduledExecutorService, scheduledExecutorService2, scheduledExecutorService3, scheduledExecutorService4, 96);
    }
}
