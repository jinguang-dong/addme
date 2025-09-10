package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frt implements tzt {
    private final tzx a;

    public frt(tzx tzxVar) {
        this.a = tzxVar;
    }

    public static syx c(ScheduledExecutorService scheduledExecutorService) {
        ScheduledExecutorService scheduledExecutorService2 = frp.a;
        syx syxVarB = ske.B(scheduledExecutorService);
        syxVarB.getClass();
        return syxVarB;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final syx a() {
        return c((ScheduledExecutorService) this.a.a());
    }
}
