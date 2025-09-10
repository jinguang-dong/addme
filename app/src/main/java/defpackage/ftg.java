package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftg implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public ftg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Executor a() {
        tzx tzxVar = this.b;
        Object objA = this.a.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) tzxVar.a();
        return new fst(((gno) objA).g(scheduledExecutorService), (syu) this.c.a());
    }
}
