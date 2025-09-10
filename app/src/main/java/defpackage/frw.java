package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frw implements tzt {
    private final tzx a;

    public frw(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ScheduledExecutorService a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
        ScheduledExecutorService scheduledExecutorService2 = frp.a;
        scheduledExecutorService.getClass();
        return scheduledExecutorService;
    }
}
