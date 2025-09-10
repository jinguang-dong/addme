package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frl implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public frl(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public final uhf b() {
        int i = this.b;
        if (i == 0) {
            return ujp.aa(((fry) this.a).b());
        }
        if (i != 1) {
            return new uoe(((frw) this.a).a());
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
        scheduledExecutorService.getClass();
        return new uoe(scheduledExecutorService);
    }
}
